package entities;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

public class Main {
	public static void main(String[] args) {
		
		//need to have class school before house
		String _school_name = " ";
		boolean _house = false;
		int _number_of_students = 0;
		String _school_location = "  ";
		ArrayList<String> _all_courses = new ArrayList<String>();
		ArrayList<String> _houses = new ArrayList<String>();
		Vector<String> _students = new Vector<String>();
		Vector<String> _professors = new Vector<String>();
		//now we can have an object of class school
		School s = new School(_school_name, _houses, _all_courses, _students, _professors);
		System.out.println("we have an object of school class");
		
		//need to have class professor before house
		Map<Integer,Course> _courses = new HashMap<Integer,Course>();
		String _note = " ";
		//now we can have an object of class professor 
		Professor pro = new Professor(_courses, _note); 
		System.out.println("we have an object of professor class");
		
		//need to have class house before person
		String _house_name = " ";
		School _related_school = s;
		Vector<Student> _all_students = new Vector<Student>();
		Professor _head_teacher = pro ;
		ArrayList<String> _qualities = new ArrayList<String>();
		Map<Integer,Course> _prefects = new HashMap<Integer,Course>();
		//now we can have an object of class house
		House h = new House(_house_name, _related_school, _all_students, _head_teacher, _qualities, _prefects);
		System.out.println("we have an object of house class");
		
		//need to have blood status to create class person
		BloodStatus _blood_status = null;
		
		//now finally class person
		Person p = new Person(_school_name, _number_of_students, h, _blood_status );
	}

}
