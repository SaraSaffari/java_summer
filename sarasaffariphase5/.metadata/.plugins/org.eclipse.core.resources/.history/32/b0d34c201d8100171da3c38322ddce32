package entityTests;

import entities.*;

public class FinishedCourseTest {

	public void runTests()
	{
		FinishedCourse fcourse = new FinishedCourse("Defense Against The Dark Arts", 
				Grades.O, new Professor("Lupin") , 1997, new Student("Lavender Brown"), 
				Grades.E, true);
		System.out.println("GET STUDENT    " + testgetStudent(fcourse, new Student("Lavender Brown")));
		System.out.println("GET GRADE      " + testgetGrade(fcourse, Grades.E));
		System.out.println("GET PASSED     " + testgetPassed(fcourse, true));
		System.out.println("SET STUDENT    " + testsetStudent(fcourse));
		System.out.println("SET GRADE      " + testsetGrade(fcourse));
		System.out.println("SET PASSED     " + testsetPassed(fcourse));	
	}
	public boolean testgetStudent(FinishedCourse fcourse, Student expected)
	{
		Student actual = fcourse.getStudent();
		
		if(actual.getName().equals(expected.getName()))
			return true;
		return false;
	}
	public boolean testgetGrade(FinishedCourse fcourse, Grades expected)
	{
		Grades actual = fcourse.getGrade();

		if(actual.equals(expected))
			return true;
		
		return false;
	}

	public boolean testgetPassed(FinishedCourse fcourse, boolean expected)
	{
		boolean actual = fcourse.getPassed();
		if(actual == expected)
			return true;

		return false;
	}

	public boolean testsetStudent(FinishedCourse fcourse)
	{
		Student actual = new Student("Draco Malfoy");
		fcourse.setStident(actual);
		Student expected = fcourse.getStudent();
		
		if(actual.equals(expected))
			return true;

		return false;
	}

	public boolean testsetGrade(FinishedCourse fcourse)
	{
		Grades expected = Grades.O;
		fcourse.setGrade(Grades.O);
		Grades actual = fcourse.getGrade();
		if(actual.equals(expected))
			return true;

		return false;
	}

	public boolean testsetPassed(FinishedCourse fcourse)
	{
		boolean expected = true;
		fcourse.setPassed(true);
		boolean actual = fcourse.getPassed();
		
		if(actual == expected)
			return true;
		
		return false;
	}

}
