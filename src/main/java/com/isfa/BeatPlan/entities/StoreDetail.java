package com.isfa.BeatPlan.entities;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;

@Entity
//@Data
//@NoArgsConstructor
//@AllArgsConstructor
@Table(name = "store_detail")
public class StoreDetail {

//	@Column(name = "cluster_id")
//	private Long clusterId;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "store_id")
	private Long storeId;

	@Column(name = "store_code")
	private String storeCode;

	@Column(name = "store_name")
	private String storeName;

	@Column(name = "address")
	private String address;

	@Column(name = "store_category")
	private String storeCategory;

	@Column(name = "latitude")
	private String latitude;

	@Column(name = "longitude")
	private String longitude;

	@Column(name = "activestatus")
	private Boolean activeStatus;

	@Column(name = "campaign_id")
	private Long campaignId;

	@Column(name = "store_image")
	private String storeImage1;

	@Column(name = "store_branch")
	private String storeBranch;

	@Column(name = "store_type")
	private String storeType;

	@Column(name = "location")
	private String location;

	@Column(name = "phoneno")
	private String phoneNo;

	@Column(name = "created_date")
	private LocalDateTime createdDate;

	@Column(name = "created_by")
	private String createdBy;

	@Column(name = "modified_date")
	private LocalDateTime updatedDate;

	@Column(name = "modified_by")
	private String updatedBy;

	@Column(name = "zipcode")
	private Long zipcode;

	@Column(name = "flg_user_zipcode")
	private Boolean flgUserZipcode;

	@Column(name = "contact_name")
	private String contactName;

//	public Long getClusterId() {
//		return clusterId;
//	}
//
//	public void setClusterId(Long clusterId) {
//		this.clusterId = clusterId;
//	}

	public Long getStoreId() {
		return storeId;
	}

	public void setStoreId(Long storeId) {
		this.storeId = storeId;
	}

	public String getStoreCode() {
		return storeCode;
	}

	public void setStoreCode(String storeCode) {
		this.storeCode = storeCode;
	}

	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getStoreCategory() {
		return storeCategory;
	}

	public void setStoreCategory(String storeCategory) {
		this.storeCategory = storeCategory;
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

	public Boolean getActiveStatus() {
		return activeStatus;
	}

	public void setActiveStatus(Boolean activeStatus) {
		this.activeStatus = activeStatus;
	}

	public Long getCampaignId() {
		return campaignId;
	}

	public void setCampaignId(Long campaignId) {
		this.campaignId = campaignId;
	}

	public String getStoreImage1() {
		return storeImage1;
	}

	public void setStoreImage1(String storeImage1) {
		this.storeImage1 = storeImage1;
	}

	public String getStoreBranch() {
		return storeBranch;
	}

	public void setStoreBranch(String storeBranch) {
		this.storeBranch = storeBranch;
	}

	public String getStoreType() {
		return storeType;
	}

	public void setStoreType(String storeType) {
		this.storeType = storeType;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public LocalDateTime getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(LocalDateTime updatedDate) {
		this.updatedDate = updatedDate;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Long getZipcode() {
		return zipcode;
	}

	public void setZipcode(Long zipcode) {
		this.zipcode = zipcode;
	}

	public Boolean getFlgUserZipcode() {
		return flgUserZipcode;
	}

	public void setFlgUserZipcode(Boolean flgUserZipcode) {
		this.flgUserZipcode = flgUserZipcode;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public StoreDetail() {
		super();
		// TODO Auto-generated constructor stub
	}

}
