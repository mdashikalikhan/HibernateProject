package org.ashik.dto;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="USER_MASTER")
public class UserMaster {
	@Id  @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="USER_ID")
	private int id;
	@Column(name="USER_NAME")
	private String name;
	@ElementCollection
	private Set<Address> listOfAddressses = new HashSet<>();
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
	public Set<Address> getListOfAddressses() {
		return listOfAddressses;
	}
	public void setListOfAddressses(Set<Address> listOfAddressses) {
		this.listOfAddressses = listOfAddressses;
	}
	@Override
	public String toString() {
		return "UserMaster [id=" + id + ", name=" + name
				+ ", listOfAddressses=" + listOfAddressses + "]";
	}
	
	

}
