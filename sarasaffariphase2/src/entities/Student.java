package entities;

import java.util.Vector;

public class Student extends Person {
	
	private Vector<Course> course;
	private Vector<FinishedCourse> reportcard;
	
	public Vector<Course> get_course() {
		return course;
	}
	public void set_course(Vector<Course> _course) {
		course = _course;
	}
	public Vector<FinishedCourse> get_reportcard() {
		return reportcard;
	}
	public void set_reportcard(Vector<FinishedCourse> _reportcard) {
		reportcard = _reportcard;
	}
	

}
