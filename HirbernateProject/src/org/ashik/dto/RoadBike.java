package org.ashik.dto;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class RoadBike extends BiCycle {
	@Column(name="MAX_ROAD_DISTANCE")
	private int maxRoadDistance;

	public int getMaxRoadDistance() {
		return maxRoadDistance;
	}

	public void setMaxRoadDistance(int maxRoadDistance) {
		this.maxRoadDistance = maxRoadDistance;
	}
	
}
