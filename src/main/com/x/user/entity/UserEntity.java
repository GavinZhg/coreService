package com.x.user.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Collection;

/**
 * Created by Administrator on 2016/7/19.
 */
@Entity
@Table(name = "user", schema = "research", catalog = "")
public class UserEntity extends IdEntity implements Serializable {
    private String userName;
    private String passwd;
    private Integer userType;
    private String realName;
    private Timestamp craeteTime;
    private String coChannel;
    private Long admin;
    private Boolean isLocked;
    private Boolean isDeleted;
    private Collection<EducationEntity> educationsById;
    private Collection<FamilyEntity> familiesById;
    private Collection<ResideEntity> residesById;
    private Collection<UserActiveEntity> userActivesById;
    private Collection<UserInfoEntity> userInfosById;
    private Collection<UserUsergrpEntity> userUsergrpsById;
    private Collection<WorkExpirEntity> workExpirsById;

    @Basic
    @Column(name = "USER_NAME")
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Basic
    @Column(name = "PASSWD")
    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    @Basic
    @Column(name = "USER_TYPE")
    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    @Basic
    @Column(name = "REAL_NAME")
    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    @Basic
    @Column(name = "CRAETE_TIME")
    public Timestamp getCraeteTime() {
        return craeteTime;
    }

    public void setCraeteTime(Timestamp craeteTime) {
        this.craeteTime = craeteTime;
    }

    @Basic
    @Column(name = "CO_CHANNEL")
    public String getCoChannel() {
        return coChannel;
    }

    public void setCoChannel(String coChannel) {
        this.coChannel = coChannel;
    }

    @Basic
    @Column(name = "ADMIN")
    public Long getAdmin() {
        return admin;
    }

    public void setAdmin(Long admin) {
        this.admin = admin;
    }

    @Basic
    @Column(name = "IS_LOCKED")
    public Boolean getLocked() {
        return isLocked;
    }

    public void setLocked(Boolean locked) {
        isLocked = locked;
    }

    @Basic
    @Column(name = "IS_DELETED")
    public Boolean getDeleted() {
        return isDeleted;
    }

    public void setDeleted(Boolean deleted) {
        isDeleted = deleted;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserEntity that = (UserEntity) o;

        if (userName != null ? !userName.equals(that.userName) : that.userName != null) return false;
        if (passwd != null ? !passwd.equals(that.passwd) : that.passwd != null) return false;
        if (userType != null ? !userType.equals(that.userType) : that.userType != null) return false;
        if (realName != null ? !realName.equals(that.realName) : that.realName != null) return false;
        if (craeteTime != null ? !craeteTime.equals(that.craeteTime) : that.craeteTime != null) return false;
        if (coChannel != null ? !coChannel.equals(that.coChannel) : that.coChannel != null) return false;
        if (admin != null ? !admin.equals(that.admin) : that.admin != null) return false;
        if (isLocked != null ? !isLocked.equals(that.isLocked) : that.isLocked != null) return false;
        if (isDeleted != null ? !isDeleted.equals(that.isDeleted) : that.isDeleted != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userName != null ? userName.hashCode() : 0;
        result = 31 * result + (passwd != null ? passwd.hashCode() : 0);
        result = 31 * result + (userType != null ? userType.hashCode() : 0);
        result = 31 * result + (realName != null ? realName.hashCode() : 0);
        result = 31 * result + (craeteTime != null ? craeteTime.hashCode() : 0);
        result = 31 * result + (coChannel != null ? coChannel.hashCode() : 0);
        result = 31 * result + (admin != null ? admin.hashCode() : 0);
        result = 31 * result + (isLocked != null ? isLocked.hashCode() : 0);
        result = 31 * result + (isDeleted != null ? isDeleted.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "userByUsrid")
    public Collection<EducationEntity> getEducationsById() {
        return educationsById;
    }

    public void setEducationsById(Collection<EducationEntity> educationsById) {
        this.educationsById = educationsById;
    }

    @OneToMany(mappedBy = "userByUsrid")
    public Collection<FamilyEntity> getFamiliesById() {
        return familiesById;
    }

    public void setFamiliesById(Collection<FamilyEntity> familiesById) {
        this.familiesById = familiesById;
    }

    @OneToMany(mappedBy = "userByUsrid")
    public Collection<ResideEntity> getResidesById() {
        return residesById;
    }

    public void setResidesById(Collection<ResideEntity> residesById) {
        this.residesById = residesById;
    }

    @OneToMany(mappedBy = "userByUsrid")
    public Collection<UserActiveEntity> getUserActivesById() {
        return userActivesById;
    }

    public void setUserActivesById(Collection<UserActiveEntity> userActivesById) {
        this.userActivesById = userActivesById;
    }

    @OneToMany(mappedBy = "userByUsrid")
    public Collection<UserInfoEntity> getUserInfosById() {
        return userInfosById;
    }

    public void setUserInfosById(Collection<UserInfoEntity> userInfosById) {
        this.userInfosById = userInfosById;
    }

    @OneToMany(mappedBy = "userByUsrid")
    public Collection<UserUsergrpEntity> getUserUsergrpsById() {
        return userUsergrpsById;
    }

    public void setUserUsergrpsById(Collection<UserUsergrpEntity> userUsergrpsById) {
        this.userUsergrpsById = userUsergrpsById;
    }

    @OneToMany(mappedBy = "userByUsrid")
    public Collection<WorkExpirEntity> getWorkExpirsById() {
        return workExpirsById;
    }

    public void setWorkExpirsById(Collection<WorkExpirEntity> workExpirsById) {
        this.workExpirsById = workExpirsById;
    }
}
