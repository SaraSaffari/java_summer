package entities;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Person p1 = new Person();
		
		
		Scanner reader = new Scanner(System.in); 
		
		System.out.println("Enter a name: ");
		String input_name = reader.nextLine();
		
		System.out.println("Enter a number: ");
		int input_number = reader.nextInt(); 
		
		
		//System.out.println(p2.get_name());
		
		
		
		reader.close();
	}

}
