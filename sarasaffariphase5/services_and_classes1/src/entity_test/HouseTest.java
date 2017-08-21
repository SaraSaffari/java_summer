package entity_test;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;
import java.util.Vector;

import entities.*;

public class HouseTest {
	
	public void runTests()
	{
		Vector<Student> students = new Vector<Student>();
		students.add(new Student("Luna Lovegood"));
		students.add(new Student("Cho Chang"));

		ArrayList<String> qualities = new ArrayList<String>();
		qualities.add("Intelligence");
		qualities.add("Knowledge");
		qualities.add("Wit");
		
		Map<Integer, Student> prefects = new TreeMap<Integer, Student>();
		prefects.put(1995, new Student("Not Sure!"));
		prefects.put(1995, new Student("Don't know"));
		prefects.put(1996, new Student("Someone"));
		prefects.put(1996, new Student("Probably Cho?"));


		House house = new House("Raven Claw", new School("Hogwarts", true, "England"),
				students, new Professor("Finnius Flitwik"), 
				qualities, prefects);

		System.out.println("GET NAME       " + testgetName(house, "Raven Claw"));
		System.out.println("GET SCHOOL     " + testgetSchool(house, new School("Hogwarts", true, "England")));
		System.out.println("GET STUDENTS   " + testgetStudents(house, students));
		System.out.println("GET HEADTEACHER" + testgetHeadTeacher(house, new Professor("Finnius Flitwik")));
		System.out.println("GET QUALITIES  " + testgetQualities(house, qualities));
		System.out.println("GET PREFECTS   " + testgetPrefects(house, prefects));
		System.out.println("SET NAME       " + testsetName(house));
		System.out.println("SET SCHOOL     " + testsetSchool(house));
		System.out.println("SET STUDENTS   " + testsetStudents(house));
		System.out.println("SET HEADTEACHER" + testsetHeadTeacher(house));
		System.out.println("SET QUALITIES  " + testsetQualities(house));
		System.out.println("SET PREFECTS   " + testsetPrefects(house));
	}
	public boolean testgetName(House house, String expected)
	{
		String actual = house.getName();
		if(actual.equals(expected))
			return true;
		return false;
	}
	public boolean testgetSchool(House house, School expected)
	{
		School actual = house.getSchool();
		if(actual.getName().equals(expected.getName()))
			return true;
		return false;
	}

	public boolean testgetStudents(House house, Vector<Student> expected)
	{
		Vector<Student> actual = house.getStudents();
		
		if(actual.equals(expected))
			return true;
		return false;
	}

	public boolean testgetHeadTeacher(House house, Professor expected)
	{
		Professor actual = house.getHeadTeacher();
		if(actual.getName().equals(expected.getName()))
			return true;
		return false;
	}

	public boolean testgetQualities(House house, ArrayList<String> expected)
	{
		ArrayList<String> actual = house.getQualities();
		if(actual.equals(expected))
			return true;
		return false;
	}

	public boolean testgetPrefects(House house, Map<Integer, Student> expected)
	{
		Map<Integer, Student> actual = house.getPrefects();
		if(actual.equals(expected))
			return true;
		return false;
	}

	public boolean testsetName(House house)
	{
		String expected = "Ravenclaw";
		house.setName("Ravenclaw");
		String actual = house.getName();
		if(actual.equals(expected))
			return true;
		
		return false;
	}

	public boolean testsetSchool(House house)
	{
		School expected = new School("Hogwarts", false, "England");
		house.setSchool(new School("Hogwarts", false, "England"));
		School actual = house.getSchool();
		
		if(actual.getName().equals(expected.getName()))
			return true;
		
		return false;
	}

	public boolean testsetStudents(House house)
	{
		Vector<Student> expected = new Vector<Student>();
		expected.add(new Student("Luna Lovegood"));
		expected.add(new Student("Cho Chang"));
		house.setStudents(expected);
		Vector<Student> actual = house.getStudents();
		if(actual.equals(expected))
			return true;
		
		return false;
	}

	public boolean testsetHeadTeacher(House house)
	{
		Professor expected = new Professor("Filius Flitwick");
		house.setHeadTeacher(new Professor("Filius Flitwick"));
		Professor actual = house.getHeadTeacher();
		if(actual.getName().equals(expected.getName()))
			return true;
		
		return false;
	}

	public boolean testsetQualities(House house)
	{
		ArrayList<String> expected = new ArrayList<String>();
		expected.add("Intelligence");
		expected.add("Knowledge");
		expected.add("Wit");
		
		house.setQualities(expected);
		ArrayList<String> actual = house.getQualities();
		if(actual.equals(expected))
			return true;
		
		return false;
	}
	public boolean testsetPrefects(House house)
	{
		Map<Integer, Student> expected = new TreeMap<Integer, Student>();
		expected.put(1995, new Student("Not Sure!"));
		expected.put(1995, new Student("Don't know"));
		expected.put(1996, new Student("Someone"));
		expected.put(1996, new Student("Probably Cho?"));
		house.setPrefects(expected);
		Map<Integer, Student> actual = house.getPrefects();
		if(actual.equals(expected))
			return true;
		return false;
	}

}
