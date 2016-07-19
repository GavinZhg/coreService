package com.x.user.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created by Administrator on 2016/7/19.
 */
@Entity
@Table(name = "user_active", schema = "research", catalog = "")
public class UserActiveEntity extends IdEntity implements Serializable {
    private Timestamp modyPassTime;
    private Timestamp loginTime;
    private String loginIp;
    private String loginBrowser;
    private Integer loginTerminal;
    private Timestamp lockTime;
    private UserEntity userByUsrid;

    @Basic
    @Column(name = "MODY_PASS_TIME")
    public Timestamp getModyPassTime() {
        return modyPassTime;
    }

    public void setModyPassTime(Timestamp modyPassTime) {
        this.modyPassTime = modyPassTime;
    }

    @Basic
    @Column(name = "LOGIN_TIME")
    public Timestamp getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Timestamp loginTime) {
        this.loginTime = loginTime;
    }

    @Basic
    @Column(name = "LOGIN_IP")
    public String getLoginIp() {
        return loginIp;
    }

    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp;
    }

    @Basic
    @Column(name = "LOGIN_BROWSER")
    public String getLoginBrowser() {
        return loginBrowser;
    }

    public void setLoginBrowser(String loginBrowser) {
        this.loginBrowser = loginBrowser;
    }

    @Basic
    @Column(name = "LOGIN_TERMINAL")
    public Integer getLoginTerminal() {
        return loginTerminal;
    }

    public void setLoginTerminal(Integer loginTerminal) {
        this.loginTerminal = loginTerminal;
    }

    @Basic
    @Column(name = "LOCK_TIME")
    public Timestamp getLockTime() {
        return lockTime;
    }

    public void setLockTime(Timestamp lockTime) {
        this.lockTime = lockTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserActiveEntity that = (UserActiveEntity) o;

        if (modyPassTime != null ? !modyPassTime.equals(that.modyPassTime) : that.modyPassTime != null) return false;
        if (loginTime != null ? !loginTime.equals(that.loginTime) : that.loginTime != null) return false;
        if (loginIp != null ? !loginIp.equals(that.loginIp) : that.loginIp != null) return false;
        if (loginBrowser != null ? !loginBrowser.equals(that.loginBrowser) : that.loginBrowser != null) return false;
        if (loginTerminal != null ? !loginTerminal.equals(that.loginTerminal) : that.loginTerminal != null)
            return false;
        if (lockTime != null ? !lockTime.equals(that.lockTime) : that.lockTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = modyPassTime != null ? modyPassTime.hashCode() : 0;
        result = 31 * result + (loginTime != null ? loginTime.hashCode() : 0);
        result = 31 * result + (loginIp != null ? loginIp.hashCode() : 0);
        result = 31 * result + (loginBrowser != null ? loginBrowser.hashCode() : 0);
        result = 31 * result + (loginTerminal != null ? loginTerminal.hashCode() : 0);
        result = 31 * result + (lockTime != null ? lockTime.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "USRID", referencedColumnName = "ID")
    public UserEntity getUserByUsrid() {
        return userByUsrid;
    }

    public void setUserByUsrid(UserEntity userByUsrid) {
        this.userByUsrid = userByUsrid;
    }
}
