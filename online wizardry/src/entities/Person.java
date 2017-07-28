package entities;

import java.util.Date;
import java.util.Vector;

public class Person {
	private String name;
	private int student_number;
	private String house_name;
	private String blood_status;
	private String school;
	private Date date;
	private Vector<String> all_horses;
	
	public Person() {}
	public Person(String _name, int _student_number, String home_land, String blood_status) {
		setName(_name);
		setStudentNumber(_student_number);
	}
	public Person(String _name) {setName(_name);}
	public Person(String _name, String _house_name, String _blood_status, String _school, Date _date) {
		setName(_name);
		setHouseName(_house_name);
		setBloodStatus(_blood_status);
		setSchool(_school);
		setDate(_date);
	}
	
	public int get_number_of_horses() {return all_horses.size();}
	
	public Vector<String> get_all_horses() {return all_horses;}
	
	public String getName() {
		return name;
	}
	public void setName(String _name) {
		this.name = _name;
	}
	//
	public int getStudentNumber() {
		return student_number;
	}
	public void setStudentNumber(int _student_number) {
		this.student_number = _student_number;
	}
	//
	public String getHouseName() {
		return house_name;
	}
	public void setHouseName(String _house_name) {
		this.house_name = _house_name;
	}
	//
	public String getBloodStatus() {
		return blood_status;
	}
	public void setBloodStatus(String _blood_status) {
		this.blood_status = _blood_status;
	}
	//
	public String getSchool() {
		return school;
	}
	public void setSchool(String _school) {
		this.school = _school;
	}
	//
	public Date getDate() {
		return date;
	}
	public void setDate(Date _date) {
		this.date = _date;
	}
}
