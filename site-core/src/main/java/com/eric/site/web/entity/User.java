package com.eric.site.web.entity;

import java.io.Serializable;

public class User extends BaseEntity implements Serializable {
    private String address;

    private Integer age;

    private String email;

    private String enabled;

    private String fullname;

    private String password;

    private String plainPassword;

    private String salt;

    private String sex;

    private Integer fid;

    private Integer type;

    private String username;

    private Integer org;

    private String user_mobile;

    private String tid;

    private String remark;

    private Integer create_user;

    private String create_time;

    private String m_number;

    private String pwdvalid;

    private String def_pwd;

    private Integer start_menu_id;

    private String pwdupdatetime;

    private Integer person_id;

    private static final long serialVersionUID = 1L;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getEnabled() {
        return enabled;
    }

    public void setEnabled(String enabled) {
        this.enabled = enabled == null ? null : enabled.trim();
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname == null ? null : fullname.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getPlainPassword() {
        return plainPassword;
    }

    public void setPlainPassword(String plainPassword) {
        this.plainPassword = plainPassword == null ? null : plainPassword.trim();
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt == null ? null : salt.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public Integer getOrg() {
        return org;
    }

    public void setOrg(Integer org) {
        this.org = org;
    }

    public String getUser_mobile() {
        return user_mobile;
    }

    public void setUser_mobile(String user_mobile) {
        this.user_mobile = user_mobile == null ? null : user_mobile.trim();
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid == null ? null : tid.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getCreate_user() {
        return create_user;
    }

    public void setCreate_user(Integer create_user) {
        this.create_user = create_user;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time == null ? null : create_time.trim();
    }

    public String getM_number() {
        return m_number;
    }

    public void setM_number(String m_number) {
        this.m_number = m_number == null ? null : m_number.trim();
    }

    public String getPwdvalid() {
        return pwdvalid;
    }

    public void setPwdvalid(String pwdvalid) {
        this.pwdvalid = pwdvalid == null ? null : pwdvalid.trim();
    }

    public String getDef_pwd() {
        return def_pwd;
    }

    public void setDef_pwd(String def_pwd) {
        this.def_pwd = def_pwd == null ? null : def_pwd.trim();
    }

    public Integer getStart_menu_id() {
        return start_menu_id;
    }

    public void setStart_menu_id(Integer start_menu_id) {
        this.start_menu_id = start_menu_id;
    }

    public String getPwdupdatetime() {
        return pwdupdatetime;
    }

    public void setPwdupdatetime(String pwdupdatetime) {
        this.pwdupdatetime = pwdupdatetime == null ? null : pwdupdatetime.trim();
    }

    public Integer getPerson_id() {
        return person_id;
    }

    public void setPerson_id(Integer person_id) {
        this.person_id = person_id;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        User other = (User) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getAge() == null ? other.getAge() == null : this.getAge().equals(other.getAge()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getEnabled() == null ? other.getEnabled() == null : this.getEnabled().equals(other.getEnabled()))
            && (this.getFullname() == null ? other.getFullname() == null : this.getFullname().equals(other.getFullname()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
            && (this.getPlainPassword() == null ? other.getPlainPassword() == null : this.getPlainPassword().equals(other.getPlainPassword()))
            && (this.getSalt() == null ? other.getSalt() == null : this.getSalt().equals(other.getSalt()))
            && (this.getSex() == null ? other.getSex() == null : this.getSex().equals(other.getSex()))
            && (this.getFid() == null ? other.getFid() == null : this.getFid().equals(other.getFid()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getUsername() == null ? other.getUsername() == null : this.getUsername().equals(other.getUsername()))
            && (this.getOrg() == null ? other.getOrg() == null : this.getOrg().equals(other.getOrg()))
            && (this.getUser_mobile() == null ? other.getUser_mobile() == null : this.getUser_mobile().equals(other.getUser_mobile()))
            && (this.getTid() == null ? other.getTid() == null : this.getTid().equals(other.getTid()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getCreate_user() == null ? other.getCreate_user() == null : this.getCreate_user().equals(other.getCreate_user()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getM_number() == null ? other.getM_number() == null : this.getM_number().equals(other.getM_number()))
            && (this.getPwdvalid() == null ? other.getPwdvalid() == null : this.getPwdvalid().equals(other.getPwdvalid()))
            && (this.getDef_pwd() == null ? other.getDef_pwd() == null : this.getDef_pwd().equals(other.getDef_pwd()))
            && (this.getStart_menu_id() == null ? other.getStart_menu_id() == null : this.getStart_menu_id().equals(other.getStart_menu_id()))
            && (this.getPwdupdatetime() == null ? other.getPwdupdatetime() == null : this.getPwdupdatetime().equals(other.getPwdupdatetime()))
            && (this.getPerson_id() == null ? other.getPerson_id() == null : this.getPerson_id().equals(other.getPerson_id()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getAge() == null) ? 0 : getAge().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        result = prime * result + ((getFullname() == null) ? 0 : getFullname().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getPlainPassword() == null) ? 0 : getPlainPassword().hashCode());
        result = prime * result + ((getSalt() == null) ? 0 : getSalt().hashCode());
        result = prime * result + ((getSex() == null) ? 0 : getSex().hashCode());
        result = prime * result + ((getFid() == null) ? 0 : getFid().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getUsername() == null) ? 0 : getUsername().hashCode());
        result = prime * result + ((getOrg() == null) ? 0 : getOrg().hashCode());
        result = prime * result + ((getUser_mobile() == null) ? 0 : getUser_mobile().hashCode());
        result = prime * result + ((getTid() == null) ? 0 : getTid().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getCreate_user() == null) ? 0 : getCreate_user().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getM_number() == null) ? 0 : getM_number().hashCode());
        result = prime * result + ((getPwdvalid() == null) ? 0 : getPwdvalid().hashCode());
        result = prime * result + ((getDef_pwd() == null) ? 0 : getDef_pwd().hashCode());
        result = prime * result + ((getStart_menu_id() == null) ? 0 : getStart_menu_id().hashCode());
        result = prime * result + ((getPwdupdatetime() == null) ? 0 : getPwdupdatetime().hashCode());
        result = prime * result + ((getPerson_id() == null) ? 0 : getPerson_id().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", address=").append(address);
        sb.append(", age=").append(age);
        sb.append(", email=").append(email);
        sb.append(", enabled=").append(enabled);
        sb.append(", fullname=").append(fullname);
        sb.append(", password=").append(password);
        sb.append(", plainPassword=").append(plainPassword);
        sb.append(", salt=").append(salt);
        sb.append(", sex=").append(sex);
        sb.append(", fid=").append(fid);
        sb.append(", type=").append(type);
        sb.append(", username=").append(username);
        sb.append(", org=").append(org);
        sb.append(", user_mobile=").append(user_mobile);
        sb.append(", tid=").append(tid);
        sb.append(", remark=").append(remark);
        sb.append(", create_user=").append(create_user);
        sb.append(", create_time=").append(create_time);
        sb.append(", m_number=").append(m_number);
        sb.append(", pwdvalid=").append(pwdvalid);
        sb.append(", def_pwd=").append(def_pwd);
        sb.append(", start_menu_id=").append(start_menu_id);
        sb.append(", pwdupdatetime=").append(pwdupdatetime);
        sb.append(", person_id=").append(person_id);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}