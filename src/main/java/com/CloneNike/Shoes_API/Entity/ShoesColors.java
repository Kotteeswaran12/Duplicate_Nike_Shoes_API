package com.CloneNike.Shoes_API.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class ShoesColors {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String colorName;

	@ManyToOne
	@JoinColumn(name = "shoes_id")
	@JsonBackReference
	private KicksShoes kicksShoes;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getColorName() {
		return colorName;
	}

	public void setColorName(String colorName) {
		this.colorName = colorName;
	}

	public KicksShoes getKicksShoes() {
		return kicksShoes;
	}

	public void setKicksShoes(KicksShoes kicksShoes) {
		this.kicksShoes = kicksShoes;
	}

	@Override
	public String toString() {
		return "ShoesColors [id=" + id + ", colorName=" + colorName + ", kicksShoes=" + kicksShoes + "]";
	}

}
