package com.isfa.BeatPlan.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "TT_PJPINFO")
@JsonInclude(Include.NON_NULL)
public class PjpInfo {

	@Id
	@Column(name = "pjp_id")
	long pjpId;

	@Column(name = "pjp_date")
	LocalDate pjpDate;

	@Column(name = "user_id")
	long userId;

	String active;

	@Column(name = "date_created")
	LocalDateTime dateCreated;

	@Column(name = "createdby")
	String createdBy;

	@Column(name = "campaign_id")
	Long companyId;

	@Column(name = "date_modified")
	LocalDateTime dateModified;

	@Column(name = "modifiedby")
	String modifiedby;

	String Source;

	String Remarks;
//
//	@Column(name = "store_id", insertable = false, updatable = false)
	long storeId;

	// mappping

//	@ManyToOne(fetch = FetchType.LAZY)
//	@JoinColumn(name = "store_id")
//	@JsonIgnoreProperties("store_id")
//	private StoreDetail store;

//	public StoreDetail getStore() {
//		return store;
//	}
//
//	public void setStore(StoreDetail store) {
//		this.store = store;
//	}

	public long getPjpId() {
		return pjpId;
	}

	public void setPjpId(long pjpId) {
		this.pjpId = pjpId;
	}

	public LocalDate getPjpDate() {
		return pjpDate;
	}

	public void setPjpDate(LocalDate pjpDate) {
		this.pjpDate = pjpDate;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getActive() {
		return active;
	}

	public void setActive(String active) {
		this.active = active;
	}

	public LocalDateTime getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(LocalDateTime dateCreated) {
		this.dateCreated = dateCreated;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Long getCampanyId() {
		return companyId;
	}

	public void setCampaignId(Long companyId) {
		this.companyId = companyId;
	}

	public LocalDateTime getDateModified() {
		return dateModified;
	}

	public void setDateModified(LocalDateTime dateModified) {
		this.dateModified = dateModified;
	}

	public String getModifiedby() {
		return modifiedby;
	}

	public void setModifiedby(String modifiedby) {
		this.modifiedby = modifiedby;
	}

	public String getSource() {
		return Source;
	}

	public void setSource(String source) {
		Source = source;
	}

	public String getRemarks() {
		return Remarks;
	}

	public void setRemarks(String remarks) {
		Remarks = remarks;
	}

	public long getStoreId() {
		return storeId;
	}

	public void setStoreId(long storeId) {
		this.storeId = storeId;
	}

}
