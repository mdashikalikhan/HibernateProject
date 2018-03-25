package org.ashik.dto;

import javax.persistence.Entity;

@Entity
public class Dog extends Animal {
	private double digRatio;

	public double getDigRatio() {
		return digRatio;
	}

	public void setDigRatio(double digRatio) {
		this.digRatio = digRatio;
	}

}
