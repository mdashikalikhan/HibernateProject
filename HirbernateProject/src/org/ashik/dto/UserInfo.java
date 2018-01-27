package org.ashik.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name="USER_INFO")
public class UserInfo {
	@Id
	@Column(name="USER_ID")
	private int userId;
	@Transient
	private String userName;
	@Column(name="JOINING_DATE")
	@Temporal(TemporalType.DATE)
	private Date joinedDate;
	@Column(name="LAST_ENTRY_DATE_TIME")
	private Date lastEntryDate;
	private String adress;
	@Lob
	private String description;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Date getJoinedDate() {
		return joinedDate;
	}
	public void setJoinedDate(Date joinedDate) {
		this.joinedDate = joinedDate;
	}
	public Date getLastEntryDate() {
		return lastEntryDate;
	}
	public void setLastEntryDate(Date lastEntryDate) {
		this.lastEntryDate = lastEntryDate;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
