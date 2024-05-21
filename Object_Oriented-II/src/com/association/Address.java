package com.association;

public class Address {
    private int streetNumber;
    private String city;
    private String state;
    private String country;
	public Address(int streetNumber, String city, String state, String country) {
		super();
		this.streetNumber = streetNumber;
		this.city = city;
		this.state = state;
		this.country = country;
	}
	@Override
	public String toString() {
		return "Address [streetNumber=" + streetNumber + ", city=" + city + ", state=" + state + ", country=" + country
				+ "]";
	}
	
}
