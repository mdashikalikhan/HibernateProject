package org.ashik.dto;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class ChineseFood extends Food {
	@Column(name = "FOOD_CHINESE_ITEMS")
	private String chineseItems;

	public String getChineseItems() {
		return chineseItems;
	}

	public void setChineseItems(String chineseItems) {
		this.chineseItems = chineseItems;
	}

}
