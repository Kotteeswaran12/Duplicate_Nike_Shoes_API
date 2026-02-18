package com.CloneNike.Shoes_API.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class ShoesTags {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "tag_id")
	private Tags tags;

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

	public Tags getTags() {
		return tags;
	}

	public void setTags(Tags tags) {
		this.tags = tags;
	}

	public KicksShoes getKicksShoes() {
		return kicksShoes;
	}

	public void setKicksShoes(KicksShoes kicksShoes) {
		this.kicksShoes = kicksShoes;
	}

	@Override
	public String toString() {
		return "ShoesTags [id=" + id + ", tags=" + tags + ", kicksShoes=" + kicksShoes + "]";
	}

}
