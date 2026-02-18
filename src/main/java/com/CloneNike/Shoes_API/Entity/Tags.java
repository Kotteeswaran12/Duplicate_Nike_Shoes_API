package com.CloneNike.Shoes_API.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Tags {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String tagName;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTagName() {
		return tagName;
	}

	public void setTagName(String tagName) {
		this.tagName = tagName;
	}

	@Override
	public String toString() {
		return "Tags [id=" + id + ", tagName=" + tagName + "]";
	}

}
