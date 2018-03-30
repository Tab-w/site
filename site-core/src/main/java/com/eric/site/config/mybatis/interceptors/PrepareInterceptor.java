package com.eric.site.config.mybatis.interceptors;

import com.eric.site.core.utils.SnowflakeIdWorker;
import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.mapping.SqlCommandType;
import org.apache.ibatis.plugin.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.lang.reflect.Field;
import java.util.Date;
import java.util.Properties;

/**
 * @author Eric
 */
@Intercepts({@Signature(type = Executor.class, method = "update", args = {MappedStatement.class, Object.class})})
public class PrepareInterceptor implements Interceptor {

    private Logger log = LoggerFactory.getLogger(PrepareInterceptor.class);

    @Autowired
    private SnowflakeIdWorker snowflakeIdWorker;

    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        MappedStatement mappedStatement = (MappedStatement) invocation.getArgs()[0];
        String methodName = invocation.getMethod().getName();
        SqlCommandType sqlCommandType = mappedStatement.getSqlCommandType();
        if ("update".equals(methodName)) {
            Object object = invocation.getArgs()[1];
            Date currentDate = new Date(System.currentTimeMillis());
            if (SqlCommandType.INSERT.equals(sqlCommandType)) {
                Field fieldId = object.getClass().getDeclaredField("id");
                fieldId.setAccessible(true);
                long id = snowflakeIdWorker.nextId();
                fieldId.set(object, id);
                log.info("插入操作前设置id:{}", id);
                Field fieldCreateTime = object.getClass().getDeclaredField("createTime");
                fieldCreateTime.setAccessible(true);
                fieldCreateTime.set(object, currentDate);
                log.info("插入操作时设置create_time:{}", currentDate);
            } else if (SqlCommandType.UPDATE.equals(sqlCommandType)) {
                Field fieldModifyTime = object.getClass().getDeclaredField("modifyTime");
                fieldModifyTime.setAccessible(true);
                fieldModifyTime.set(object, currentDate);
                log.info("更新操作时设置modify_time:{}", currentDate);
            }
        }
        Thread.sleep(1000L);
        return invocation.proceed();
    }

    @Override
    public Object plugin(Object target) {
        return Plugin.wrap(target, this);
    }

    @Override
    public void setProperties(Properties properties) {
    }
}