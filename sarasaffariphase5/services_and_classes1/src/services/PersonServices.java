package services;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Vector;
import entities.*;
public class PersonServices {
	//fields
	private Vector<Person> allPersons;
	
	//constructors
	public void PersonService() {
		allPersons = new Vector<Person>();
	}
	//methods
	public void getData(String filename) throws IOException {

		String line;
        BufferedReader in;

        in = new BufferedReader(new FileReader(filename));
        line = in.readLine();

        while(line != "$") //finish condition- $ means end of file
        {
        	line = in.readLine(); //getting person's name
        	String personName = "";
        	personName = line;
        	 
        	boolean housed = false;
        	
        	line = in.readLine(); //getting person's house
        	House h = new House();
        	if (line != "N/A") { 
        		h.setName(line);
        		housed = true;
        	}
        	
        	line = in.readLine(); //getting person's blood status
        	BloodStatus bs = null;
        	bs = BloodStatus.valueOf(line);
        		
        	line = in.readLine(); //getting person's school
        	School s = new School(line, housed);
        	
        	line = in.readLine(); //getting person's birthday 
    		String birthday = "";
       		birthday = line;
       	
        	line = in.readLine(); //to get rid of * at the end of each school
        	
        	Person newPerson = new Person(personName, h, bs, s, birthday);
        	allPersons.add(newPerson);
        	in.close();
         }
	}
}