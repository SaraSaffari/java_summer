package entities;

public class Person {
	private String name;
	private int student_number;
	private House house_name;
	private BloodStatus blood_status;
	private School school;
	private String Birthday;
	
	public Person() {}
	public Person(String _name, int _student_number, House _house_name, BloodStatus _blood_status) {
		name = _name;
		student_number = _student_number;
		house_name = _house_name;
		blood_status = _blood_status;
	}
	public Person(String _name) {setName(_name);}
	public Person(String _name, House _house_name, BloodStatus _blood_status, School _school) {
		name = _name;
		house_name = _house_name;
		blood_status = _blood_status;
		school = _school;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String _name) {
		name = _name;
	}
	public int getStudentNumber() {
		return student_number;
	}
	public void setStudentNumber(int _student_number) {
		student_number = _student_number;
	}
	public House getHouseName() {
		return house_name;
	}
	public void setHouseName(House _house_name) {
		house_name = _house_name;
	}
	public BloodStatus getBloodStatus() {
		return blood_status;
	}
	public void setBloodStatus(BloodStatus _blood_status) {
		blood_status = _blood_status;
	}
	public School getSchool() {
		return school;
	}
	public void setSchool(School _school) {
		school = _school;
	}
	public String getBirthday() {
		return Birthday;
	}
	public void setBirthday(String birthday) {
		Birthday = birthday;
	}
}