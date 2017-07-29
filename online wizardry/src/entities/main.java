package entities;

//import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		
		//Scanner reader = new Scanner(System.in); 
		//System.out.println("Enter a name: ");
		//String input_name = reader.nextLine();
		//System.out.println("Enter a number: ");
		//int input_number = reader.nextInt(); 
		//reader.close();
		
		Course c1 = new Course("magic", "ph", '2',1997);
		System.out.println(c1.getName());
		System.out.println(c1.getProfessorName());
		System.out.println(c1.getMinGrade());
		System.out.println(c1.getYear());
		
	}

}
