package com.x.user.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;

/**
 * Created by Administrator on 2016/7/19.
 */
@Entity
@Table(name = "family", schema = "research", catalog = "")
public class FamilyEntity extends IdEntity implements Serializable {
    private String name;
    private Date birthDate;
    private Integer relatShip;
    private String idNo;
    private String phone;
    private Timestamp createTime;
    private UserEntity userByUsrid;

    @Basic
    @Column(name = "NAME")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "BIRTH_DATE")
    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    @Basic
    @Column(name = "RELAT_SHIP")
    public Integer getRelatShip() {
        return relatShip;
    }

    public void setRelatShip(Integer relatShip) {
        this.relatShip = relatShip;
    }

    @Basic
    @Column(name = "ID_NO")
    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    @Basic
    @Column(name = "PHONE")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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

        FamilyEntity that = (FamilyEntity) o;

        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (birthDate != null ? !birthDate.equals(that.birthDate) : that.birthDate != null) return false;
        if (relatShip != null ? !relatShip.equals(that.relatShip) : that.relatShip != null) return false;
        if (idNo != null ? !idNo.equals(that.idNo) : that.idNo != null) return false;
        if (phone != null ? !phone.equals(that.phone) : that.phone != null) return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (birthDate != null ? birthDate.hashCode() : 0);
        result = 31 * result + (relatShip != null ? relatShip.hashCode() : 0);
        result = 31 * result + (idNo != null ? idNo.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
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
