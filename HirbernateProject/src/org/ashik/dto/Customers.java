package org.ashik.dto;

import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="CUSTOMER_DETAILS")
public class Customers {
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="CUSTOMER_ID")
	private int id;
	@Column(name="CUSTOMER_NAME")
	private String name;
	@Embedded
	private Address address;
	@Embedded
	@AttributeOverrides({
		@AttributeOverride(name="street",column=@Column(name="CUSTOMER_OFFICE_STREET")),
		@AttributeOverride(name="city", column=@Column(name="CUSTOMER_OFFICE_CITY")),
		@AttributeOverride(name="state", column=@Column(name="CUSTOMER_OFFICE_STATE")),
		@AttributeOverride(name="pinCode", column=@Column(name="CUSTOMER_OFFICE_PINCODE"))
	})
	private Address officeAddress;
	@Column(name="CUSTOMER_PHONE")
	private String phone;
	@Column(name="CUSTOMER_DOB")
	@Temporal(TemporalType.DATE)
	private Date dateOfBirth;
	@Column(name="CUSTOMER_SECRET")
	private String secretText;
	@Lob
	private String description;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getOfficeAddress() {
		return officeAddress;
	}
	public void setOfficeAddress(Address officeAddress) {
		this.officeAddress = officeAddress;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	public String getSecretText() {
		return secretText;
	}
	public void setSecretText(String secretText) {
		this.secretText = secretText;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Customers [id=" + id + ", name=" + name + ", address="
				+ address + ", officeAddress=" + officeAddress + ", phone="
				+ phone + ", dateOfBirth=" + dateOfBirth + ", secretText="
				+ secretText + ", description=" + description + "]";
	}
	
	
}
