package com.x.user.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the user_active database table.
 * 
 */
@Entity
@Table(name="user_active")
public class UserActive extends IdEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="LOCK_TIME")
	private Date lockTime;

	@Column(name="LOGIN_BROWSER")
	private String loginBrowser;

	@Column(name="LOGIN_IP")
	private String loginIp;

	@Column(name="LOGIN_TERMINAL")
	private byte loginTerminal;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="LOGIN_TIME")
	private Date loginTime;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="MODY_PASS_TIME")
	private Date modyPassTime;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="USRID")
	private User user;

	public UserActive() {
	}

	public Date getLockTime() {
		return this.lockTime;
	}

	public void setLockTime(Date lockTime) {
		this.lockTime = lockTime;
	}

	public String getLoginBrowser() {
		return this.loginBrowser;
	}

	public void setLoginBrowser(String loginBrowser) {
		this.loginBrowser = loginBrowser;
	}

	public String getLoginIp() {
		return this.loginIp;
	}

	public void setLoginIp(String loginIp) {
		this.loginIp = loginIp;
	}

	public byte getLoginTerminal() {
		return this.loginTerminal;
	}

	public void setLoginTerminal(byte loginTerminal) {
		this.loginTerminal = loginTerminal;
	}

	public Date getLoginTime() {
		return this.loginTime;
	}

	public void setLoginTime(Date loginTime) {
		this.loginTime = loginTime;
	}

	public Date getModyPassTime() {
		return this.modyPassTime;
	}

	public void setModyPassTime(Date modyPassTime) {
		this.modyPassTime = modyPassTime;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}