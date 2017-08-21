package entities;

import java.util.Map;
import java.util.TreeMap;

public class Professor extends Person{
	private Map<Integer, Course> _courses;
	private String _notes;

	/*			CONSTRUCTORS			*/
	public Professor(String name, House house, BloodStatus bloodStatus, School school, String birthday,
			Map<Integer, Course> courses, String notes)
	{
		_name = name;
		_house = house;
		_bloodStatus = bloodStatus;
		_school = school;
		_birthday = birthday;
		_courses = courses;
		_notes = notes;
	}
	public Professor(String name) {
		this(name, null, BloodStatus.Muggle, null, "00.00.0000", new TreeMap<Integer, Course>(), "");
	}
	

	/*				GETTERS				*/

	public Map<Integer, Course> getCourses()
	{
		return _courses;
	}
	public String getNotes()
	{
		return _notes;
	}
	
	/*				SETTERS				*/

	public void setCourses(Map<Integer, Course> courses)
	{
		_courses = courses;
	}
	public void setNotes(String notes)
	{
		_notes = notes;
	}
}
