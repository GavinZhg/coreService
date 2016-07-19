package com.x.user.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;

/**
 * Created by Administrator on 2016/7/19.
 */
@Entity
@Table(name = "work_expir", schema = "research", catalog = "")
public class WorkExpirEntity extends IdEntity implements Serializable {
    private String corpName;
    private String corpEname;
    private String province;
    private String city;
    private String area;
    private String corpAddr;
    private String zip;
    private String dept;
    private String tel;
    private Date startTime;
    private Date endTime;
    private String post;
    private String title;
    private String responsib;
    private String witness;
    private String witPhone;
    private Timestamp createTime;
    private UserEntity userByUsrid;

    @Basic
    @Column(name = "CORP_NAME")
    public String getCorpName() {
        return corpName;
    }

    public void setCorpName(String corpName) {
        this.corpName = corpName;
    }

    @Basic
    @Column(name = "CORP_ENAME")
    public String getCorpEname() {
        return corpEname;
    }

    public void setCorpEname(String corpEname) {
        this.corpEname = corpEname;
    }

    @Basic
    @Column(name = "PROVINCE")
    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    @Basic
    @Column(name = "CITY")
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Basic
    @Column(name = "AREA")
    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Basic
    @Column(name = "CORP_ADDR")
    public String getCorpAddr() {
        return corpAddr;
    }

    public void setCorpAddr(String corpAddr) {
        this.corpAddr = corpAddr;
    }

    @Basic
    @Column(name = "ZIP")
    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    @Basic
    @Column(name = "DEPT")
    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    @Basic
    @Column(name = "TEL")
    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Basic
    @Column(name = "START_TIME")
    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    @Basic
    @Column(name = "END_TIME")
    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    @Basic
    @Column(name = "POST")
    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    @Basic
    @Column(name = "TITLE")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "RESPONSIB")
    public String getResponsib() {
        return responsib;
    }

    public void setResponsib(String responsib) {
        this.responsib = responsib;
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

        WorkExpirEntity that = (WorkExpirEntity) o;

        if (corpName != null ? !corpName.equals(that.corpName) : that.corpName != null) return false;
        if (corpEname != null ? !corpEname.equals(that.corpEname) : that.corpEname != null) return false;
        if (province != null ? !province.equals(that.province) : that.province != null) return false;
        if (city != null ? !city.equals(that.city) : that.city != null) return false;
        if (area != null ? !area.equals(that.area) : that.area != null) return false;
        if (corpAddr != null ? !corpAddr.equals(that.corpAddr) : that.corpAddr != null) return false;
        if (zip != null ? !zip.equals(that.zip) : that.zip != null) return false;
        if (dept != null ? !dept.equals(that.dept) : that.dept != null) return false;
        if (tel != null ? !tel.equals(that.tel) : that.tel != null) return false;
        if (startTime != null ? !startTime.equals(that.startTime) : that.startTime != null) return false;
        if (endTime != null ? !endTime.equals(that.endTime) : that.endTime != null) return false;
        if (post != null ? !post.equals(that.post) : that.post != null) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        if (responsib != null ? !responsib.equals(that.responsib) : that.responsib != null) return false;
        if (witness != null ? !witness.equals(that.witness) : that.witness != null) return false;
        if (witPhone != null ? !witPhone.equals(that.witPhone) : that.witPhone != null) return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = corpName != null ? corpName.hashCode() : 0;
        result = 31 * result + (corpEname != null ? corpEname.hashCode() : 0);
        result = 31 * result + (province != null ? province.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (area != null ? area.hashCode() : 0);
        result = 31 * result + (corpAddr != null ? corpAddr.hashCode() : 0);
        result = 31 * result + (zip != null ? zip.hashCode() : 0);
        result = 31 * result + (dept != null ? dept.hashCode() : 0);
        result = 31 * result + (tel != null ? tel.hashCode() : 0);
        result = 31 * result + (startTime != null ? startTime.hashCode() : 0);
        result = 31 * result + (endTime != null ? endTime.hashCode() : 0);
        result = 31 * result + (post != null ? post.hashCode() : 0);
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (responsib != null ? responsib.hashCode() : 0);
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
