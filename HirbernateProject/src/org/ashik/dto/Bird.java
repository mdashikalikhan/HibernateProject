package org.ashik.dto;

import javax.persistence.Entity;

@Entity
public class Bird extends Animal {
	private double moveRatio;

	public double getMoveRatio() {
		return moveRatio;
	}

	public void setMoveRatio(double moveRatio) {
		this.moveRatio = moveRatio;
	}

}
