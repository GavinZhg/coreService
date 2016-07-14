package com.x.user.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the user_info database table.
 * 
 */
@Entity
@Table(name="user_info")
public class UserInfo extends IdEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Temporal(TemporalType.DATE)
	@Column(name="BIRTH_DATE")
	private Date birthDate;

	@Column(name="CELL_PHONE")
	private String cellPhone;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="CREATE_TIME")
	private Date createTime;

	private byte degree;

	private String email;

	private String ethnic;

	private byte gender;

	@Column(name="ID_NO")
	private String idNo;

	@Column(name="ID_TYPE")
	private byte idType;

	private byte marriage;

	private String vocation;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="USRID")
	private User user;

	public UserInfo() {
	}

	public Date getBirthDate() {
		return this.birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getCellPhone() {
		return this.cellPhone;
	}

	public void setCellPhone(String cellPhone) {
		this.cellPhone = cellPhone;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public byte getDegree() {
		return this.degree;
	}

	public void setDegree(byte degree) {
		this.degree = degree;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEthnic() {
		return this.ethnic;
	}

	public void setEthnic(String ethnic) {
		this.ethnic = ethnic;
	}

	public byte getGender() {
		return this.gender;
	}

	public void setGender(byte gender) {
		this.gender = gender;
	}

	public String getIdNo() {
		return this.idNo;
	}

	public void setIdNo(String idNo) {
		this.idNo = idNo;
	}

	public byte getIdType() {
		return this.idType;
	}

	public void setIdType(byte idType) {
		this.idType = idType;
	}

	public byte getMarriage() {
		return this.marriage;
	}

	public void setMarriage(byte marriage) {
		this.marriage = marriage;
	}

	public String getVocation() {
		return this.vocation;
	}

	public void setVocation(String vocation) {
		this.vocation = vocation;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}