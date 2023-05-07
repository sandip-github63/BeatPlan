package com.isfa.BeatPlan.response;

import java.time.LocalDate;

public class BeatDto {

	private long pjpId;

	private long storeId;

	private LocalDate pjpDate;

	private String storeCode;

	private String storeName;

	private String storeCategory;

	private String address;

	private String latitude;

	String longitude;

	private boolean activeStatus;

	private String storeImage1;

	private String phoneNo;

	private boolean isMarkin = false;

	public String getStoreCode() {
		return storeCode;
	}

	public void setStoreCode(String storeCode) {
		this.storeCode = storeCode;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public boolean isMarkin() {
		return isMarkin;
	}

	public void setMarkin(boolean isMarkin) {
		this.isMarkin = isMarkin;
	}

	public BeatDto(long pjpId, long storeId, LocalDate pjpDate, String storecode, String storeName,
			String storeCategory, String address, String latitude, String longitude, boolean activeStatus,
			String storeImage1, String phoneNo) {
		super();
		this.pjpId = pjpId;
		this.storeId = storeId;
		this.pjpDate = pjpDate;
		this.storeCode = storecode;
		this.storeName = storeName;
		this.storeCategory = storeCategory;
		this.address = address;
		this.latitude = latitude;
		this.longitude = longitude;
		this.activeStatus = activeStatus;
		this.storeImage1 = storeImage1;
		this.phoneNo = phoneNo;
	}

	public BeatDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getPjpId() {
		return pjpId;
	}

	public void setPjpId(long pjpId) {
		this.pjpId = pjpId;
	}

	public long getStoreId() {
		return storeId;
	}

	public void setStoreId(long storeId) {
		this.storeId = storeId;
	}

	public LocalDate getPjpDate() {
		return pjpDate;
	}

	public void setPjpDate(LocalDate pjpDate) {
		this.pjpDate = pjpDate;
	}

	public String getStorecode() {
		return storeCode;
	}

	public void setStorecode(String storecode) {
		this.storeCode = storecode;
	}

	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public String getStoreCategory() {
		return storeCategory;
	}

	public void setStoreCategory(String storeCategory) {
		this.storeCategory = storeCategory;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public boolean getActiveStatus() {
		return activeStatus;
	}

	public void setActiveStatus(boolean activeStatus) {
		this.activeStatus = activeStatus;
	}

	public String getStoreImage1() {
		return storeImage1;
	}

	public void setStoreImage1(String storeImage1) {
		this.storeImage1 = storeImage1;
	}

	public String getMobileNumber() {
		return phoneNo;
	}

	public void setMobileNumber(String phoneNo) {
		this.phoneNo = phoneNo;
	}

}
