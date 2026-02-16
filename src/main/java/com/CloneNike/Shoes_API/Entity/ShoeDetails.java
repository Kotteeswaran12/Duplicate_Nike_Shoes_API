package com.CloneNike.Shoes_API.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class ShoeDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String material;
	private String description;

	@OneToOne
	@JoinColumn(name = "Shoes_id")
	@JsonBackReference
	private KicksShoes shoes;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public KicksShoes getShoes() {
		return shoes;
	}

	public void setShoes(KicksShoes shoes) {
		this.shoes = shoes;
	}

	@Override
	public String toString() {
		return "ShoeDetails [id=" + id + ", material=" + material + ", description=" + description + ", shoes=" + shoes
				+ "]";
	}

}
