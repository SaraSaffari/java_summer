package entity_test;
import entities.*;

public class PersonTest {
	
	public void runTests()
	{
		School hogwarts = new School("Hogwarts", true, "England");
		House house = new House("Slytherin", hogwarts);
		Person person = new Person("Severus Snape", house,
				BloodStatus.Half_blood, hogwarts, "09.01.1960");
		System.out.println("GET NAME       " + testgetName(person, "Severus Snape"));
		System.out.println("GET HOUSE      " + testgetHouse(person, house));
		System.out.println("GET BLOODSTATUS" + testgetBloodStatus(person, BloodStatus.Half_blood));
		System.out.println("GET SCHOOL     " + testgetSchool(person, hogwarts));
		System.out.println("GET BIRTHDAY   " + testgetBirthday(person, "09.01.1960"));
		System.out.println("SET NAME       " + testsetName(person));
		System.out.println("SET HOUSE      " + testsetHouse(person));
		System.out.println("SET BLOODSTATUS" + testsetBloodStatus(person));
		System.out.println("SET SCHOOL     " + testsetSchool(person));
		System.out.println("SET BIRTHDAY   " + testsetBirthday(person));
	}
	public boolean testgetName(Person person, String expected)
	{
		String actual = person.getName();
		
		if(actual.equals(expected))
			return true;
		
		return false;
	}
	public boolean testgetHouse(Person person, House expected)
	{
		House actual = person.getHouse();
		if(actual.equals(expected))
			return true;

		return false;
	}

	public boolean testgetBloodStatus(Person person, BloodStatus expected)
	{
		BloodStatus actual = person.getBloodStatus();
		
		if(actual.equals(expected))
			return true;

		return false;
	}

	public boolean testgetSchool(Person person, School expected)
	{
		School actual = person.getSchool();
		
		if(actual.equals(expected))
			return true;

		return false;
	}

	public boolean testgetBirthday(Person person, String expected)
	{
		String actual = person.getBirthday();
		
		if(actual.equals(expected))
			return true;

		return false;
	}

	public boolean testsetName(Person person)
	{
		String expected = "Severus Snape";
		person.setName("Severus Snape");
		String actual = person.getName();
		
		if(actual.equals(expected))
			return true;

		return false;
	}

	public boolean testsetHouse(Person person)
	{
		House expected = new House("Slytherin", new School("Hogwarts", true, "England"));
		person.setHouse(expected);
		House actual = person.getHouse();

		if(actual.equals(expected))
			return true;

		return false;
	}

	public boolean testsetBloodStatus(Person person)
	{
		BloodStatus expected = BloodStatus.Half_blood;
		person.setBloodStatus(BloodStatus.Half_blood);
		BloodStatus actual = person.getBloodStatus();
		
		if(actual.equals(expected))
			return true;

		return false;
	}

	public boolean testsetSchool(Person person)
	{
		School expected = new School("Hogwarts", true, "England");
		person.setSchool(expected);
		School actual = person.getSchool();

		if(actual.equals(expected))
			return true;

		return false;
	}

	public boolean testsetBirthday(Person person)
	{
		String expected = "09.01.1960";
		person.setBirthday("09.01.1960");
		String actual = person.getBirthday();

		if(actual.equals(expected))
			return true;

		return false;
	}

}
