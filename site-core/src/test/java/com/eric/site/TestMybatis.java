package com.eric.site;

import com.eric.site.core.utils.SnowflakeIdWorker;
import com.eric.site.web.dao.UserMapper;
import com.eric.site.web.entity.User;
import com.eric.site.web.entity.UserExample;
import com.eric.site.web.service.Impl.UserServiceImpl;
import com.github.pagehelper.PageHelper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Random;

/**
 * @Author: Eric
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestMybatis {

    @Autowired
    private UserServiceImpl userServiceImpl;

    private SnowflakeIdWorker snowflakeIdWorker = new SnowflakeIdWorker(0L, 0L);

    @Test
    public void testCURD() {
        User user = new User();
        user.setId(snowflakeIdWorker.nextId());
        Random random = new Random();
        user.setUsername(String.valueOf(random.nextInt()));
        user.setPassword(String.valueOf(random.nextInt()));
        int count = userServiceImpl.insert(user);
        Assert.assertEquals(count, 1);
        user.setEmail("123@qq.com");
        userServiceImpl.updateByPrimaryKey(user);
        String email = userServiceImpl.selectByPrimaryKey(user.getId()).getEmail();
        Assert.assertEquals(email, "123@qq.com");
        count = userServiceImpl.deleteByPrimaryKey(user.getId());
        Assert.assertEquals(count, 1);
    }

    @Test
    public void testPage() {
        PageHelper.startPage(1, 10);
        List<User> userList1 = userServiceImpl.selectAll();
        if (userList1 != null) {
            for (User u : userList1) {
                System.out.println(u.getUsername());
            }
        }
        UserExample userExample = new UserExample();
        userExample.createCriteria().andIdGreaterThan(1000L);
        List<User> userList2 = userServiceImpl.selectByExample(userExample);
        Assert.assertNotNull(userList2);
    }
}
