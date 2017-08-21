package entities;

public class FinishedCourse extends Course{
	private Student _student;	//The specific student taking this course
	private Grades _grade;		//The grade achieved by the student
	private boolean _passed;	//Whether or not the student passed
	
	/*			CONSTRUCTORS			*/
	
	public FinishedCourse(String name, Grades minGrade, Professor professor, int year, Student student, 
			Grades grade, boolean passed)
	{
		_name = name;
		_minGrade = minGrade;
		_professor = professor;
		_year = year;
		_student = student;
		_grade = grade;
		_passed = passed;

	}
	
	public FinishedCourse()
	{
		this("", Grades.T, null, 0, null, Grades.T, false);
	}
	
	/*				GETTERS				*/

	
	public Student getStudent()
	{
		return _student;
	}
	public Grades getGrade()
	{
		return _grade;
	}
	public boolean getPassed()
	{
		return _passed;
	}
	
	/*				SETTERS				*/
	
	
	public void setStident(Student student)
	{
		_student = student;
	}
	public void setGrade(Grades grade)
	{
		_grade = grade;
	}
	public void setPassed(boolean passed)
	{
		_passed = passed;
	}
	
	/*			HELPER METHODS			*/
	
	public void assurePassed(Grades grade)
	{
		switch(grade)
		{
		case O : /* Outstanding */
			_passed = true;
			break;

		case E : /* Exceeds Expectations */
			_passed = true;
			break;			

		case A : /* Acceptable */
			_passed = true;
			break;
		
		case P : /* Poor */
			_passed = false;
			break;
			
		case T : /* Troll */
			_passed = false;
			break;
		default:
			break;
		}
	}
	public String toString()
	{
		String temp = "";
		
		temp += "Student	: " + _student.getName() + '\n' + 
				"Course		: " + _name + '\n' +
				"Grade		: " + _grade + '\n' +
				"***********************************";
				
		return temp;
	}
}

