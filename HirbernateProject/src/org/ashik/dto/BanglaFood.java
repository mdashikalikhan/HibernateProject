package org.ashik.dto;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class BanglaFood extends Food {
	@Column(name = "FOOD_BANGLA_ITEMS")
	private String banglaItems;

	public String getBanglaItems() {
		return banglaItems;
	}

	public void setBanglaItems(String banglaItems) {
		this.banglaItems = banglaItems;
	}

}
