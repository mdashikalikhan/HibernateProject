package org.ashik.dto;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "OFFICERS")
public class Officers {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "OFFICER_ID")
	private int id;
	@Column(name = "OFFICER_NAME")
	private String name;
	@OneToMany
	@JoinTable(name = "Offiers_Have_Vehicle", joinColumns = @JoinColumn(name = "OFF_ID"), inverseJoinColumns = @JoinColumn(name = "VEH_ID"))
	private Collection<Vehicle> vehicle = new ArrayList<Vehicle>();

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

	public Collection<Vehicle> getVehicle() {
		return vehicle;
	}

	public void setVehicle(Collection<Vehicle> vehicle) {
		this.vehicle = vehicle;
	}

	@Override
	public String toString() {
		return "Officers [id=" + id + ", name=" + name + ", vehicle=" + vehicle
				+ "]";
	}

}
