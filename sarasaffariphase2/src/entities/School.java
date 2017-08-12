package entities;

import java.util.ArrayList;
import java.util.Vector;

public class School {
	//class fields
	private String school_name;
	boolean house;
	int number_of_students;
	private String school_location;
	private ArrayList<String> courses;
	private ArrayList<String> houses;
	private Vector<String> students;
	private Vector<String> professors;
	
	//class constructors
	public School(String _school_name) {school_name = _school_name;}
	public School(String _school_name, ArrayList<String> _houses, ArrayList<String> _courses
			, Vector<String> _students, Vector<String> _professors)
	{
		set_name(_school_name);
		set_house_Names(_houses);
		set_course_Names(_courses);
		set_student_Names(_students);
		set_professor_Names(_professors);
	}
	
	//private field getter(s)
	public ArrayList<String> get_courseNames() {
		return courses;
	}
	public ArrayList<String> get_houseNames() {
		return houses;
	}
	public Vector<String> get_studentNames() {
		return students;
	}
	public Vector<String> get_professorNames() {
		return professors;
	}
	public String get_name() {
		return school_name;
	}
	public String get_school_location() {
		return school_location;
	}
	
	//private field setter(s)
	public void set_name(String _school_name) {
		school_name = _school_name;
	}
	public void set_professor_Names(Vector<String> _professors) {
		professors = _professors;
	}
	public void set_student_Names(Vector<String> _students) {
		students = _students;	
	}
	public void set_house_Names(ArrayList<String> _houses) {
		houses = _houses;		
	}
	public void set_course_Names(ArrayList<String> _courses) {
		courses = _courses;
	}
	public void set_school_location(String _school_location) {
		school_location = _school_location;
	}
}