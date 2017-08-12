package entities;

import java.util.Vector;

public class Student extends Person {
	//class fields
	private Vector<Course> course;
	private Vector<FinishedCourse> reportcard;
	
	//class constructors
	public Student(Vector<Course> _course, Vector<FinishedCourse> _reportcard){
		course = _course;
		reportcard = _reportcard;
	}
	//private field getter(s)
	public Vector<Course> get_course() {
		return course;
	}
	public Vector<FinishedCourse> get_reportcard() {
		return reportcard;
	}
	
	//private field setter(s)
	public void set_course(Vector<Course> _course) {
		course = _course;
	}
	public void set_reportcard(Vector<FinishedCourse> _reportcard) {
		reportcard = _reportcard;
	}
	

}
