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
		ArrayList<String> all_courses = new ArrayList<String>();
		ArrayList<String> _houses = new ArrayList<String>();
		Vector<String> _students = new Vector<String>();
		Vector<String> _professors = new Vector<String>();
		//now we can have an object of class school
		School s = new School(_school_name, _houses, all_courses, _students, _professors);
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
		Vector<Student> all_students = new Vector<Student>();
		Professor _head_teacher = pro ;
		ArrayList<String> _qualities = new ArrayList<String>();
		Map<Integer,Course> _prefects = new HashMap<Integer,Course>();
		//now we can have an object of class house
		House h = new House(_house_name, _related_school, all_students, _head_teacher, _qualities, _prefects);
		System.out.println("we have an object of house class");
		
		//need to have blood status to create class person
		BloodStatus _blood_status = null;
		
		//now finally class person
		Person p = new Person(_school_name, _number_of_students, h, _blood_status);
		
		/*pro.set_courses(_courses);
		pro.set_note(_note);
		System.out.println(pro.get_note());
		System.out.println(pro.get_courses());
*/
		h.set_house_name(_school_name);
		h.set_head_teacher(_head_teacher);
		h.set_prefects(_prefects);
		h.set_qualities(_qualities);
		h.set_related_school(_related_school);
		h.set_students(all_students);
		System.out.println(h.get_house_name());
		System.out.println(h.get_head_teacher());
		System.out.println(h.get_prefects());
		System.out.println(h.get_qualities());
		System.out.println(h.get_related_school());
		System.out.println(h.get_students());
		
		
		
		
	}

}
