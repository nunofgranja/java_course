package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class ProgramRectangle1 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Rectangle rectangle = new Rectangle();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter rectangle with and height: ");

		rectangle.width = sc.nextDouble();
		rectangle.height = sc.nextDouble();
		
		System.out.println("Area: " + rectangle.area());
		System.out.println("Perimeter: " + rectangle.perimeter());
		System.out.println("Diagonal: " + rectangle.diagonal());
		
		
			sc.close();
	}

}