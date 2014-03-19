package fr.istic.miage.tpnosql.domain;

import java.util.ArrayList;
import java.util.List;

import org.bson.types.ObjectId;

import com.google.code.morphia.annotations.Embedded;
import com.google.code.morphia.annotations.Entity;
import com.google.code.morphia.annotations.Id;
import com.google.code.morphia.annotations.Reference;
 


@Entity("Personne")
public class Person {
	  @Override
	public String toString() {
		return "Person [id=" + id + ", nom=" + nom + ", prenom=" + prenom
				+ ", ad=" + ad + ", ar=" +   "]";
	}
	@Id ObjectId id; 
	 
	private String nom;
	private String prenom;
	@Embedded
	private List<Address> ad= new ArrayList<Address>();
	
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
	public  List<Address> getAd() {
		return ad;
	}
	public void setAd(ArrayList<Address> ad) {
		this.ad = ad;
	}
	 
	

}
