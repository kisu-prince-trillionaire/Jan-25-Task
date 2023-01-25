package com.demo.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Adress {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int adsId;
	@Column(length= 50)
	private String street;
	@Column(length= 50)
	private String city;
	@Column(length= 50)
	private String state;
	@Column(length= 50)
	private String country;
	@Column
	private int zip;
	
	//Column to store an image
//	@Column
//	private byte[] image;

	public Adress(int adsId, String street, String city, String state, String country, int zip) {
		super();
		this.adsId = adsId;
		this.street = street;
		this.city = city;
		this.state = state;
		this.country = country;
		this.zip = zip;
	}

	public Adress() {
		super();
	}

	public int getAdsId() {
		return adsId;
	}

	public void setAdsId(int adsId) {
		this.adsId = adsId;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}

	@Override
	public String toString() {
		return "Adress [adsId=" + adsId + ", street=" + street + ", city=" + city + ", state=" + state + ", country="
				+ country + ", zip=" + zip + "]";
	}
}
