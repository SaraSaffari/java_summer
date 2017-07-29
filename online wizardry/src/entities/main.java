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
		Person p1 = new Person("gholam", 123, "hogwards", "half_blood");
		System.out.println(p1.getName());
		System.out.print(p1.getStudentNumber());
		System.out.println(p1.getHouseName());
		System.out.println(p1.getBloodStatus());
		
	}

}
