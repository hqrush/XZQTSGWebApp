package org.xzqtsg.webapp_core.domain.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "admin")
public class Admin implements Serializable {

	private static final long serialVersionUID = 1L;
	private int id;
	private String userName;
	private String password;
	private String realName;
	private Date addDate;
	private int isUse;
	private int roleId;

	@Id
	@Column(name = "id", nullable = false, unique = true, length = 4)
	@GeneratedValue(strategy = GenerationType.AUTO)
	// @GenericGenerator(name = "uuid", strategy = "org.hibernate.id.UUIDGenerator")
	// @GeneratedValue(generator = "uuid")
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "UserName", nullable = false, unique = false, length = 16)
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Column(name = "Password", nullable = false, unique = false, length = 16)
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "RealName", nullable = true, unique = false, length = 16)
	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	@Column(name = "AddDate", nullable = false, unique = false, length = 16)
	public Date getAddDate() {
		return addDate;
	}

	public void setAddDate(Date addDate) {
		this.addDate = addDate;
	}

	@Column(name = "IsUse", nullable = false, unique = false, length = 1)
	public int getIsUse() {
		return isUse;
	}

	public void setIsUse(int isUse) {
		this.isUse = isUse;
	}

	@Column(name = "RoleId", nullable = false, unique = false, length = 4)
	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	@Override
	public String toString() {
		return "Admin [id=" + id + ", userName=" + userName + ", password=" + password + ", realName=" + realName
				+ ", addDate=" + addDate + ", isUse=" + isUse + ", roleId=" + roleId + "]";
	}

}
