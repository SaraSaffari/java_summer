package entities;

import java.util.Vector;

public class Course {
	private String course_name;
	private Vector<String> students;
	private Professor professor_name;
	private Grade min_grade;
	private int year;
	
	public Course(String _course_name){setName(_course_name);}
	public Course(String _course_name, String _professor_name, char _min_grade, int _year){
		setName(_course_name);
		setProffesorName(_professor_name);
		setMinGrade(_min_grade);
		setYear(_year);
	}
	public String getName() {
		return course_name;
	}
	public void setName(String _course_name) {
		course_name = _course_name;
	}
	public Vector<String> getStudentNames() {
		return students;
	}
	public void setStudentNames(Vector<String> students) {
		this.students = students;
	}
	public String getProfessorName() {
		return professor_name;
	}
	public void setProffesorName(String _Professor_name) {
		this.professor_name = _Professor_name;
	}
	public char getMinGrade() {
		return min_grade;
	}
	public void setMinGrade(char _min_grade) {
		this.min_grade = _min_grade;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
}