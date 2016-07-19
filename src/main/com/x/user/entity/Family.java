package com.x.user.entity;

import javax.persistence.*;
import java.io.Serializable;

import java.util.Date;


/**
 * The persistent class for the family database table.
 * 
 */
@Entity
public class Family extends IdEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Temporal(TemporalType.DATE)
	@Column(name="BIRTH_DATE")
	private Date birthDate;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="CREATE_TIME")
	private Date createTime;

	@Column(name="ID_NO")
	private String idNo;

	private String name;

	private String phone;

	@Column(name="RELAT_SHIP")
	private byte relatShip;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="USRID")
	private User user;

	public Family() {
	}

	public Date getBirthDate() {
		return this.birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getIdNo() {
		return this.idNo;
	}

	public void setIdNo(String idNo) {
		this.idNo = idNo;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public byte getRelatShip() {
		return this.relatShip;
	}

	public void setRelatShip(byte relatShip) {
		this.relatShip = relatShip;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}