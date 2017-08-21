package services;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Vector;
import entities.*;

public class HouseServices {
	//fields
	private Vector<House> allHouses;
	
	//constructors
	public HouseServices() {
		allHouses = new Vector<House>();
	}
	//methods
	public void getData(String filename) throws IOException{
			
		String line;
	    BufferedReader in;

        in = new BufferedReader(new FileReader(filename));
        line = in.readLine();

        while(line != "$") //finish condition- $ means end of file
        {
        	line = in.readLine(); //getting house name
        	String houseName = "";
        	houseName = line;
		        	 
        	line = in.readLine(); //getting related school
        	School s = new School(line, true);
	        	
        	line = in.readLine(); //getting number of students
        	int numberOfStudents = -1;
        	numberOfStudents = Integer.parseInt(line);
		       
        	Vector<Student> _students = new Vector<Student>();
    		for(;numberOfStudents > 0; numberOfStudents--) {
    			line = in.readLine();
    			_students.add(new Student(line));
        	}
    		
        	line = in.readLine(); //to get rid of * at the end of each course
        	
        	House newHouse = new House(houseName, s);
        	allHouses.add(newHouse);
        } 
	    in.close();
	}
}
