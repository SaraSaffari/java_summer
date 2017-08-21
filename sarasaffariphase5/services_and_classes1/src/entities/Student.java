package entities;

import java.util.Vector;

public class Student extends Person{
	private Vector<Course> _courses;
	private Vector<FinishedCourse> _reportCard;
	
	/*			CONSTRUCTORS			*/
	public Student(String name, House house, BloodStatus bloodStatus, School school, String birthday,
			Vector<Course> courses, Vector<FinishedCourse> reportCard)
	{
		_name = name;
		_house = house;
		_bloodStatus = bloodStatus;
		_school = school;
		_birthday = birthday;
		_courses = courses;
		_reportCard = reportCard;
	}

	public Student(String name) {
		this(name, null, BloodStatus.Muggle, null, "00.00.0000",
				new Vector<Course>(), new Vector<FinishedCourse>());

	}
	
	/*				GETTERS				*/
	public Vector<Course> getCourses()
	{
		return _courses;
	}
	public Vector<FinishedCourse> getReportCard()
	{
		return _reportCard;
	}

	/*				SETTERS				*/
	public void setCourses(Vector<Course> courses)
	{
		_courses = courses;
	}
	public void setReportCard(Vector<FinishedCourse> reportCard)
	{
		_reportCard = reportCard;
	}

}
