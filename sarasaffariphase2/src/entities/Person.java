package entities;

public class Person {
	//class fields
	private String name;
	private int student_number;
	private House house_name;
	private BloodStatus blood_status;
	private School school;
	private String Birthday;
	
	//class constructors
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
	
	//private field getter(s)
	public String getName() {
		return name;
	}
	public int getStudentNumber() {
		return student_number;
	}
	public House getHouseName() {
		return house_name;
	}
	public BloodStatus getBloodStatus() {
		return blood_status;
	}
	public School getSchool() {
		return school;
	}
	public String getBirthday() {
		return Birthday;
	}
	
	//private field setter(s)
	public void setName(String _name) {
		name = _name;
	}
	public void setStudentNumber(int _student_number) {
		student_number = _student_number;
	}
	public void setHouseName(House _house_name) {
		house_name = _house_name;
	}
	public void setBloodStatus(BloodStatus _blood_status) {
		blood_status = _blood_status;
	}
	public void setSchool(School _school) {
		school = _school;
	}
	public void setBirthday(String birthday) {
		Birthday = birthday;
	}
}