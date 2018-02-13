package org.ashik.dto;

import javax.persistence.Column;
import javax.persistence.Embeddable;
@Embeddable
public class Phones {
	@Column(name="MOBILE_NO")
	private String mobileNo;
	@Column(name="LAND_NO")
	private String landNo;
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getLandNo() {
		return landNo;
	}
	public void setLandNo(String landNo) {
		this.landNo = landNo;
	}
	@Override
	public String toString() {
		return "Phones [mobileNo=" + mobileNo + ", landNo=" + landNo + "]";
	}
}
