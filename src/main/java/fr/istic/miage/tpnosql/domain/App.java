package fr.istic.miage.tpnosql.domain;

import java.io.ObjectInputStream.GetField;
import java.net.UnknownHostException;
import java.util.ArrayList;

import com.google.code.morphia.Datastore;
import com.google.code.morphia.Morphia;
import com.mongodb.Mongo;

/**
 * Hello world!
 * 
 */
public class App {
	public static void main(String[] args) throws UnknownHostException {
		ArrayList<Address> a = new ArrayList<Address>();
		ArrayList<Address> a1 = new ArrayList<Address>();
		
		ArrayList<Article> art = new ArrayList<Article>();
		Article at = new Article();
		Article at1 = new Article();
	 
		at.setName("tele");
		at.setStars(1);
		at1.setName("radio");
		at1.setStars(1);

		art.add(at);
		art.add(at1);

		Morphia morphia = new Morphia();
		Mongo mongo = new Mongo();
		morphia.map(Person.class).map(Address.class);
		Datastore ds = morphia.createDatastore(mongo, "my_database");
		
		Person p = new Person();
		Person p1 = new Person();
		Person p2 = new Person();
	
		p.setNom("Tintin");
		p1.setNom("tit");
		p.setAr(art);
		p1.setAr(art);

		Address address = new Address();
		Address address1 = new Address();
		address.setStreet("123 Some street");
		address.setCity("Some city");
		address.setPostCode("123 456");
		address.setCountry("Some country");
		a.add(address);

		address1.setStreet("150Logone");
		address1.setCity("chicago");
		address1.setPostCode("123 456");
		address1.setCountry("USA");
		a1.add(address1);

		// set address
		p.setAd(a);
		p1.setAd(a1);
		// Save the POJO
		ds.save(p);
		
		for (Article article : ds.find(Article.class)){
		
		for (Person personne : ds.find(Person.class))
			
		{
			for (Address addresseP : ds.find(Address.class)){
				System.err.println("L'article"+article.getName()+"Appartient a"+personne.getNom()+"qui habite"+addresseP.getCity());
			}
		}
		

		
		}
		// Affichage des personne

	}
}
