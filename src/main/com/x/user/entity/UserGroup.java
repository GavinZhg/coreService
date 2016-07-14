package com.x.user.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the user_group database table.
 * 
 */
@Entity
@Table(name="user_group")
public class UserGroup extends IdEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	private String code;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="CREATE_TIME")
	private Date createTime;

	private String descrpt;

	@Column(name="IS_DELETED")
	private byte isDeleted;

	private String name;

	//bi-directional many-to-many association to User
	@ManyToMany
	@JoinTable(
		name="user_usergrp"
		, joinColumns={
			@JoinColumn(name="GID")
			}
		, inverseJoinColumns={
			@JoinColumn(name="USRID")
			}
		)
	private List<User> users;

	public UserGroup() {
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getDescrpt() {
		return this.descrpt;
	}

	public void setDescrpt(String descrpt) {
		this.descrpt = descrpt;
	}

	public byte getIsDeleted() {
		return this.isDeleted;
	}

	public void setIsDeleted(byte isDeleted) {
		this.isDeleted = isDeleted;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<User> getUsers() {
		return this.users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

}