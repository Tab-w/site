package com.eric.site.web.dao;

import com.eric.site.web.entity.User;
import com.eric.site.web.entity.UserExample.Criteria;
import com.eric.site.web.entity.UserExample.Criterion;
import com.eric.site.web.entity.UserExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class UserSqlProvider {

    public String countByExample(UserExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("sec_user");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(UserExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("sec_user");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(User record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("sec_user");
        
        if (record.getAddress() != null) {
            sql.VALUES("address", "#{address,jdbcType=VARCHAR}");
        }
        
        if (record.getAge() != null) {
            sql.VALUES("age", "#{age,jdbcType=INTEGER}");
        }
        
        if (record.getEmail() != null) {
            sql.VALUES("email", "#{email,jdbcType=VARCHAR}");
        }
        
        if (record.getEnabled() != null) {
            sql.VALUES("enabled", "#{enabled,jdbcType=VARCHAR}");
        }
        
        if (record.getFullname() != null) {
            sql.VALUES("fullname", "#{fullname,jdbcType=VARCHAR}");
        }
        
        if (record.getPassword() != null) {
            sql.VALUES("password", "#{password,jdbcType=VARCHAR}");
        }
        
        if (record.getPlainPassword() != null) {
            sql.VALUES("plainPassword", "#{plainPassword,jdbcType=VARCHAR}");
        }
        
        if (record.getSalt() != null) {
            sql.VALUES("salt", "#{salt,jdbcType=VARCHAR}");
        }
        
        if (record.getSex() != null) {
            sql.VALUES("sex", "#{sex,jdbcType=VARCHAR}");
        }
        
        if (record.getFid() != null) {
            sql.VALUES("fid", "#{fid,jdbcType=INTEGER}");
        }
        
        if (record.getType() != null) {
            sql.VALUES("type", "#{type,jdbcType=INTEGER}");
        }
        
        if (record.getUsername() != null) {
            sql.VALUES("username", "#{username,jdbcType=VARCHAR}");
        }
        
        if (record.getOrg() != null) {
            sql.VALUES("org", "#{org,jdbcType=INTEGER}");
        }
        
        if (record.getUser_mobile() != null) {
            sql.VALUES("user_mobile", "#{user_mobile,jdbcType=VARCHAR}");
        }
        
        if (record.getTid() != null) {
            sql.VALUES("tid", "#{tid,jdbcType=VARCHAR}");
        }
        
        if (record.getRemark() != null) {
            sql.VALUES("remark", "#{remark,jdbcType=VARCHAR}");
        }
        
        if (record.getCreate_user() != null) {
            sql.VALUES("create_user", "#{create_user,jdbcType=INTEGER}");
        }
        
        if (record.getCreate_time() != null) {
            sql.VALUES("create_time", "#{create_time,jdbcType=VARCHAR}");
        }
        
        if (record.getM_number() != null) {
            sql.VALUES("m_number", "#{m_number,jdbcType=VARCHAR}");
        }
        
        if (record.getPwdvalid() != null) {
            sql.VALUES("pwdvalid", "#{pwdvalid,jdbcType=VARCHAR}");
        }
        
        if (record.getDef_pwd() != null) {
            sql.VALUES("def_pwd", "#{def_pwd,jdbcType=VARCHAR}");
        }
        
        if (record.getStart_menu_id() != null) {
            sql.VALUES("start_menu_id", "#{start_menu_id,jdbcType=INTEGER}");
        }
        
        if (record.getPwdupdatetime() != null) {
            sql.VALUES("pwdupdatetime", "#{pwdupdatetime,jdbcType=VARCHAR}");
        }
        
        if (record.getPerson_id() != null) {
            sql.VALUES("person_id", "#{person_id,jdbcType=INTEGER}");
        }
        
        return sql.toString();
    }

    public String selectByExample(UserExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("address");
        sql.SELECT("age");
        sql.SELECT("email");
        sql.SELECT("enabled");
        sql.SELECT("fullname");
        sql.SELECT("password");
        sql.SELECT("plainPassword");
        sql.SELECT("salt");
        sql.SELECT("sex");
        sql.SELECT("fid");
        sql.SELECT("type");
        sql.SELECT("username");
        sql.SELECT("org");
        sql.SELECT("user_mobile");
        sql.SELECT("tid");
        sql.SELECT("remark");
        sql.SELECT("create_user");
        sql.SELECT("create_time");
        sql.SELECT("m_number");
        sql.SELECT("pwdvalid");
        sql.SELECT("def_pwd");
        sql.SELECT("start_menu_id");
        sql.SELECT("pwdupdatetime");
        sql.SELECT("person_id");
        sql.FROM("sec_user");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        User record = (User) parameter.get("record");
        UserExample example = (UserExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("sec_user");
        
        if (record.getId() != null) {
            sql.SET("id = #{record.id,jdbcType=INTEGER}");
        }
        
        if (record.getAddress() != null) {
            sql.SET("address = #{record.address,jdbcType=VARCHAR}");
        }
        
        if (record.getAge() != null) {
            sql.SET("age = #{record.age,jdbcType=INTEGER}");
        }
        
        if (record.getEmail() != null) {
            sql.SET("email = #{record.email,jdbcType=VARCHAR}");
        }
        
        if (record.getEnabled() != null) {
            sql.SET("enabled = #{record.enabled,jdbcType=VARCHAR}");
        }
        
        if (record.getFullname() != null) {
            sql.SET("fullname = #{record.fullname,jdbcType=VARCHAR}");
        }
        
        if (record.getPassword() != null) {
            sql.SET("password = #{record.password,jdbcType=VARCHAR}");
        }
        
        if (record.getPlainPassword() != null) {
            sql.SET("plainPassword = #{record.plainPassword,jdbcType=VARCHAR}");
        }
        
        if (record.getSalt() != null) {
            sql.SET("salt = #{record.salt,jdbcType=VARCHAR}");
        }
        
        if (record.getSex() != null) {
            sql.SET("sex = #{record.sex,jdbcType=VARCHAR}");
        }
        
        if (record.getFid() != null) {
            sql.SET("fid = #{record.fid,jdbcType=INTEGER}");
        }
        
        if (record.getType() != null) {
            sql.SET("type = #{record.type,jdbcType=INTEGER}");
        }
        
        if (record.getUsername() != null) {
            sql.SET("username = #{record.username,jdbcType=VARCHAR}");
        }
        
        if (record.getOrg() != null) {
            sql.SET("org = #{record.org,jdbcType=INTEGER}");
        }
        
        if (record.getUser_mobile() != null) {
            sql.SET("user_mobile = #{record.user_mobile,jdbcType=VARCHAR}");
        }
        
        if (record.getTid() != null) {
            sql.SET("tid = #{record.tid,jdbcType=VARCHAR}");
        }
        
        if (record.getRemark() != null) {
            sql.SET("remark = #{record.remark,jdbcType=VARCHAR}");
        }
        
        if (record.getCreate_user() != null) {
            sql.SET("create_user = #{record.create_user,jdbcType=INTEGER}");
        }
        
        if (record.getCreate_time() != null) {
            sql.SET("create_time = #{record.create_time,jdbcType=VARCHAR}");
        }
        
        if (record.getM_number() != null) {
            sql.SET("m_number = #{record.m_number,jdbcType=VARCHAR}");
        }
        
        if (record.getPwdvalid() != null) {
            sql.SET("pwdvalid = #{record.pwdvalid,jdbcType=VARCHAR}");
        }
        
        if (record.getDef_pwd() != null) {
            sql.SET("def_pwd = #{record.def_pwd,jdbcType=VARCHAR}");
        }
        
        if (record.getStart_menu_id() != null) {
            sql.SET("start_menu_id = #{record.start_menu_id,jdbcType=INTEGER}");
        }
        
        if (record.getPwdupdatetime() != null) {
            sql.SET("pwdupdatetime = #{record.pwdupdatetime,jdbcType=VARCHAR}");
        }
        
        if (record.getPerson_id() != null) {
            sql.SET("person_id = #{record.person_id,jdbcType=INTEGER}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("sec_user");
        
        sql.SET("id = #{record.id,jdbcType=INTEGER}");
        sql.SET("address = #{record.address,jdbcType=VARCHAR}");
        sql.SET("age = #{record.age,jdbcType=INTEGER}");
        sql.SET("email = #{record.email,jdbcType=VARCHAR}");
        sql.SET("enabled = #{record.enabled,jdbcType=VARCHAR}");
        sql.SET("fullname = #{record.fullname,jdbcType=VARCHAR}");
        sql.SET("password = #{record.password,jdbcType=VARCHAR}");
        sql.SET("plainPassword = #{record.plainPassword,jdbcType=VARCHAR}");
        sql.SET("salt = #{record.salt,jdbcType=VARCHAR}");
        sql.SET("sex = #{record.sex,jdbcType=VARCHAR}");
        sql.SET("fid = #{record.fid,jdbcType=INTEGER}");
        sql.SET("type = #{record.type,jdbcType=INTEGER}");
        sql.SET("username = #{record.username,jdbcType=VARCHAR}");
        sql.SET("org = #{record.org,jdbcType=INTEGER}");
        sql.SET("user_mobile = #{record.user_mobile,jdbcType=VARCHAR}");
        sql.SET("tid = #{record.tid,jdbcType=VARCHAR}");
        sql.SET("remark = #{record.remark,jdbcType=VARCHAR}");
        sql.SET("create_user = #{record.create_user,jdbcType=INTEGER}");
        sql.SET("create_time = #{record.create_time,jdbcType=VARCHAR}");
        sql.SET("m_number = #{record.m_number,jdbcType=VARCHAR}");
        sql.SET("pwdvalid = #{record.pwdvalid,jdbcType=VARCHAR}");
        sql.SET("def_pwd = #{record.def_pwd,jdbcType=VARCHAR}");
        sql.SET("start_menu_id = #{record.start_menu_id,jdbcType=INTEGER}");
        sql.SET("pwdupdatetime = #{record.pwdupdatetime,jdbcType=VARCHAR}");
        sql.SET("person_id = #{record.person_id,jdbcType=INTEGER}");
        
        UserExample example = (UserExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(User record) {
        SQL sql = new SQL();
        sql.UPDATE("sec_user");
        
        if (record.getAddress() != null) {
            sql.SET("address = #{address,jdbcType=VARCHAR}");
        }
        
        if (record.getAge() != null) {
            sql.SET("age = #{age,jdbcType=INTEGER}");
        }
        
        if (record.getEmail() != null) {
            sql.SET("email = #{email,jdbcType=VARCHAR}");
        }
        
        if (record.getEnabled() != null) {
            sql.SET("enabled = #{enabled,jdbcType=VARCHAR}");
        }
        
        if (record.getFullname() != null) {
            sql.SET("fullname = #{fullname,jdbcType=VARCHAR}");
        }
        
        if (record.getPassword() != null) {
            sql.SET("password = #{password,jdbcType=VARCHAR}");
        }
        
        if (record.getPlainPassword() != null) {
            sql.SET("plainPassword = #{plainPassword,jdbcType=VARCHAR}");
        }
        
        if (record.getSalt() != null) {
            sql.SET("salt = #{salt,jdbcType=VARCHAR}");
        }
        
        if (record.getSex() != null) {
            sql.SET("sex = #{sex,jdbcType=VARCHAR}");
        }
        
        if (record.getFid() != null) {
            sql.SET("fid = #{fid,jdbcType=INTEGER}");
        }
        
        if (record.getType() != null) {
            sql.SET("type = #{type,jdbcType=INTEGER}");
        }
        
        if (record.getUsername() != null) {
            sql.SET("username = #{username,jdbcType=VARCHAR}");
        }
        
        if (record.getOrg() != null) {
            sql.SET("org = #{org,jdbcType=INTEGER}");
        }
        
        if (record.getUser_mobile() != null) {
            sql.SET("user_mobile = #{user_mobile,jdbcType=VARCHAR}");
        }
        
        if (record.getTid() != null) {
            sql.SET("tid = #{tid,jdbcType=VARCHAR}");
        }
        
        if (record.getRemark() != null) {
            sql.SET("remark = #{remark,jdbcType=VARCHAR}");
        }
        
        if (record.getCreate_user() != null) {
            sql.SET("create_user = #{create_user,jdbcType=INTEGER}");
        }
        
        if (record.getCreate_time() != null) {
            sql.SET("create_time = #{create_time,jdbcType=VARCHAR}");
        }
        
        if (record.getM_number() != null) {
            sql.SET("m_number = #{m_number,jdbcType=VARCHAR}");
        }
        
        if (record.getPwdvalid() != null) {
            sql.SET("pwdvalid = #{pwdvalid,jdbcType=VARCHAR}");
        }
        
        if (record.getDef_pwd() != null) {
            sql.SET("def_pwd = #{def_pwd,jdbcType=VARCHAR}");
        }
        
        if (record.getStart_menu_id() != null) {
            sql.SET("start_menu_id = #{start_menu_id,jdbcType=INTEGER}");
        }
        
        if (record.getPwdupdatetime() != null) {
            sql.SET("pwdupdatetime = #{pwdupdatetime,jdbcType=VARCHAR}");
        }
        
        if (record.getPerson_id() != null) {
            sql.SET("person_id = #{person_id,jdbcType=INTEGER}");
        }
        
        sql.WHERE("id = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, UserExample example, boolean includeExamplePhrase) {
        if (example == null) {
            return;
        }
        
        String parmPhrase1;
        String parmPhrase1_th;
        String parmPhrase2;
        String parmPhrase2_th;
        String parmPhrase3;
        String parmPhrase3_th;
        if (includeExamplePhrase) {
            parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        } else {
            parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        }
        
        StringBuilder sb = new StringBuilder();
        List<Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }
                
                sb.append('(');
                List<Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    Criterion criterion = criterions.get(j);
                    if (firstCriterion) {
                        firstCriterion = false;
                    } else {
                        sb.append(" and ");
                    }
                    
                    if (criterion.isNoValue()) {
                        sb.append(criterion.getCondition());
                    } else if (criterion.isSingleValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase1, criterion.getCondition(), i, j));
                        } else {
                            sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j,criterion.getTypeHandler()));
                        }
                    } else if (criterion.isBetweenValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
                        } else {
                            sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j, criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
                        }
                    } else if (criterion.isListValue()) {
                        sb.append(criterion.getCondition());
                        sb.append(" (");
                        List<?> listItems = (List<?>) criterion.getValue();
                        boolean comma = false;
                        for (int k = 0; k < listItems.size(); k++) {
                            if (comma) {
                                sb.append(", ");
                            } else {
                                comma = true;
                            }
                            if (criterion.getTypeHandler() == null) {
                                sb.append(String.format(parmPhrase3, i, j, k));
                            } else {
                                sb.append(String.format(parmPhrase3_th, i, j, k, criterion.getTypeHandler()));
                            }
                        }
                        sb.append(')');
                    }
                }
                sb.append(')');
            }
        }
        
        if (sb.length() > 0) {
            sql.WHERE(sb.toString());
        }
    }
}