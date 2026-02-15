package com.CloneNike.Shoes_API.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class ShoesImages {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String imgName;
	private String imgLink;
	
	@ManyToOne
	@JoinColumn(name = "Shoe_id")
	@JsonBackReference
	private NikeShoes nikeShoes;
	
	
	

	public NikeShoes getNikeShoes() {
		return nikeShoes;
	}

	public void setNikeShoes(NikeShoes nikeShoes) {
		this.nikeShoes = nikeShoes;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getImgName() {
		return imgName;
	}

	public void setImgName(String imgName) {
		this.imgName = imgName;
	}

	public String getImgLink() {
		return imgLink;
	}

	public void setImgLink(String imgLink) {
		this.imgLink = imgLink;
	}

	@Override
	public String toString() {
		return "ShoesImages [id=" + id + ", imgName=" + imgName + ", imgLink=" + imgLink + "]";
	}

	

}
