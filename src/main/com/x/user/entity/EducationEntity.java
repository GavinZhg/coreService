package com.x.user.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;

/**
 * Created by Administrator on 2016/7/19.
 */
@Entity
@Table(name = "education", schema = "research", catalog = "")
public class EducationEntity extends IdEntity implements Serializable {
    private String school;
    private String addr;
    private String major;
    private Date startDate;
    private Date endDate;
    private String certification;
    private String degree;
    private String witness;
    private String witPhone;
    private Timestamp createTime;
    private UserEntity userByUsrid;

    @Basic
    @Column(name = "SCHOOL")
    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    @Basic
    @Column(name = "ADDR")
    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    @Basic
    @Column(name = "MAJOR")
    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Basic
    @Column(name = "START_DATE")
    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    @Basic
    @Column(name = "END_DATE")
    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    @Basic
    @Column(name = "CRETIFICATION")
    public String getCertification() {
        return certification;
    }

    public void setCertification(String cretification) {
        this.certification = cretification;
    }

    @Basic
    @Column(name = "DEGREE")
    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    @Basic
    @Column(name = "WITNESS")
    public String getWitness() {
        return witness;
    }

    public void setWitness(String witness) {
        this.witness = witness;
    }

    @Basic
    @Column(name = "WIT_PHONE")
    public String getWitPhone() {
        return witPhone;
    }

    public void setWitPhone(String witPhone) {
        this.witPhone = witPhone;
    }

    @Basic
    @Column(name = "CREATE_TIME")
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EducationEntity that = (EducationEntity) o;

        if (school != null ? !school.equals(that.school) : that.school != null) return false;
        if (addr != null ? !addr.equals(that.addr) : that.addr != null) return false;
        if (major != null ? !major.equals(that.major) : that.major != null) return false;
        if (startDate != null ? !startDate.equals(that.startDate) : that.startDate != null) return false;
        if (endDate != null ? !endDate.equals(that.endDate) : that.endDate != null) return false;
        if (certification != null ? !certification.equals(that.certification) : that.certification != null)
            return false;
        if (degree != null ? !degree.equals(that.degree) : that.degree != null) return false;
        if (witness != null ? !witness.equals(that.witness) : that.witness != null) return false;
        if (witPhone != null ? !witPhone.equals(that.witPhone) : that.witPhone != null) return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = school != null ? school.hashCode() : 0;
        result = 31 * result + (addr != null ? addr.hashCode() : 0);
        result = 31 * result + (major != null ? major.hashCode() : 0);
        result = 31 * result + (startDate != null ? startDate.hashCode() : 0);
        result = 31 * result + (endDate != null ? endDate.hashCode() : 0);
        result = 31 * result + (certification != null ? certification.hashCode() : 0);
        result = 31 * result + (degree != null ? degree.hashCode() : 0);
        result = 31 * result + (witness != null ? witness.hashCode() : 0);
        result = 31 * result + (witPhone != null ? witPhone.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
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
