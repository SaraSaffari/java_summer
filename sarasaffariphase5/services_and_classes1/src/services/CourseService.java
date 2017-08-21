package services;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Vector;
import entities.*;

public class CourseService {
	//fields
	private Vector<Course> allCourses;
	
	//constructors
	public CourseService(){
		allCourses = new Vector<Course>();
	}
	//methods
	//note : the method(couse) was for phase4 so it is't here...
	public void getData(String filename) throws IOException{
		
		String line;
	    BufferedReader in;

        in = new BufferedReader(new FileReader(filename));
        line = in.readLine();

        while(line != "$") //finish condition- $ means end of file
        {

        	line = in.readLine(); //getting course name
        	String courseName = "";
        	courseName = line;
	        	 

        	line = in.readLine(); //getting course's minimum grade
        	Grades g = null;
        	g = Grades.valueOf(line);
        	
        	line = in.readLine(); //getting course's professor's name
        	String profName = line;
        	Professor prof = new Professor(profName);
        	
        	line = in.readLine(); //getting year
        	int year = -1;
        	year = Integer.parseInt(line);
	        	 
        	line = in.readLine(); //getting number of students in this course
        	int numberOfStudents = -1;
        	numberOfStudents = Integer.parseInt(line);
        	Vector<Student> _students = new Vector<Student>();
        	
        	if (line != "N/A") {
        		for(;numberOfStudents > 0; numberOfStudents--){
        			line = in.readLine();
        			_students.add(new Student(line));
        		 }
        	} 
        	
        	line = in.readLine(); //to get rid of * at the end of each course
        	
        	Course newCourse = new Course(courseName, g, prof, year, _students);
        	allCourses.add(newCourse);
        	in.close();
         }
    }
	public void setData(){
		
	}

}