package fr.istic.miage.tpnosql.domain;

import java.util.ArrayList;

import org.bson.types.ObjectId;

import com.google.code.morphia.annotations.Embedded;
import com.google.code.morphia.annotations.Entity;
import com.google.code.morphia.annotations.Id;
import com.google.code.morphia.annotations.Reference;
 


@Entity("Personne")
public class Person {
	  @Id ObjectId id; 
	 
	private String nom;
	private String prenom;
	@Embedded
	
	private ArrayList<Address> ad= new ArrayList<Address>();
	@Embedded
	private ArrayList<Article> ar=new ArrayList<Article>();
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public ArrayList<Address> getAd() {
		return ad;
	}
	public void setAd(ArrayList<Address> ad) {
		this.ad = ad;
	}
	public ArrayList<Article> getAr() {
		return ar;
	}
	public void setAr(ArrayList<Article> ar) {
		this.ar = ar;
	}
	

}
