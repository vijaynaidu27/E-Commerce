package com.sritech.ekart.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="items_list")
public class Item {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="Item_Id")
	private Integer itemId;
	
	@Column(name="Item_name")
	private String itemName;
	
	@Column(name="Items_Short_Code")
	private String itemShortCode;
	
	@Column(name="Item_Category_Id")
	private Integer itemCategoryId;
	
	@Column(name="Item_Category")
	private String itemCategory; 
	
	@Column(name="Item_Description")
	private String itemDescription;
	
	@Column(name="Item_Price")
	private Float itemPrice;
	
	@Column(name="Item_Old_Price")
	private Float itemOldPrice;
	
	@Column(name="Item_Status")
	private String itemStatus;
	
    @Column(name="Date_created")
	private Date dateCreated;
		
	@Column(name="Date_updated")
    private Date dateUpdated;

	public Integer getItemId() {
		return itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemShortCode() {
		return itemShortCode;
	}

	public void setItemShortCode(String itemShortCode) {
		this.itemShortCode = itemShortCode;
	}

	public Integer getItemCategoryId() {
		return itemCategoryId;
	}

	public void setItemCategoryId(Integer itemCategoryId) {
		this.itemCategoryId = itemCategoryId;
	}

	public String getItemCategory() {
		return itemCategory;
	}

	public void setItemCategory(String itemCategory) {
		this.itemCategory = itemCategory;
	}

	public String getItemDescription() {
		return itemDescription;
	}

	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}

	public Float getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(Float itemPrice) {
		this.itemPrice = itemPrice;
	}

	public Float getItemOldPrice() {
		return itemOldPrice;
	}

	public void setItemOldPrice(Float itemOldPrice) {
		this.itemOldPrice = itemOldPrice;
	}

	public String getItemStatus() {
		return itemStatus;
	}

	public void setItemStatus(String itemStatus) {
		this.itemStatus = itemStatus;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public Date getDateUpdated() {
		return dateUpdated;
	}

	public void setDateUpdated(Date dateUpdated) {
		this.dateUpdated = dateUpdated;
	}

	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", itemName=" + itemName + ", itemShortCode=" + itemShortCode
				+ ", itemCategoryId=" + itemCategoryId + ", itemCategory=" + itemCategory + ", itemDescription="
				+ itemDescription + ", itemPrice=" + itemPrice + ", itemOldPrice=" + itemOldPrice + ", itemStatus="
				+ itemStatus + ", dateCreated=" + dateCreated + ", dateUpdated=" + dateUpdated + "]";
	}
	
	
}
