package com.tit.hcms.bean;

import org.springframework.stereotype.Component;

import java.util.Objects;

/**
 * @author 王阳
 * @create 2020-03-19-20:37
 */
@Component
public class Users {
    private Integer id;

    private String username;

    private String password;

    private Integer status;

    private String realname;

    private String sex;

    private String remarks;

    private String phone;

    public Integer getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public Integer getStatus() {
        return status;
    }

    public String getRealname() {
        return realname;
    }

    public String getSex() {
        return sex;
    }

    public String getRemarks() {
        return remarks;
    }

    public String getPhone() {
        return phone;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Users users = (Users) o;
        return Objects.equals(id, users.id) &&
                Objects.equals(username, users.username) &&
                Objects.equals(password, users.password) &&
                Objects.equals(status, users.status) &&
                Objects.equals(realname, users.realname) &&
                Objects.equals(sex, users.sex) &&
                Objects.equals(remarks, users.remarks) &&
                Objects.equals(phone, users.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, password, status, realname, sex, remarks, phone);
    }

    public Users() {
    }

    public Users(Integer id, String username, String password, Integer status, String realname, String sex, String remarks, String phone) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.status = status;
        this.realname = realname;
        this.sex = sex;
        this.remarks = remarks;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", status=" + status +
                ", realname='" + realname + '\'' +
                ", sex='" + sex + '\'' +
                ", remarks='" + remarks + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
