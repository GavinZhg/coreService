package com.x.user.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the work_expir database table.
 * 
 */
@Entity
@Table(name="work_expir")
public class WorkExpir extends IdEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	private String area;

	private String city;

	@Column(name="CORP_ADDR")
	private String corpAddr;

	@Column(name="CORP_ENAME")
	private String corpEname;

	@Column(name="CORP_NAME")
	private String corpName;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="CREATE_TIME")
	private Date createTime;

	private String dept;

	@Temporal(TemporalType.DATE)
	@Column(name="END_TIME")
	private Date endTime;

	private String post;

	private String province;

	private String responsib;

	@Temporal(TemporalType.DATE)
	@Column(name="START_TIME")
	private Date startTime;

	private String tel;

	private String title;

	@Column(name="WIT_PHONE")
	private String witPhone;

	private String witness;

	private String zip;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="USRID")
	private User user;

	public WorkExpir() {
	}

	public String getArea() {
		return this.area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCorpAddr() {
		return this.corpAddr;
	}

	public void setCorpAddr(String corpAddr) {
		this.corpAddr = corpAddr;
	}

	public String getCorpEname() {
		return this.corpEname;
	}

	public void setCorpEname(String corpEname) {
		this.corpEname = corpEname;
	}

	public String getCorpName() {
		return this.corpName;
	}

	public void setCorpName(String corpName) {
		this.corpName = corpName;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getDept() {
		return this.dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public Date getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getPost() {
		return this.post;
	}

	public void setPost(String post) {
		this.post = post;
	}

	public String getProvince() {
		return this.province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getResponsib() {
		return this.responsib;
	}

	public void setResponsib(String responsib) {
		this.responsib = responsib;
	}

	public Date getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public String getTel() {
		return this.tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWitPhone() {
		return this.witPhone;
	}

	public void setWitPhone(String witPhone) {
		this.witPhone = witPhone;
	}

	public String getWitness() {
		return this.witness;
	}

	public void setWitness(String witness) {
		this.witness = witness;
	}

	public String getZip() {
		return this.zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}