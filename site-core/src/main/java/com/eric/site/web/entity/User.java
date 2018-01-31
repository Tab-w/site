package com.eric.site.web.entity;

import java.io.Serializable;

/**
 * @author WangXingYu
 * @date 2018-01-31
 */
public class User extends BaseEntity implements Serializable {
    private String address;

    private Integer age;

    private String email;

    private String enabled;

    private String fullname;

    private String password;

    private String plainpassword;

    private String salt;

    private String sex;

    private Integer fid;

    private Integer type;

    private String username;

    private Integer org;

    private String userMobile;

    private String tid;

    private String remark;

    private Integer createUser;

    private String createTime;

    private String mNumber;

    private String pwdvalid;

    private String defPwd;

    private Integer startMenuId;

    private String pwdupdatetime;

    private Integer personId;

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

    public String getPlainpassword() {
        return plainpassword;
    }

    public void setPlainpassword(String plainpassword) {
        this.plainpassword = plainpassword == null ? null : plainpassword.trim();
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

    public String getUserMobile() {
        return userMobile;
    }

    public void setUserMobile(String userMobile) {
        this.userMobile = userMobile == null ? null : userMobile.trim();
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

    public Integer getCreateUser() {
        return createUser;
    }

    public void setCreateUser(Integer createUser) {
        this.createUser = createUser;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    public String getmNumber() {
        return mNumber;
    }

    public void setmNumber(String mNumber) {
        this.mNumber = mNumber == null ? null : mNumber.trim();
    }

    public String getPwdvalid() {
        return pwdvalid;
    }

    public void setPwdvalid(String pwdvalid) {
        this.pwdvalid = pwdvalid == null ? null : pwdvalid.trim();
    }

    public String getDefPwd() {
        return defPwd;
    }

    public void setDefPwd(String defPwd) {
        this.defPwd = defPwd == null ? null : defPwd.trim();
    }

    public Integer getStartMenuId() {
        return startMenuId;
    }

    public void setStartMenuId(Integer startMenuId) {
        this.startMenuId = startMenuId;
    }

    public String getPwdupdatetime() {
        return pwdupdatetime;
    }

    public void setPwdupdatetime(String pwdupdatetime) {
        this.pwdupdatetime = pwdupdatetime == null ? null : pwdupdatetime.trim();
    }

    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
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
                && (this.getPlainpassword() == null ? other.getPlainpassword() == null : this.getPlainpassword().equals(other.getPlainpassword()))
                && (this.getSalt() == null ? other.getSalt() == null : this.getSalt().equals(other.getSalt()))
                && (this.getSex() == null ? other.getSex() == null : this.getSex().equals(other.getSex()))
                && (this.getFid() == null ? other.getFid() == null : this.getFid().equals(other.getFid()))
                && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
                && (this.getUsername() == null ? other.getUsername() == null : this.getUsername().equals(other.getUsername()))
                && (this.getOrg() == null ? other.getOrg() == null : this.getOrg().equals(other.getOrg()))
                && (this.getUserMobile() == null ? other.getUserMobile() == null : this.getUserMobile().equals(other.getUserMobile()))
                && (this.getTid() == null ? other.getTid() == null : this.getTid().equals(other.getTid()))
                && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
                && (this.getCreateUser() == null ? other.getCreateUser() == null : this.getCreateUser().equals(other.getCreateUser()))
                && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
                && (this.getmNumber() == null ? other.getmNumber() == null : this.getmNumber().equals(other.getmNumber()))
                && (this.getPwdvalid() == null ? other.getPwdvalid() == null : this.getPwdvalid().equals(other.getPwdvalid()))
                && (this.getDefPwd() == null ? other.getDefPwd() == null : this.getDefPwd().equals(other.getDefPwd()))
                && (this.getStartMenuId() == null ? other.getStartMenuId() == null : this.getStartMenuId().equals(other.getStartMenuId()))
                && (this.getPwdupdatetime() == null ? other.getPwdupdatetime() == null : this.getPwdupdatetime().equals(other.getPwdupdatetime()))
                && (this.getPersonId() == null ? other.getPersonId() == null : this.getPersonId().equals(other.getPersonId()));
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
        result = prime * result + ((getPlainpassword() == null) ? 0 : getPlainpassword().hashCode());
        result = prime * result + ((getSalt() == null) ? 0 : getSalt().hashCode());
        result = prime * result + ((getSex() == null) ? 0 : getSex().hashCode());
        result = prime * result + ((getFid() == null) ? 0 : getFid().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getUsername() == null) ? 0 : getUsername().hashCode());
        result = prime * result + ((getOrg() == null) ? 0 : getOrg().hashCode());
        result = prime * result + ((getUserMobile() == null) ? 0 : getUserMobile().hashCode());
        result = prime * result + ((getTid() == null) ? 0 : getTid().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getCreateUser() == null) ? 0 : getCreateUser().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getmNumber() == null) ? 0 : getmNumber().hashCode());
        result = prime * result + ((getPwdvalid() == null) ? 0 : getPwdvalid().hashCode());
        result = prime * result + ((getDefPwd() == null) ? 0 : getDefPwd().hashCode());
        result = prime * result + ((getStartMenuId() == null) ? 0 : getStartMenuId().hashCode());
        result = prime * result + ((getPwdupdatetime() == null) ? 0 : getPwdupdatetime().hashCode());
        result = prime * result + ((getPersonId() == null) ? 0 : getPersonId().hashCode());
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
        sb.append(", plainpassword=").append(plainpassword);
        sb.append(", salt=").append(salt);
        sb.append(", sex=").append(sex);
        sb.append(", fid=").append(fid);
        sb.append(", type=").append(type);
        sb.append(", username=").append(username);
        sb.append(", org=").append(org);
        sb.append(", userMobile=").append(userMobile);
        sb.append(", tid=").append(tid);
        sb.append(", remark=").append(remark);
        sb.append(", createUser=").append(createUser);
        sb.append(", createTime=").append(createTime);
        sb.append(", mNumber=").append(mNumber);
        sb.append(", pwdvalid=").append(pwdvalid);
        sb.append(", defPwd=").append(defPwd);
        sb.append(", startMenuId=").append(startMenuId);
        sb.append(", pwdupdatetime=").append(pwdupdatetime);
        sb.append(", personId=").append(personId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}