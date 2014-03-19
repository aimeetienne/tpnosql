package fr.istic.miage.tpnosql.domain;

import org.bson.types.ObjectId;

import com.google.code.morphia.annotations.Entity;
import com.google.code.morphia.annotations.Id;

@Entity("Adresse")
public class Address {
	private  String street ;
	private  String city ;
	private  String postCode ;
	private  String country ;
	  @Id ObjectId id; 
	
	//private Person p;
	
	
	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + ", postCode="
				+ postCode + ", country=" + country + ", id=" + id + "]";
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
	public String getPostCode() {
		return postCode;
	}
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	 
	
}
