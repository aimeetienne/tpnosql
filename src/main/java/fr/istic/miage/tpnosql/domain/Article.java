package fr.istic.miage.tpnosql.domain;

import java.util.ArrayList;
import java.util.List;

import org.bson.types.ObjectId;

import com.google.code.morphia.annotations.Embedded;
import com.google.code.morphia.annotations.Entity;
import com.google.code.morphia.annotations.Id;

@Entity("Article")
public class Article {

	@Override
	public String toString() {
		return "Article [id=" + id + ", name=" + name + ", stars=" + stars
				+ "]";
	}
	@Id ObjectId id; 
	  private String name;
	  private int stars;
	  @Embedded
		private List<Person> pers=new ArrayList<Person>();
		
	  
	  public ObjectId getId() {
		return id;
	}
	public List<Person> getPers() {
		return pers;
	}
	public void setPers(List<Person> pers) {
		this.pers = pers;
	}
	public void setId(ObjectId id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStars() {
		return stars;
	}
	public void setStars(int stars) {
		this.stars = stars;
	}
	
}
