package entities;

import java.io.IOException;
import services.*;
import services.SchoolService;
//import entity_test.*;

public class Main {
	
	
	public static void main(String args[])
	{

		SchoolService ss = new SchoolService();
		String filename = "SchoolDB.txt";
		try {
			ss.getData(filename);
		} catch (IOException e) {
			System.err.println("Error: " + e.getMessage());
		}	
		
		CourseService cs = new CourseService();
		try {
			cs.getData(filename);
		} catch (IOException e) {
			System.err.println("Error: " + e.getMessage());
		}	
		
		HouseServices hs = new HouseServices();
		try {
			hs.getData(filename);
		} catch (IOException e) {
			System.err.println("Error: " + e.getMessage());
		}
		
		PersonServices ps = new PersonServices();
		try {
			ps.getData(filename);
		} catch (IOException e) {
			System.err.println("Error: " + e.getMessage());
		}
		
		StudentService sts = new StudentService();
		try {
			sts.getData(filename);
		} catch (IOException e) {
			System.err.println("Error: " + e.getMessage());
		}
		
		ProfessorService pros = new ProfessorService();
		try {
			pros.getData(filename);
		} catch (IOException e) {
			System.err.println("Error: " + e.getMessage());
		}
	}
	
}