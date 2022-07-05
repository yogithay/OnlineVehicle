package com.cg.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Driver {
	@Id
	 @GeneratedValue(strategy=GenerationType.AUTO)
	 private int driverId;
	 
	 @Column(name="firstName")
	 private String driverFirstName;
	 
	 @Column(name="lastName")
	 private String driverLastName;
	 
	 @Column(name="address")
	 private String driverAddress;
	 
	 @Column(name="mobileNumber")
	 private String driverMobileNumber;
	 
	 @Column(name="emailId")
	 private String driverEmailId;
	 
	 @Column(name="licenseNo")
	 private String driverLicenseNo;
	 
	 public Driver() {}

	public Driver(int driverId, String driverFirstName, String driverLastName, String driverAddress,
			String driverMobileNumber, String driverEmailId, String driverLicenseNo) {
		super();
		this.driverId = driverId;
		this.driverFirstName = driverFirstName;
		this.driverLastName = driverLastName;
		this.driverAddress = driverAddress;
		this.driverMobileNumber = driverMobileNumber;
		this.driverEmailId = driverEmailId;
		this.driverLicenseNo = driverLicenseNo;
	}

	public int getDriverId() {
		return driverId;
	}

	public void setDriverId(int driverId) {
		this.driverId = driverId;
	}

	public String getDriverFirstName() {
		return driverFirstName;
	}

	public void setDriverFirstName(String driverFirstName) {
		this.driverFirstName = driverFirstName;
	}

	public String getDriverLastName() {
		return driverLastName;
	}

	public void setDriverLastName(String driverLastName) {
		this.driverLastName = driverLastName;
	}

	public String getDriverAddress() {
		return driverAddress;
	}

	public void setDriverAddress(String driverAddress) {
		this.driverAddress = driverAddress;
	}

	public String getDriverMobileNumber() {
		return driverMobileNumber;
	}

	public void setDriverMobileNumber(String driverMobileNumber) {
		this.driverMobileNumber = driverMobileNumber;
	}

	public String getDriverEmailId() {
		return driverEmailId;
	}

	public void setDriverEmailId(String driverEmailId) {
		this.driverEmailId = driverEmailId;
	}

	public String getDriverLicenseNo() {
		return driverLicenseNo;
	}

	public void setDriverLicenseNo(String driverLicenseNo) {
		this.driverLicenseNo = driverLicenseNo;
	}

	@Override
	public String toString() {
		return "Driver [driverId=" + driverId + ", driverFirstName=" + driverFirstName + ", driverLastName="
				+ driverLastName + ", driverAddress=" + driverAddress + ", driverMobileNumber=" + driverMobileNumber
				+ ", driverEmailId=" + driverEmailId + ", driverLicenseNo=" + driverLicenseNo + "]";
	}
	 

}
