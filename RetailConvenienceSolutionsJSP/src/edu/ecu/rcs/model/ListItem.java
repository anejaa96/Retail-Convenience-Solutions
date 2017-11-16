/**
 * Copyright 2017
 * SENG 6240 - Group 3
 * All Rights Reserved
 */
package edu.ecu.rcs.model;

import java.sql.Date;

public class ListItem {
	
	private int listItemId;
	private String listItemName;
	private Date creationDate;
	private int itemId;
	private int listId;
	
	public ListItem() {
		
	}

	public ListItem(int listItemId, String listItemName, Date creationDate, int itemId, int listId) {
		this.listItemId = listItemId;
		this.listItemName = listItemName;
		this.creationDate = creationDate;
		this.itemId = itemId;
		this.listId = listId;
	}

	public int getListItemId() {
		return listItemId;
	}

	public void setListItemId(int listItemId) {
		this.listItemId = listItemId;
	}

	public String getListItemName() {
		return listItemName;
	}

	public void setListItemName(String listItemName) {
		this.listItemName = listItemName;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public int getListId() {
		return listId;
	}

	public void setListId(int listId) {
		this.listId = listId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((creationDate == null) ? 0 : creationDate.hashCode());
		result = prime * result + itemId;
		result = prime * result + listId;
		result = prime * result + listItemId;
		result = prime * result + ((listItemName == null) ? 0 : listItemName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ListItem other = (ListItem) obj;
		if (creationDate == null) {
			if (other.creationDate != null)
				return false;
		} else if (!creationDate.equals(other.creationDate))
			return false;
		if (itemId != other.itemId)
			return false;
		if (listId != other.listId)
			return false;
		if (listItemId != other.listItemId)
			return false;
		if (listItemName == null) {
			if (other.listItemName != null)
				return false;
		} else if (!listItemName.equals(other.listItemName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ListItem [listItemId=" + listItemId + ", listItemName=" + listItemName + ", creationDate="
				+ creationDate + ", itemId=" + itemId + ", listId=" + listId + "]";
	}

}
