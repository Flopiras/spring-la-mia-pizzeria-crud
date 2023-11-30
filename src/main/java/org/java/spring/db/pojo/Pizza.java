package org.java.spring.db.pojo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Pizza {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(columnDefinition = "TEXT")
	private String description;
	
	@Column
	private String urlImage;
	
	@Column
	private float price;
	
	public Pizza() { } 
	public Pizza(String description, String urlImage, float price) {
		
	setDescription(description);
	setUrlImage(urlImage);
	setPrice(price);
	
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getUrlImage() {
		return urlImage;
	}
	public void setUrlImage(String urlImage) {
		this.urlImage = urlImage;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		
		return "Pizza [" + getId() + "]" + "n"
				+ getDescription() + "\n"
				+ "Prezzo: € " + getPrice();
	}

}
