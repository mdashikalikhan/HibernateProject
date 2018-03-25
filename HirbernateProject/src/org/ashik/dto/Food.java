package org.ashik.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name = "FOOD")
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class Food {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "FOOD_ID")
	private int id;
	@Column(name = "FOOD_NAME")
	private String name;

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

}
