package entities;

import java.util.ArrayList;
import java.util.Map;
import java.util.Vector;

public class House {
	private String house_name;
	private School related_school;
	private Vector<Student> students;
	private Professor head_teacher;
	private ArrayList<String> qualities;
	private Map<Integer,Course> prefects;

	public House(String _house_name, School _related_school, Vector<Student> _students, Professor _head_teacher, 
			ArrayList<String> _qualities, Map<Integer,Course> _prefects){
		house_name = _house_name;
		related_school = _related_school;
		students = _students;
		head_teacher = _head_teacher;
		qualities = _qualities;
		prefects = _prefects;
	}

	public String get_house_name() {
		return house_name;
	}

	public void set_house_name(String house_name) {
		this.house_name = house_name;
	}

	public School get_related_school() {
		return related_school;
	}

	public void set_related_school(School related_school) {
		this.related_school = related_school;
	}

	public Vector<Student> get_students() {
		return students;
	}

	public void set_students(Vector<Student> students) {
		this.students = students;
	}

	public Professor get_head_teacher() {
		return head_teacher;
	}

	public void set_head_teacher(Professor head_teacher) {
		this.head_teacher = head_teacher;
	}

	public ArrayList<String> get_qualities() {
		return qualities;
	}

	public void set_qualities(ArrayList<String> qualities) {
		this.qualities = qualities;
	}

	public Map<Integer,Course> get_prefects() {
		return prefects;
	}

	public void set_prefects(Map<Integer,Course> prefects) {
		this.prefects = prefects;
	}
}
