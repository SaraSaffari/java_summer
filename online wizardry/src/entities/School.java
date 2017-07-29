package entities;

import java.util.ArrayList;
//import java.util.Iterator;
import java.util.Vector;

public class School {
	private String school_name;
	boolean house;
	int number_of_students;
	ArrayList<String> courses;
	ArrayList<String> houses;
	Vector<String> students;
	Vector<String> professors;
	
	public ArrayList<String> getCourseNames() {
		return courses;
	}
	public ArrayList<String> getHouseNames() {
		return houses;
		/*Iterator<String> i = houses.iterator();
		ArrayList<String> result =  new ArrayList<String>();
		while(i.hasNext()){
			result = houses;
		}
		return result;*/
	}
	public Vector<String> getStudentNames() {
		return students;
	}
	public Vector<String> getProfessorNames() {
		return professors;
	}
	public School(String _school_name) {setName(_school_name);}
	public School(String _school_name, ArrayList<String> _houses, ArrayList<String> _courses
			, Vector<String> _students, Vector<String> _professors)
	{
		setName(_school_name);
		setHouseNames(_houses);
		setCourseNames(_courses);
		setStudentNames(_students);
		setProfessorNames(_professors);
	}
	
	public String getName() {
		return school_name;
	}
	public void setName(String school_name) {
		this.school_name = school_name;
	}
	public void setProfessorNames(Vector<String> _professors) {
		this.professors = _professors;
	}
	public void setStudentNames(Vector<String> _students) {
		this.students = _students;	
	}
	public void setHouseNames(ArrayList<String> _houses) {
		this.houses = _houses;		
	}
	public void setCourseNames(ArrayList<String> _courses) {
		this.courses = _courses;
	}
	

}
