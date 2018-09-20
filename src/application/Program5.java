package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import entities.Employee3;

public class Program5 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		String[] anagramsArray = new String[20];
		int count = 0;
		
		String[] input = {"car","cheating","dale","deal","lead", "listen", "silent", "teaching"};
		int i=0;
		int j=0;
		
		
		for(i=0;i<input.length;i++ ) {
			for(j=0;j<input.length;j++) {
				
				if(input[i].length() == input[j].length() && i!= j )
				{    
					char[] s1Array = input[i].toLowerCase().toCharArray();
					 
		            char[] s2Array = input[j].toLowerCase().toCharArray();
		 
		            //Sorting both character array
		 
		            Arrays.sort(s1Array);
		 
		            Arrays.sort(s2Array);
		 
		            //Check if both arrays are equal
		 
		            boolean status = Arrays.equals(s1Array, s2Array);
		            
		            if(status && input[j]!= "" ) {
		            	
		            	anagramsArray[count] = input[i].concat(" " + input[j]);
		            	input[j] = "";
		            	count += +1;
		            	
		            }
				}
				
			}
			
		}
		
		
for(String x : anagramsArray)
{
	System.out.println(x);
}
	   

			   
	          	        
	}

}