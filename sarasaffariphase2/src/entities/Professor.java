package entities;

import java.util.Map;

public class Professor extends Person {
	//class fields
	private Map<Integer,Course> courses;
	private String note;
	
	//class constructor
	public Professor(Map<Integer,Course> _courses, String _note){
		courses = _courses;
		note = _note;
	}
	
	//private field getter(s)
	public String get_note() {
		return note;
	}
	public Map<Integer,Course> get_courses() {
		return courses;
	}
	
	//private field setter(s)
	public void set_note(String _note) {
		note = _note;
	}
	public void set_courses(Map<Integer,Course> _courses) {
		courses = _courses;
	}
}
