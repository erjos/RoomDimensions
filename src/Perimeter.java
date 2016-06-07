import java.util.Scanner;

public class Perimeter {
	
	//creating a method to validate data type of entry as "double"
	//Question: confused why I can name this object "scan" but it's not consistent through the rest of the program
	// maybe it's because all we need to do is identify that the type of object is a scanner object
	public static double validate(Scanner scan){
		//adding while loop that re-prints the error message as long as the scan.hasNextDouble is "false"
		while(!scan.hasNextDouble()){
			System.out.print("You must enter a number.");
			scan.nextLine();
		}
		//
		double number = scan.nextDouble();
		return 0;
	}
	
	public static void main(String[] args) {
			
	String line;
	double width; //width 
	double length; //length
	double height; //height
	
	System.out.println("Welcome to the Grand Circus room tour!");
	Scanner input = new Scanner (System.in);
	
		//Using a do statement because I want to execute this code at least once
		do {
		
		//collect the width of the room and label as n1
			System.out.print("Enter the width of the room: ");
		width = validate(input);
		
		//collect the length of the room and label as n2
		System.out.print("Enter the length of the room: ");
		length = validate(input);
		
		//collect the height of the room and label as n3
		System.out.print("Enter the height of the room: ");
		height = validate(input);
		
		//calculate the area
		double area = width * length;
		
		//calculate the perimeter
		double perimeter = (width * 2) + (length * 2);
		
		//calculate the volume
		double volume = width * length * height;
		
		//print the area, perimeter and volume of the room
		System.out.println("The area of this room is: " + area);
		System.out.println("The perimeter of this room is: " + perimeter);			
		System.out.println("The volume of this room is: " + volume);
		
		//ask the user if they want to continue
		System.out.print("Do you want to continue (Y/N): ");
		
		//need to use this to clear the input stream so we can accurately compare the string
		String garbage = input.nextLine();
		
		line = input.nextLine();
		
		//use the while statement to execute loop as long as the input is equal to Y
		//using the equalsIgnorCase method so that it doesn't matter if the Y is upper or lowercase
		} while (line.equalsIgnoreCase("Yes") || line.equalsIgnoreCase("y"));
		
		//Once the loop ends print a message
		System.out.println("Checking out? Thanks for visiting GC!");
	}	
}
