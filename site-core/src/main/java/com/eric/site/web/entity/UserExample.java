package com.eric.site.web.entity;

import java.util.ArrayList;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAgeIsNull() {
            addCriterion("age is null");
            return (Criteria) this;
        }

        public Criteria andAgeIsNotNull() {
            addCriterion("age is not null");
            return (Criteria) this;
        }

        public Criteria andAgeEqualTo(Integer value) {
            addCriterion("age =", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotEqualTo(Integer value) {
            addCriterion("age <>", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThan(Integer value) {
            addCriterion("age >", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("age >=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThan(Integer value) {
            addCriterion("age <", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThanOrEqualTo(Integer value) {
            addCriterion("age <=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeIn(List<Integer> values) {
            addCriterion("age in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotIn(List<Integer> values) {
            addCriterion("age not in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeBetween(Integer value1, Integer value2) {
            addCriterion("age between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("age not between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEnabledIsNull() {
            addCriterion("enabled is null");
            return (Criteria) this;
        }

        public Criteria andEnabledIsNotNull() {
            addCriterion("enabled is not null");
            return (Criteria) this;
        }

        public Criteria andEnabledEqualTo(String value) {
            addCriterion("enabled =", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotEqualTo(String value) {
            addCriterion("enabled <>", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledGreaterThan(String value) {
            addCriterion("enabled >", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledGreaterThanOrEqualTo(String value) {
            addCriterion("enabled >=", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledLessThan(String value) {
            addCriterion("enabled <", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledLessThanOrEqualTo(String value) {
            addCriterion("enabled <=", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledLike(String value) {
            addCriterion("enabled like", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotLike(String value) {
            addCriterion("enabled not like", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledIn(List<String> values) {
            addCriterion("enabled in", values, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotIn(List<String> values) {
            addCriterion("enabled not in", values, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledBetween(String value1, String value2) {
            addCriterion("enabled between", value1, value2, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotBetween(String value1, String value2) {
            addCriterion("enabled not between", value1, value2, "enabled");
            return (Criteria) this;
        }

        public Criteria andFullnameIsNull() {
            addCriterion("fullname is null");
            return (Criteria) this;
        }

        public Criteria andFullnameIsNotNull() {
            addCriterion("fullname is not null");
            return (Criteria) this;
        }

        public Criteria andFullnameEqualTo(String value) {
            addCriterion("fullname =", value, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameNotEqualTo(String value) {
            addCriterion("fullname <>", value, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameGreaterThan(String value) {
            addCriterion("fullname >", value, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameGreaterThanOrEqualTo(String value) {
            addCriterion("fullname >=", value, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameLessThan(String value) {
            addCriterion("fullname <", value, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameLessThanOrEqualTo(String value) {
            addCriterion("fullname <=", value, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameLike(String value) {
            addCriterion("fullname like", value, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameNotLike(String value) {
            addCriterion("fullname not like", value, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameIn(List<String> values) {
            addCriterion("fullname in", values, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameNotIn(List<String> values) {
            addCriterion("fullname not in", values, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameBetween(String value1, String value2) {
            addCriterion("fullname between", value1, value2, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameNotBetween(String value1, String value2) {
            addCriterion("fullname not between", value1, value2, "fullname");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPlainPasswordIsNull() {
            addCriterion("plainPassword is null");
            return (Criteria) this;
        }

        public Criteria andPlainPasswordIsNotNull() {
            addCriterion("plainPassword is not null");
            return (Criteria) this;
        }

        public Criteria andPlainPasswordEqualTo(String value) {
            addCriterion("plainPassword =", value, "plainPassword");
            return (Criteria) this;
        }

        public Criteria andPlainPasswordNotEqualTo(String value) {
            addCriterion("plainPassword <>", value, "plainPassword");
            return (Criteria) this;
        }

        public Criteria andPlainPasswordGreaterThan(String value) {
            addCriterion("plainPassword >", value, "plainPassword");
            return (Criteria) this;
        }

        public Criteria andPlainPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("plainPassword >=", value, "plainPassword");
            return (Criteria) this;
        }

        public Criteria andPlainPasswordLessThan(String value) {
            addCriterion("plainPassword <", value, "plainPassword");
            return (Criteria) this;
        }

        public Criteria andPlainPasswordLessThanOrEqualTo(String value) {
            addCriterion("plainPassword <=", value, "plainPassword");
            return (Criteria) this;
        }

        public Criteria andPlainPasswordLike(String value) {
            addCriterion("plainPassword like", value, "plainPassword");
            return (Criteria) this;
        }

        public Criteria andPlainPasswordNotLike(String value) {
            addCriterion("plainPassword not like", value, "plainPassword");
            return (Criteria) this;
        }

        public Criteria andPlainPasswordIn(List<String> values) {
            addCriterion("plainPassword in", values, "plainPassword");
            return (Criteria) this;
        }

        public Criteria andPlainPasswordNotIn(List<String> values) {
            addCriterion("plainPassword not in", values, "plainPassword");
            return (Criteria) this;
        }

        public Criteria andPlainPasswordBetween(String value1, String value2) {
            addCriterion("plainPassword between", value1, value2, "plainPassword");
            return (Criteria) this;
        }

        public Criteria andPlainPasswordNotBetween(String value1, String value2) {
            addCriterion("plainPassword not between", value1, value2, "plainPassword");
            return (Criteria) this;
        }

        public Criteria andSaltIsNull() {
            addCriterion("salt is null");
            return (Criteria) this;
        }

        public Criteria andSaltIsNotNull() {
            addCriterion("salt is not null");
            return (Criteria) this;
        }

        public Criteria andSaltEqualTo(String value) {
            addCriterion("salt =", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltNotEqualTo(String value) {
            addCriterion("salt <>", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltGreaterThan(String value) {
            addCriterion("salt >", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltGreaterThanOrEqualTo(String value) {
            addCriterion("salt >=", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltLessThan(String value) {
            addCriterion("salt <", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltLessThanOrEqualTo(String value) {
            addCriterion("salt <=", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltLike(String value) {
            addCriterion("salt like", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltNotLike(String value) {
            addCriterion("salt not like", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltIn(List<String> values) {
            addCriterion("salt in", values, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltNotIn(List<String> values) {
            addCriterion("salt not in", values, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltBetween(String value1, String value2) {
            addCriterion("salt between", value1, value2, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltNotBetween(String value1, String value2) {
            addCriterion("salt not between", value1, value2, "salt");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andFidIsNull() {
            addCriterion("fid is null");
            return (Criteria) this;
        }

        public Criteria andFidIsNotNull() {
            addCriterion("fid is not null");
            return (Criteria) this;
        }

        public Criteria andFidEqualTo(Integer value) {
            addCriterion("fid =", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidNotEqualTo(Integer value) {
            addCriterion("fid <>", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidGreaterThan(Integer value) {
            addCriterion("fid >", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidGreaterThanOrEqualTo(Integer value) {
            addCriterion("fid >=", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidLessThan(Integer value) {
            addCriterion("fid <", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidLessThanOrEqualTo(Integer value) {
            addCriterion("fid <=", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidIn(List<Integer> values) {
            addCriterion("fid in", values, "fid");
            return (Criteria) this;
        }

        public Criteria andFidNotIn(List<Integer> values) {
            addCriterion("fid not in", values, "fid");
            return (Criteria) this;
        }

        public Criteria andFidBetween(Integer value1, Integer value2) {
            addCriterion("fid between", value1, value2, "fid");
            return (Criteria) this;
        }

        public Criteria andFidNotBetween(Integer value1, Integer value2) {
            addCriterion("fid not between", value1, value2, "fid");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andOrgIsNull() {
            addCriterion("org is null");
            return (Criteria) this;
        }

        public Criteria andOrgIsNotNull() {
            addCriterion("org is not null");
            return (Criteria) this;
        }

        public Criteria andOrgEqualTo(Integer value) {
            addCriterion("org =", value, "org");
            return (Criteria) this;
        }

        public Criteria andOrgNotEqualTo(Integer value) {
            addCriterion("org <>", value, "org");
            return (Criteria) this;
        }

        public Criteria andOrgGreaterThan(Integer value) {
            addCriterion("org >", value, "org");
            return (Criteria) this;
        }

        public Criteria andOrgGreaterThanOrEqualTo(Integer value) {
            addCriterion("org >=", value, "org");
            return (Criteria) this;
        }

        public Criteria andOrgLessThan(Integer value) {
            addCriterion("org <", value, "org");
            return (Criteria) this;
        }

        public Criteria andOrgLessThanOrEqualTo(Integer value) {
            addCriterion("org <=", value, "org");
            return (Criteria) this;
        }

        public Criteria andOrgIn(List<Integer> values) {
            addCriterion("org in", values, "org");
            return (Criteria) this;
        }

        public Criteria andOrgNotIn(List<Integer> values) {
            addCriterion("org not in", values, "org");
            return (Criteria) this;
        }

        public Criteria andOrgBetween(Integer value1, Integer value2) {
            addCriterion("org between", value1, value2, "org");
            return (Criteria) this;
        }

        public Criteria andOrgNotBetween(Integer value1, Integer value2) {
            addCriterion("org not between", value1, value2, "org");
            return (Criteria) this;
        }

        public Criteria andUser_mobileIsNull() {
            addCriterion("user_mobile is null");
            return (Criteria) this;
        }

        public Criteria andUser_mobileIsNotNull() {
            addCriterion("user_mobile is not null");
            return (Criteria) this;
        }

        public Criteria andUser_mobileEqualTo(String value) {
            addCriterion("user_mobile =", value, "user_mobile");
            return (Criteria) this;
        }

        public Criteria andUser_mobileNotEqualTo(String value) {
            addCriterion("user_mobile <>", value, "user_mobile");
            return (Criteria) this;
        }

        public Criteria andUser_mobileGreaterThan(String value) {
            addCriterion("user_mobile >", value, "user_mobile");
            return (Criteria) this;
        }

        public Criteria andUser_mobileGreaterThanOrEqualTo(String value) {
            addCriterion("user_mobile >=", value, "user_mobile");
            return (Criteria) this;
        }

        public Criteria andUser_mobileLessThan(String value) {
            addCriterion("user_mobile <", value, "user_mobile");
            return (Criteria) this;
        }

        public Criteria andUser_mobileLessThanOrEqualTo(String value) {
            addCriterion("user_mobile <=", value, "user_mobile");
            return (Criteria) this;
        }

        public Criteria andUser_mobileLike(String value) {
            addCriterion("user_mobile like", value, "user_mobile");
            return (Criteria) this;
        }

        public Criteria andUser_mobileNotLike(String value) {
            addCriterion("user_mobile not like", value, "user_mobile");
            return (Criteria) this;
        }

        public Criteria andUser_mobileIn(List<String> values) {
            addCriterion("user_mobile in", values, "user_mobile");
            return (Criteria) this;
        }

        public Criteria andUser_mobileNotIn(List<String> values) {
            addCriterion("user_mobile not in", values, "user_mobile");
            return (Criteria) this;
        }

        public Criteria andUser_mobileBetween(String value1, String value2) {
            addCriterion("user_mobile between", value1, value2, "user_mobile");
            return (Criteria) this;
        }

        public Criteria andUser_mobileNotBetween(String value1, String value2) {
            addCriterion("user_mobile not between", value1, value2, "user_mobile");
            return (Criteria) this;
        }

        public Criteria andTidIsNull() {
            addCriterion("tid is null");
            return (Criteria) this;
        }

        public Criteria andTidIsNotNull() {
            addCriterion("tid is not null");
            return (Criteria) this;
        }

        public Criteria andTidEqualTo(String value) {
            addCriterion("tid =", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotEqualTo(String value) {
            addCriterion("tid <>", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidGreaterThan(String value) {
            addCriterion("tid >", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidGreaterThanOrEqualTo(String value) {
            addCriterion("tid >=", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidLessThan(String value) {
            addCriterion("tid <", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidLessThanOrEqualTo(String value) {
            addCriterion("tid <=", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidLike(String value) {
            addCriterion("tid like", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotLike(String value) {
            addCriterion("tid not like", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidIn(List<String> values) {
            addCriterion("tid in", values, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotIn(List<String> values) {
            addCriterion("tid not in", values, "tid");
            return (Criteria) this;
        }

        public Criteria andTidBetween(String value1, String value2) {
            addCriterion("tid between", value1, value2, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotBetween(String value1, String value2) {
            addCriterion("tid not between", value1, value2, "tid");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andCreate_userIsNull() {
            addCriterion("create_user is null");
            return (Criteria) this;
        }

        public Criteria andCreate_userIsNotNull() {
            addCriterion("create_user is not null");
            return (Criteria) this;
        }

        public Criteria andCreate_userEqualTo(Integer value) {
            addCriterion("create_user =", value, "create_user");
            return (Criteria) this;
        }

        public Criteria andCreate_userNotEqualTo(Integer value) {
            addCriterion("create_user <>", value, "create_user");
            return (Criteria) this;
        }

        public Criteria andCreate_userGreaterThan(Integer value) {
            addCriterion("create_user >", value, "create_user");
            return (Criteria) this;
        }

        public Criteria andCreate_userGreaterThanOrEqualTo(Integer value) {
            addCriterion("create_user >=", value, "create_user");
            return (Criteria) this;
        }

        public Criteria andCreate_userLessThan(Integer value) {
            addCriterion("create_user <", value, "create_user");
            return (Criteria) this;
        }

        public Criteria andCreate_userLessThanOrEqualTo(Integer value) {
            addCriterion("create_user <=", value, "create_user");
            return (Criteria) this;
        }

        public Criteria andCreate_userIn(List<Integer> values) {
            addCriterion("create_user in", values, "create_user");
            return (Criteria) this;
        }

        public Criteria andCreate_userNotIn(List<Integer> values) {
            addCriterion("create_user not in", values, "create_user");
            return (Criteria) this;
        }

        public Criteria andCreate_userBetween(Integer value1, Integer value2) {
            addCriterion("create_user between", value1, value2, "create_user");
            return (Criteria) this;
        }

        public Criteria andCreate_userNotBetween(Integer value1, Integer value2) {
            addCriterion("create_user not between", value1, value2, "create_user");
            return (Criteria) this;
        }

        public Criteria andCreate_timeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreate_timeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreate_timeEqualTo(String value) {
            addCriterion("create_time =", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeNotEqualTo(String value) {
            addCriterion("create_time <>", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeGreaterThan(String value) {
            addCriterion("create_time >", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeGreaterThanOrEqualTo(String value) {
            addCriterion("create_time >=", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeLessThan(String value) {
            addCriterion("create_time <", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeLessThanOrEqualTo(String value) {
            addCriterion("create_time <=", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeLike(String value) {
            addCriterion("create_time like", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeNotLike(String value) {
            addCriterion("create_time not like", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeIn(List<String> values) {
            addCriterion("create_time in", values, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeNotIn(List<String> values) {
            addCriterion("create_time not in", values, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeBetween(String value1, String value2) {
            addCriterion("create_time between", value1, value2, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeNotBetween(String value1, String value2) {
            addCriterion("create_time not between", value1, value2, "create_time");
            return (Criteria) this;
        }

        public Criteria andM_numberIsNull() {
            addCriterion("m_number is null");
            return (Criteria) this;
        }

        public Criteria andM_numberIsNotNull() {
            addCriterion("m_number is not null");
            return (Criteria) this;
        }

        public Criteria andM_numberEqualTo(String value) {
            addCriterion("m_number =", value, "m_number");
            return (Criteria) this;
        }

        public Criteria andM_numberNotEqualTo(String value) {
            addCriterion("m_number <>", value, "m_number");
            return (Criteria) this;
        }

        public Criteria andM_numberGreaterThan(String value) {
            addCriterion("m_number >", value, "m_number");
            return (Criteria) this;
        }

        public Criteria andM_numberGreaterThanOrEqualTo(String value) {
            addCriterion("m_number >=", value, "m_number");
            return (Criteria) this;
        }

        public Criteria andM_numberLessThan(String value) {
            addCriterion("m_number <", value, "m_number");
            return (Criteria) this;
        }

        public Criteria andM_numberLessThanOrEqualTo(String value) {
            addCriterion("m_number <=", value, "m_number");
            return (Criteria) this;
        }

        public Criteria andM_numberLike(String value) {
            addCriterion("m_number like", value, "m_number");
            return (Criteria) this;
        }

        public Criteria andM_numberNotLike(String value) {
            addCriterion("m_number not like", value, "m_number");
            return (Criteria) this;
        }

        public Criteria andM_numberIn(List<String> values) {
            addCriterion("m_number in", values, "m_number");
            return (Criteria) this;
        }

        public Criteria andM_numberNotIn(List<String> values) {
            addCriterion("m_number not in", values, "m_number");
            return (Criteria) this;
        }

        public Criteria andM_numberBetween(String value1, String value2) {
            addCriterion("m_number between", value1, value2, "m_number");
            return (Criteria) this;
        }

        public Criteria andM_numberNotBetween(String value1, String value2) {
            addCriterion("m_number not between", value1, value2, "m_number");
            return (Criteria) this;
        }

        public Criteria andPwdvalidIsNull() {
            addCriterion("pwdvalid is null");
            return (Criteria) this;
        }

        public Criteria andPwdvalidIsNotNull() {
            addCriterion("pwdvalid is not null");
            return (Criteria) this;
        }

        public Criteria andPwdvalidEqualTo(String value) {
            addCriterion("pwdvalid =", value, "pwdvalid");
            return (Criteria) this;
        }

        public Criteria andPwdvalidNotEqualTo(String value) {
            addCriterion("pwdvalid <>", value, "pwdvalid");
            return (Criteria) this;
        }

        public Criteria andPwdvalidGreaterThan(String value) {
            addCriterion("pwdvalid >", value, "pwdvalid");
            return (Criteria) this;
        }

        public Criteria andPwdvalidGreaterThanOrEqualTo(String value) {
            addCriterion("pwdvalid >=", value, "pwdvalid");
            return (Criteria) this;
        }

        public Criteria andPwdvalidLessThan(String value) {
            addCriterion("pwdvalid <", value, "pwdvalid");
            return (Criteria) this;
        }

        public Criteria andPwdvalidLessThanOrEqualTo(String value) {
            addCriterion("pwdvalid <=", value, "pwdvalid");
            return (Criteria) this;
        }

        public Criteria andPwdvalidLike(String value) {
            addCriterion("pwdvalid like", value, "pwdvalid");
            return (Criteria) this;
        }

        public Criteria andPwdvalidNotLike(String value) {
            addCriterion("pwdvalid not like", value, "pwdvalid");
            return (Criteria) this;
        }

        public Criteria andPwdvalidIn(List<String> values) {
            addCriterion("pwdvalid in", values, "pwdvalid");
            return (Criteria) this;
        }

        public Criteria andPwdvalidNotIn(List<String> values) {
            addCriterion("pwdvalid not in", values, "pwdvalid");
            return (Criteria) this;
        }

        public Criteria andPwdvalidBetween(String value1, String value2) {
            addCriterion("pwdvalid between", value1, value2, "pwdvalid");
            return (Criteria) this;
        }

        public Criteria andPwdvalidNotBetween(String value1, String value2) {
            addCriterion("pwdvalid not between", value1, value2, "pwdvalid");
            return (Criteria) this;
        }

        public Criteria andDef_pwdIsNull() {
            addCriterion("def_pwd is null");
            return (Criteria) this;
        }

        public Criteria andDef_pwdIsNotNull() {
            addCriterion("def_pwd is not null");
            return (Criteria) this;
        }

        public Criteria andDef_pwdEqualTo(String value) {
            addCriterion("def_pwd =", value, "def_pwd");
            return (Criteria) this;
        }

        public Criteria andDef_pwdNotEqualTo(String value) {
            addCriterion("def_pwd <>", value, "def_pwd");
            return (Criteria) this;
        }

        public Criteria andDef_pwdGreaterThan(String value) {
            addCriterion("def_pwd >", value, "def_pwd");
            return (Criteria) this;
        }

        public Criteria andDef_pwdGreaterThanOrEqualTo(String value) {
            addCriterion("def_pwd >=", value, "def_pwd");
            return (Criteria) this;
        }

        public Criteria andDef_pwdLessThan(String value) {
            addCriterion("def_pwd <", value, "def_pwd");
            return (Criteria) this;
        }

        public Criteria andDef_pwdLessThanOrEqualTo(String value) {
            addCriterion("def_pwd <=", value, "def_pwd");
            return (Criteria) this;
        }

        public Criteria andDef_pwdLike(String value) {
            addCriterion("def_pwd like", value, "def_pwd");
            return (Criteria) this;
        }

        public Criteria andDef_pwdNotLike(String value) {
            addCriterion("def_pwd not like", value, "def_pwd");
            return (Criteria) this;
        }

        public Criteria andDef_pwdIn(List<String> values) {
            addCriterion("def_pwd in", values, "def_pwd");
            return (Criteria) this;
        }

        public Criteria andDef_pwdNotIn(List<String> values) {
            addCriterion("def_pwd not in", values, "def_pwd");
            return (Criteria) this;
        }

        public Criteria andDef_pwdBetween(String value1, String value2) {
            addCriterion("def_pwd between", value1, value2, "def_pwd");
            return (Criteria) this;
        }

        public Criteria andDef_pwdNotBetween(String value1, String value2) {
            addCriterion("def_pwd not between", value1, value2, "def_pwd");
            return (Criteria) this;
        }

        public Criteria andStart_menu_idIsNull() {
            addCriterion("start_menu_id is null");
            return (Criteria) this;
        }

        public Criteria andStart_menu_idIsNotNull() {
            addCriterion("start_menu_id is not null");
            return (Criteria) this;
        }

        public Criteria andStart_menu_idEqualTo(Integer value) {
            addCriterion("start_menu_id =", value, "start_menu_id");
            return (Criteria) this;
        }

        public Criteria andStart_menu_idNotEqualTo(Integer value) {
            addCriterion("start_menu_id <>", value, "start_menu_id");
            return (Criteria) this;
        }

        public Criteria andStart_menu_idGreaterThan(Integer value) {
            addCriterion("start_menu_id >", value, "start_menu_id");
            return (Criteria) this;
        }

        public Criteria andStart_menu_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("start_menu_id >=", value, "start_menu_id");
            return (Criteria) this;
        }

        public Criteria andStart_menu_idLessThan(Integer value) {
            addCriterion("start_menu_id <", value, "start_menu_id");
            return (Criteria) this;
        }

        public Criteria andStart_menu_idLessThanOrEqualTo(Integer value) {
            addCriterion("start_menu_id <=", value, "start_menu_id");
            return (Criteria) this;
        }

        public Criteria andStart_menu_idIn(List<Integer> values) {
            addCriterion("start_menu_id in", values, "start_menu_id");
            return (Criteria) this;
        }

        public Criteria andStart_menu_idNotIn(List<Integer> values) {
            addCriterion("start_menu_id not in", values, "start_menu_id");
            return (Criteria) this;
        }

        public Criteria andStart_menu_idBetween(Integer value1, Integer value2) {
            addCriterion("start_menu_id between", value1, value2, "start_menu_id");
            return (Criteria) this;
        }

        public Criteria andStart_menu_idNotBetween(Integer value1, Integer value2) {
            addCriterion("start_menu_id not between", value1, value2, "start_menu_id");
            return (Criteria) this;
        }

        public Criteria andPwdupdatetimeIsNull() {
            addCriterion("pwdupdatetime is null");
            return (Criteria) this;
        }

        public Criteria andPwdupdatetimeIsNotNull() {
            addCriterion("pwdupdatetime is not null");
            return (Criteria) this;
        }

        public Criteria andPwdupdatetimeEqualTo(String value) {
            addCriterion("pwdupdatetime =", value, "pwdupdatetime");
            return (Criteria) this;
        }

        public Criteria andPwdupdatetimeNotEqualTo(String value) {
            addCriterion("pwdupdatetime <>", value, "pwdupdatetime");
            return (Criteria) this;
        }

        public Criteria andPwdupdatetimeGreaterThan(String value) {
            addCriterion("pwdupdatetime >", value, "pwdupdatetime");
            return (Criteria) this;
        }

        public Criteria andPwdupdatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("pwdupdatetime >=", value, "pwdupdatetime");
            return (Criteria) this;
        }

        public Criteria andPwdupdatetimeLessThan(String value) {
            addCriterion("pwdupdatetime <", value, "pwdupdatetime");
            return (Criteria) this;
        }

        public Criteria andPwdupdatetimeLessThanOrEqualTo(String value) {
            addCriterion("pwdupdatetime <=", value, "pwdupdatetime");
            return (Criteria) this;
        }

        public Criteria andPwdupdatetimeLike(String value) {
            addCriterion("pwdupdatetime like", value, "pwdupdatetime");
            return (Criteria) this;
        }

        public Criteria andPwdupdatetimeNotLike(String value) {
            addCriterion("pwdupdatetime not like", value, "pwdupdatetime");
            return (Criteria) this;
        }

        public Criteria andPwdupdatetimeIn(List<String> values) {
            addCriterion("pwdupdatetime in", values, "pwdupdatetime");
            return (Criteria) this;
        }

        public Criteria andPwdupdatetimeNotIn(List<String> values) {
            addCriterion("pwdupdatetime not in", values, "pwdupdatetime");
            return (Criteria) this;
        }

        public Criteria andPwdupdatetimeBetween(String value1, String value2) {
            addCriterion("pwdupdatetime between", value1, value2, "pwdupdatetime");
            return (Criteria) this;
        }

        public Criteria andPwdupdatetimeNotBetween(String value1, String value2) {
            addCriterion("pwdupdatetime not between", value1, value2, "pwdupdatetime");
            return (Criteria) this;
        }

        public Criteria andPerson_idIsNull() {
            addCriterion("person_id is null");
            return (Criteria) this;
        }

        public Criteria andPerson_idIsNotNull() {
            addCriterion("person_id is not null");
            return (Criteria) this;
        }

        public Criteria andPerson_idEqualTo(Integer value) {
            addCriterion("person_id =", value, "person_id");
            return (Criteria) this;
        }

        public Criteria andPerson_idNotEqualTo(Integer value) {
            addCriterion("person_id <>", value, "person_id");
            return (Criteria) this;
        }

        public Criteria andPerson_idGreaterThan(Integer value) {
            addCriterion("person_id >", value, "person_id");
            return (Criteria) this;
        }

        public Criteria andPerson_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("person_id >=", value, "person_id");
            return (Criteria) this;
        }

        public Criteria andPerson_idLessThan(Integer value) {
            addCriterion("person_id <", value, "person_id");
            return (Criteria) this;
        }

        public Criteria andPerson_idLessThanOrEqualTo(Integer value) {
            addCriterion("person_id <=", value, "person_id");
            return (Criteria) this;
        }

        public Criteria andPerson_idIn(List<Integer> values) {
            addCriterion("person_id in", values, "person_id");
            return (Criteria) this;
        }

        public Criteria andPerson_idNotIn(List<Integer> values) {
            addCriterion("person_id not in", values, "person_id");
            return (Criteria) this;
        }

        public Criteria andPerson_idBetween(Integer value1, Integer value2) {
            addCriterion("person_id between", value1, value2, "person_id");
            return (Criteria) this;
        }

        public Criteria andPerson_idNotBetween(Integer value1, Integer value2) {
            addCriterion("person_id not between", value1, value2, "person_id");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}