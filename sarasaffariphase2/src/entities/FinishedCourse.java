package entities;

public class FinishedCourse extends Course {
	private Grade grade;
	private boolean passed;
	
	//public FinishedCourse(Grade _grade, boolean passed){
		
	//}
	public Grade get_grade() {
		return grade;
	}
	public void set_grade(Grade _grade) {
		grade = _grade;
	}
	public boolean is_passed() {
		return passed;
	}
	public void set_passed(boolean _passed) {
		passed = _passed;
	}
	
	

}
