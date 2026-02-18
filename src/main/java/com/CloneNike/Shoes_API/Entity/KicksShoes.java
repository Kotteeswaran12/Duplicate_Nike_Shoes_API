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
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class KicksShoes {

	public List<ShoesColors> getColors() {
		return colors;
	}

	public void setColors(List<ShoesColors> colors) {
		this.colors = colors;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String name;
	private String brand;
	private String category;
	private String gender;
	private double price;
	private double rating;

	@OneToMany(mappedBy = "kicksShoe", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JsonManagedReference
	private List<ShoesImages> img;

	@OneToOne(mappedBy = "shoes", cascade = CascadeType.ALL)
	@JsonManagedReference
	private ShoeDetails details;

	@OneToMany(mappedBy = "kicksShoes", cascade = CascadeType.ALL)
	@JsonManagedReference
	private List<ShoesSize> size;

	@OneToMany(mappedBy = "kicksShoes", cascade = CascadeType.ALL)
	@JsonManagedReference
	private List<ShoesColors> colors;
	
	
	@OneToMany(mappedBy = "kicksShoes" , cascade = CascadeType.ALL)
	@JsonManagedReference
	private List<ShoesReview> reviews;
	
		
	@OneToMany(mappedBy = "kicksShoes" , cascade = CascadeType.ALL)
	@JsonManagedReference
	private List<ShoesTags> tags;

	public List<ShoesReview> getReviews() {
		return reviews;
	}

	public void setReviews(List<ShoesReview> reviews) {
		this.reviews = reviews;
	}

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

	public ShoeDetails getDetails() {
		return details;
	}

	public void setDetails(ShoeDetails details) {
		this.details = details;
	}

	public List<ShoesSize> getSize() {
		return size;
	}

	public void setSize(List<ShoesSize> size) {
		this.size = size;
	}
	
	

	public List<ShoesTags> getTags() {
		return tags;
	}

	public void setTags(List<ShoesTags> tags) {
		this.tags = tags;
	}

	@Override
	public String toString() {
		return "KicksShoes [id=" + id + ", name=" + name + ", brand=" + brand + ", category=" + category + ", gender="
				+ gender + ", price=" + price + ", rating=" + rating + ", img=" + img + ", details=" + details
				+ ", size=" + size + ", colors=" + colors + ", reviews=" + reviews + ", tags=" + tags + "]";
	}

}
