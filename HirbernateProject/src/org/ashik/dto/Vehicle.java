package org.ashik.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

@Entity
public class Vehicle {
	@Id @GeneratedValue
	@Column(name="VEHICLE_ID")
	private int vehicleId;
	@Column(name="VEHICLE_NAME")
	private String vehicleName;
	@ManyToOne
	@NotFound(action=NotFoundAction.IGNORE)
	private Officers officer;
	
	public int getVehicleId() {
		return vehicleId;
	}
	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}
	public String getVehicleName() {
		return vehicleName;
	}
	public void setVehicleName(String vediclName) {
		this.vehicleName = vediclName;
	}
	public Officers getOfficer() {
		return officer;
	}
	public void setOfficer(Officers officer) {
		this.officer = officer;
	}
	
	
}
