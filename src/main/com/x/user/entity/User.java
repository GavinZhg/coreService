package com.x.user.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.math.BigInteger;
import java.util.List;


/**
 * The persistent class for the user database table.
 * 
 */
@Entity
public class User extends IdEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	private BigInteger admin;

	@Column(name="CO_CHANNEL")
	private String coChannel;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="CRAETE_TIME")
	private Date craeteTime;

	@Column(name="IS_DELETED")
	private byte isDeleted;

	@Column(name="IS_LOCKED")
	private byte isLocked;

	private String passwd;

	@Column(name="REAL_NAME")
	private String realName;

	@Column(name="USER_NAME")
	private String userName;

	@Column(name="USER_TYPE")
	private byte userType;

	//bi-directional many-to-one association to Eductation
	@OneToMany(mappedBy="user")
	private List<Education> educations;

	//bi-directional many-to-one association to Family
	@OneToMany(mappedBy="user")
	private List<Family> families;

	//bi-directional many-to-one association to Reside
	@OneToMany(mappedBy="user")
	private List<Reside> resides;

	//bi-directional many-to-one association to UserActive
	@OneToMany(mappedBy="user")
	private List<UserActive> userActives;

	//bi-directional many-to-one association to UserInfoRepository
	@OneToMany(mappedBy="user")
	private List<UserInfo> userInfos;

	//bi-directional many-to-many association to UserGroup
	@ManyToMany(mappedBy="users")
	private List<UserGroup> userGroups;

	//bi-directional many-to-one association to WorkExpir
	@OneToMany(mappedBy="user")
	private List<WorkExpir> workExpirs;

	public User() {
	}

	public BigInteger getAdmin() {
		return this.admin;
	}

	public void setAdmin(BigInteger admin) {
		this.admin = admin;
	}

	public String getCoChannel() {
		return this.coChannel;
	}

	public void setCoChannel(String coChannel) {
		this.coChannel = coChannel;
	}

	public Date getCraeteTime() {
		return this.craeteTime;
	}

	public void setCraeteTime(Date craeteTime) {
		this.craeteTime = craeteTime;
	}

	public byte getIsDeleted() {
		return this.isDeleted;
	}

	public void setIsDeleted(byte isDeleted) {
		this.isDeleted = isDeleted;
	}

	public byte getIsLocked() {
		return this.isLocked;
	}

	public void setIsLocked(byte isLocked) {
		this.isLocked = isLocked;
	}

	public String getPasswd() {
		return this.passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public String getRealName() {
		return this.realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public byte getUserType() {
		return this.userType;
	}

	public void setUserType(byte userType) {
		this.userType = userType;
	}

	public List<Education> getEducations() {
		return this.educations;
	}

	public void setEducations(List<Education> educations) {
		this.educations = educations;
	}

	public Education addEducation(Education education) {
		getEducations().add(education);
		education.setUser(this);

		return education;
	}

	public Education removeEducation(Education education) {
		getEducations().remove(education);
		education.setUser(null);

		return education;
	}

	public List<Family> getFamilies() {
		return this.families;
	}

	public void setFamilies(List<Family> families) {
		this.families = families;
	}

	public Family addFamily(Family family) {
		getFamilies().add(family);
		family.setUser(this);

		return family;
	}

	public Family removeFamily(Family family) {
		getFamilies().remove(family);
		family.setUser(null);

		return family;
	}

	public List<Reside> getResides() {
		return this.resides;
	}

	public void setResides(List<Reside> resides) {
		this.resides = resides;
	}

	public Reside addReside(Reside reside) {
		getResides().add(reside);
		reside.setUser(this);

		return reside;
	}

	public Reside removeReside(Reside reside) {
		getResides().remove(reside);
		reside.setUser(null);

		return reside;
	}

	public List<UserActive> getUserActives() {
		return this.userActives;
	}

	public void setUserActives(List<UserActive> userActives) {
		this.userActives = userActives;
	}

	public UserActive addUserActive(UserActive userActive) {
		getUserActives().add(userActive);
		userActive.setUser(this);

		return userActive;
	}

	public UserActive removeUserActive(UserActive userActive) {
		getUserActives().remove(userActive);
		userActive.setUser(null);

		return userActive;
	}

	public List<UserInfo> getUserInfos() {
		return this.userInfos;
	}

	public void setUserInfos(List<UserInfo> userInfos) {
		this.userInfos = userInfos;
	}

	public UserInfo addUserInfo(UserInfo userInfo) {
		getUserInfos().add(userInfo);
		userInfo.setUser(this);

		return userInfo;
	}

	public UserInfo removeUserInfo(UserInfo userInfo) {
		getUserInfos().remove(userInfo);
		userInfo.setUser(null);

		return userInfo;
	}

	public List<UserGroup> getUserGroups() {
		return this.userGroups;
	}

	public void setUserGroups(List<UserGroup> userGroups) {
		this.userGroups = userGroups;
	}

	public List<WorkExpir> getWorkExpirs() {
		return this.workExpirs;
	}

	public void setWorkExpirs(List<WorkExpir> workExpirs) {
		this.workExpirs = workExpirs;
	}

	public WorkExpir addWorkExpir(WorkExpir workExpir) {
		getWorkExpirs().add(workExpir);
		workExpir.setUser(this);

		return workExpir;
	}

	public WorkExpir removeWorkExpir(WorkExpir workExpir) {
		getWorkExpirs().remove(workExpir);
		workExpir.setUser(null);

		return workExpir;
	}

}