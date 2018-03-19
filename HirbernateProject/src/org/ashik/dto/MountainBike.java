package org.ashik.dto;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class MountainBike extends BiCycle {
	@Column(name="MAX_MOUNTAIN_HEIGHT")
	private int maxMountainHeight;

	public int getMaxMountainHeight() {
		return maxMountainHeight;
	}

	public void setMaxMountainHeight(int maxMountainHeight) {
		this.maxMountainHeight = maxMountainHeight;
	}
	
	
}
