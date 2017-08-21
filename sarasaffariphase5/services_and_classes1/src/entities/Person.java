package entities;

public class Person {
	protected String _name;
	protected House _house;
	protected BloodStatus _bloodStatus;
	protected School _school;
	protected String _birthday;
	
	/*			CONSTRUCTORS			*/
	public Person(String name, House house, BloodStatus bloodStatus, School school, String birthday)
	{
		_name = name;
		_house = house;
		_bloodStatus = bloodStatus;
		_school = school;
		_birthday = birthday;
	}
	public Person(String name)
	{
		this(name, null, BloodStatus.Muggle, null, "");
	}
	public Person()
	{
		this("", null, BloodStatus.Muggle, null, "");
	}
	
	/*				GETTERS				*/
	public String getName()
	{
		return _name;
	}
	public House getHouse()
	{
		return _house;
	}
	public BloodStatus getBloodStatus()
	{
		return _bloodStatus;
	}
	public School getSchool()
	{
		return _school;
	}
	public String getBirthday()
	{
		return _birthday;
	}
	
	/*				SETTERS				*/
	
	public void setName(String name)
	{
		_name = name;
	}
	public void setHouse(House house)
	{
		_house = house;
	}
	public void setBloodStatus(BloodStatus bloodStatus)
	{
		_bloodStatus = bloodStatus;
	}
	public void setSchool(School school)
	{
		_school = school;
	}
	public void setBirthday(String birthday)
	{
		_birthday = birthday;
	}
	
}
