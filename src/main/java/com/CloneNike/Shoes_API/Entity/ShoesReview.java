package com.CloneNike.Shoes_API.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class ShoesReview {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String comment;
	private String userName;
	private double rating;
	private String createdAt;
	
	@ManyToOne
	@JoinColumn(name = "ShoesId")
	@JsonBackReference
	private KicksShoes kicksShoes;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public String getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public KicksShoes getKicksShoes() {
		return kicksShoes;
	}

	public void setKicksShoes(KicksShoes kicksShoes) {
		this.kicksShoes = kicksShoes;
	}

	@Override
	public String toString() {
		return "ShoesReview [id=" + id + ", comment=" + comment + ", userName=" + userName + ", rating=" + rating
				+ ", createdAt=" + createdAt + ", kicksShoes=" + kicksShoes + "]";
	}
	
	
}
