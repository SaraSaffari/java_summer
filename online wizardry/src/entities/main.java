package entities;

import java.util.ArrayList;
import java.util.Vector;

//import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		
		//Scanner reader = new Scanner(System.in); 
		//System.out.println("Enter a name: ");
		//String input_name = reader.nextLine();
		//System.out.println("Enter a number: ");
		//int input_number = reader.nextInt(); 
		//reader.close();
		
		ArrayList <String> shouses = new ArrayList<String>();
		ArrayList <String> scourses = new ArrayList<String>();
		Vector <String> sstudents = new Vector<String>();
		Vector <String> sprofessors = new Vector<String>();
		shouses.add("kazaban");
		shouses.add("kazaban");
		scourses.add("magic");
		scourses.add("flying");
		sstudents.add("hp");
		sstudents.add("ghamar");
		sprofessors.add("severus");
		sprofessors.add("dark master");
		
		School s1 = new School("hogwarts",shouses ,scourses ,sstudents , sprofessors);
		System.out.println(s1.getName());
		System.out.println(s1.getCourseNames());
		System.out.println(s1.getHouseNames());
		System.out.println(s1.getProfessorNames());
		System.out.println(s1.getStudentNames());
		
	}

}
