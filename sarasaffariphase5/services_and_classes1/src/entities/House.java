package entities;

import java.util.*;

public class House {
	private String _name;
	private School _school;
	private Vector<Student> _students;
	private Professor _headTeacher;
	private ArrayList<String> _qualities;
	private Map<Integer, Student> _prefects;
	
	/*			CONSTRUCTORS			*/
	
	public House(String name, School school, Vector<Student> students, Professor headTeacher, 
			ArrayList<String> qualities, Map<Integer, Student> prefects)
	{
		
		_name = name;
		_school = school;
		_students = students;
		_headTeacher = headTeacher;
		_qualities = qualities;
		_prefects = prefects;
		
	}
	
	public House(String name, School school)
	{
		this(name, school, new Vector<Student>(), null, new ArrayList<String>(), 
				new TreeMap<Integer, Student>());
	}
	
	public House(String name)
	{
		this(name, null , new Vector<Student>(), null, new ArrayList<String>(), 
				new TreeMap<Integer, Student>());
	}
	
	public House()
	{
		this("", null, new Vector<Student>(), null, new ArrayList<String>(), 
				new TreeMap<Integer, Student>());
	}
	
	
	/*				GETTERS				*/
	
	public String getName()
	{
		return _name;
	}
	public School getSchool()
	{
		return _school;
	}
	public Vector<Student> getStudents()
	{
		return _students;
	}
	public Professor getHeadTeacher()
	{
		return _headTeacher;
	}
	public ArrayList<String> getQualities()
	{
		return _qualities;
	}
	public Map<Integer, Student> getPrefects()
	{
		return _prefects;
	}
	
	/*				SETTERS				*/
	
	public void setName(String name)
	{
		_name = name;
	}
	public void setSchool(School school)
	{
		_school = school;
	}
	public void setStudents(Vector<Student> students)
	{
		_students = students;
	}
	public void setHeadTeacher(Professor headTeacher)
	{
		_headTeacher = headTeacher;
	}
	public void setQualities(ArrayList<String> qualities)
	{
		_qualities = qualities;
	}
	public void setPrefects(Map<Integer, Student> prefects)
	{
		_prefects = prefects;
	}
	
	/*			HELPER METHODS			*/
	
	public String toString()
	{
		String temp = "";
		
		temp += "Name		: " + _name + '\n' +
				"Prefects	: " + '\n';
		
		for(int i=0; i<_prefects.size(); i++)
		{
			temp += _prefects.entrySet().toString();
		}
				
		return temp;
	}


}
