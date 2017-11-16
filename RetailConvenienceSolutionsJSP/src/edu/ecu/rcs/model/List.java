/**
 * Copyright 2017
 * SENG 6240 - Group 3
 * All Rights Reserved
 */
package edu.ecu.rcs.model;

import java.sql.Date;

public class List {
	
	private int listId;
	private String listType;
	private String listName;
	private Date creationDate;
	private int ownerId;
	
	public List() {
		
	}

	public List(int listId, String listType, String listName, Date creationDate, int ownerId) {
		this.listId = listId;
		this.listType = listType;
		this.listName = listName;
		this.creationDate = creationDate;
		this.ownerId = ownerId;
	}

	public int getListId() {
		return listId;
	}

	public void setListId(int listId) {
		this.listId = listId;
	}

	public String getListType() {
		return listType;
	}

	public void setListType(String listType) {
		this.listType = listType;
	}

	public String getListName() {
		return listName;
	}

	public void setListName(String listName) {
		this.listName = listName;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public int getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(int ownerId) {
		this.ownerId = ownerId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((creationDate == null) ? 0 : creationDate.hashCode());
		result = prime * result + listId;
		result = prime * result + ((listName == null) ? 0 : listName.hashCode());
		result = prime * result + ((listType == null) ? 0 : listType.hashCode());
		result = prime * result + ownerId;
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
		List other = (List) obj;
		if (creationDate == null) {
			if (other.creationDate != null)
				return false;
		} else if (!creationDate.equals(other.creationDate))
			return false;
		if (listId != other.listId)
			return false;
		if (listName == null) {
			if (other.listName != null)
				return false;
		} else if (!listName.equals(other.listName))
			return false;
		if (listType == null) {
			if (other.listType != null)
				return false;
		} else if (!listType.equals(other.listType))
			return false;
		if (ownerId != other.ownerId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "List [listId=" + listId + ", listType=" + listType + ", listName=" + listName + ", creationDate="
				+ creationDate + ", ownerId=" + ownerId + "]";
	}

}
