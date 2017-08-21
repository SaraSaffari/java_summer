package entities;

import java.util.Vector;

public class Course {
	protected String _name;				/* The course's name */
	protected Grades _minGrade;			/* The minimum grade required after taking the OWLs to continue with the course */
	protected Professor _professor;		/* The professor teaching this course at the year indicated */
	protected int _year;					/* The year during which this course is offered by the indicated professor */
	private Vector<Student> _students;	/* List of students enrolled in the class during the indicated year */
	
	/*			CONSTRUCTORS			*/
	public Course(String name, Grades grade, Professor professor, int year, Vector<Student> students)
	{
		_name = name;
		_minGrade = grade;
		_professor = professor;
		_year = year;
		_students = students;
	}
	public Course(String name, Professor professor, int year)
	{
		this(name, Grades.A, professor, year, new Vector<Student>());		
	}
	
	public Course(String name)
	{
		this(name, Grades.A, null, 0, new Vector<Student>());		
	}
	
	public Course()
	{
		this("", Grades.T, null, 0, new Vector<Student>());
	}
	
	/*				GETTERS				*/
	
	public String getName()
	{
		return _name;
	}
	public Grades getMinGrade()
	{
		return _minGrade;
	}
	public Professor getProfessor()
	{
		return _professor;
	}
	public int getYear()
	{
		return _year;
	}
	public Vector<Student> getStudents()
	{
		return _students;
	}
	
	/*				SETTERS				*/
	
	public void setName(String name)
	{
		_name = name;
	}
	public void setMinGrade(Grades grade)
	{
		_minGrade = grade;
	}
	public void setProfessor(Professor professor)
	{
		_professor = professor;
	}
	public void setYear(int year)
	{
		_year = year;
	}
	public void setStudents(Vector<Student> students)
	{
		_students = students;
	}
	
	/*			HELPER METHODS			*/

	
	public void addStudent(Student student)
	{
		_students.addElement(student);
	}

	public String toString()
	{
		String temp = "";
		
		temp += "Name			: " + _name + '\n' +
				"Minimum Grade	: " + _minGrade + '\n' +
				"Professor		: " + _professor.getName() + '\n' +
				"Year			: " + _year + '\n' + 
				"*******************************************";
						
		return temp;
	}
}
