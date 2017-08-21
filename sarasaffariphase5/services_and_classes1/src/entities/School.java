package entities;

import java.util.ArrayList;
import java.util.Vector;

public class School {
	private String _name;
	private int _numOfStudents;
	private boolean _housed;
	private ArrayList<House> _houses;
	private Vector<Student> _students;
	private Vector<Professor> _professors;
	private ArrayList<Course> _courses;
	private String _location;
	
	/*			CONSTRUCTORS			*/
	/*				GETTERS				*/
	/*				SETTERS				*/
	/*			HELPER METHODS			*/

	
	public School(String name, int numOfStudents, boolean housed, ArrayList<House> houses,
			Vector<Student> students, Vector<Professor> professors, ArrayList<Course> courses, String location)
	{
		_name = name;
		_numOfStudents = numOfStudents;
		_housed = housed;
		_houses = houses;
		_students = students;
		_professors = professors;
		_courses = courses;
		_location = location;
				
	}
	public School(String name, boolean housed, String location)
	{
		this(name, 0, housed, new ArrayList<House>(), 
				new Vector<Student>(), new Vector<Professor>(), new ArrayList<Course>(), location);
	}
	public School(String name, boolean housed)
	{
		this(name, 0, housed, new ArrayList<House>(), 
				new Vector<Student>(), new Vector<Professor>(), new ArrayList<Course>(), null);
	}
	public void setName(String name)
	{
		_name = name;
	}
	public void setNumOfStudents(int numOfStudents)
	{
		_numOfStudents = numOfStudents;			
	}
	public void setHoused(boolean housed)
	{
		_housed = housed;
	}
	public void setHouses(ArrayList<House> houses)
	{
		_houses = houses;
	}
	public void setStudents(Vector<Student> students)
	{
		_students = students;
	}
	public void setProfessors(Vector<Professor> professors)
	{
		_professors = professors;
	}
	public void setCourses(ArrayList<Course> courses)
	{
		_courses = courses;
	}
	public void setLocation(String location)
	{
		_location = location;
	}
	public String getName()
	{ 
		return _name;
	}
	public int getNumOfStudents()
	{
		return _numOfStudents;
	}
	public boolean getHoused()
	{
		return _housed;
	}
	public ArrayList<House> getHouses()
	{
		return _houses;
	}
	public Vector<Student> getStudents()
	{
		return _students;
	}
	public Vector<Professor> getProfessors()
	{
		return _professors;
	}
	public ArrayList<Course> getCourses()
	{
		return _courses;
	}
	public String getLocation()
	{
		return _location;
	}

}
