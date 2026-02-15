package com.CloneNike.Shoes_API.Entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.annotation.Generated;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class NikeShoes {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String name;
	private String brand;
	private String category;
	private String gender;
	private double price;
	private double rating;

	@OneToMany(mappedBy = "nikeShoes" , cascade = CascadeType.ALL , fetch = FetchType.EAGER)
	@JsonManagedReference
	private List<ShoesImages> img;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public List<ShoesImages> getImg() {
		return img;
	}

	public void setImg(List<ShoesImages> img) {
		this.img = img;
	}

	@Override
	public String toString() {
		return "NikeShoes [id=" + id + ", name=" + name + ", brand=" + brand + ", category=" + category + ", gender="
				+ gender + ", price=" + price + ", rating=" + rating + ", img=" + img + "]";
	}

}
