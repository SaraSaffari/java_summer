package services;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
//import java.util.ArrayList;
import java.util.Vector;
import entities.*;

public class StudentService {
	//fields
	private Vector<Student> allStudents;
	
	//constructors
	public StudentService() {
		allStudents = new Vector<Student>();
	}
	//methods
	//note : the two methods(sorting hat and student) were for phase4 so there are't here...
	public void getData(String filename) throws IOException {

		String line;
        BufferedReader in;

        in = new BufferedReader(new FileReader(filename));
        line = in.readLine();

        while(line != "$") //finish condition- $ means end of file
        {
        	line = in.readLine(); //getting student's name
        	String studentName = "";
        	studentName = line;
        	 
        	boolean housed = false;
        	
        	line = in.readLine(); //getting student's house
        	House h = new House();
        	if (line != "N/A") { 
        		h.setName(line);
        		housed = true;
        	}
        	
        	line = in.readLine(); //getting students blood status
        	BloodStatus bs = null;
        	bs = BloodStatus.valueOf(line);
        		
        	line = in.readLine(); //getting student's school
        	School s = new School(line, housed);
        	
        	line = in.readLine(); //getting student's birthday 
    		String birthday = "";
       		birthday = line;
       		
           	int numberOfCourses = -1; //getting student's courses
        	numberOfCourses = Integer.parseInt(line);
        	Vector<Course> _courses = new Vector<Course>();
        	for(;numberOfCourses > 0; numberOfCourses--){
    			line = in.readLine();
    			_courses.add(new Course(line));
    		 }
        	
        	line = in.readLine(); //to get rid of * at the end of each school
        	
        	
        	Student newStudent = new Student(studentName, h, bs, s, birthday, _courses, null);
        	allStudents.add(newStudent);
        	in.close();
         }
	}
}
