package org.ashik.dto;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="PHYSICS")
public class PhysicsTeacher extends Teacher {
	@Column(name="LEVEL_PHYSICS")
	private int levelPhysics;

	public int getLevelPhysics() {
		return levelPhysics;
	}

	public void setLevelPhysics(int levelPhysics) {
		this.levelPhysics = levelPhysics;
	}
	
}
