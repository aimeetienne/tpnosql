package fr.istic.miage.tpnosql.domain;

import java.net.UnknownHostException;
import java.util.ArrayList;

import com.google.code.morphia.Datastore;
import com.google.code.morphia.Morphia;
import com.mongodb.Mongo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws UnknownHostException
    {
        ArrayList<Address>a= new ArrayList<Address>();
        
        ArrayList<Article> art= new ArrayList<Article>();
        Article at= new Article();
        at.setName("tele");
        at.setStars(1);
        
        art.add(at);
        
    	Morphia morphia = new Morphia();
    	Mongo mongo = new Mongo();
    	morphia.map(Person.class).map(Address.class);
    	Datastore ds = morphia.createDatastore(mongo, "my_database");
    	Person p = new Person();
    	p.setAr(art);
    	p.setNom("Tintin");
    	
    	
    	Address address = new Address();
    	address.setStreet("123 Some street");
    	address.setCity("Some city");
    	address.setPostCode("123 456");
    	address.setCountry("Some country");
    	a.add(address);
    	//set address
    	p.setAd(a);
    	// Save the POJO
    	ds.save(p);
    	for (Person e : ds.find(Person.class))
    	System.err.println(e);
    	
    }
}
