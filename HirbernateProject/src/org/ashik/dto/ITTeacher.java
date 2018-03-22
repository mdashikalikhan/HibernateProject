package org.ashik.dto;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="IT")
public class ITTeacher  extends Teacher{
	@Column(name="LEVEL_IT")
	private int levelIT;

	public int getLevelIT() {
		return levelIT;
	}

	public void setLevelIT(int levelIT) {
		this.levelIT = levelIT;
	}
	
}
