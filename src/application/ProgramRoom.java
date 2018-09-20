package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Room;

public class ProgramRoom {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
	
		Scanner sc = new Scanner(System.in);
		
		Room[] vect = new Room[10];
	
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		int i = 0;
		int countVar = 0;
		
		for(i=0;i<n;i++)
		{
			
			System.out.println("Rent #" + i+1);
			 sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int roomNumber = sc.nextInt();
			
			
			vect[roomNumber] = new Room(name,email);
		}
		
		for(i=0;i<vect.length;i++)
		{
			if(vect[i]!= null)
			{
			    countVar += 1;
			    System.out.println("Busy Rooms:");
				System.out.println(i + ": " + vect[i].getName() + ", " + vect[i].getEmail());
			  
			}
			
			
		}
		

		sc.close();
	}

}