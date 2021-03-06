package entities;

import java.util.Vector;

public class Course {
	//class fields
	private String course_name;
	private Vector<String> students;
	private Professor professor_name;
	private Grade min_grade;
	private int year;
	
	//class constructors
	public Course(String _course_name){setName(_course_name);}
	public Course(String _course_name, Professor _professor_name, Grade _min_grade, int _year){/////////
		setName(_course_name);
		setProffesorName(_professor_name);
		setMinGrade(_min_grade);
		setYear(_year);
	}
	
	//private field getter(s)
	public String getName() {
		return course_name;
	}
	public Vector<String> getStudentNames() {
		return students;
	}
	public Professor getProfessorName() {//////
		return professor_name;
	}
	public Grade getMinGrade() {///////
		return min_grade;
	}
	public int getYear() {
		return year;
	}
	//private field setter(s)
	public void setName(String _course_name) {
		course_name = _course_name;
	}
	public void setStudentNames(Vector<String> _students) {
		students = _students;
	}
	public void setProffesorName(Professor _Professor_name) {//////
		professor_name = _Professor_name;
	}
	public void setMinGrade(Grade _min_grade) {//////
		min_grade = _min_grade;
	}
	public void setYear(int _year) {
		year = _year;
	}
}