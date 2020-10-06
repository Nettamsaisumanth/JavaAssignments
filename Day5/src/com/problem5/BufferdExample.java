/*Given total runs scored and  total overs faced as the input. Write a program to calculate the run rate with the formula,
Run rate= total runs scored/total overs faced.
Use BufferedReader class to get the inputs from user.
 This program may generate Arithmetic Exception / NumberFormatException. Use exception handling mechanisms to handle this exception. Use a single catch block. In the catch block, print the class name of the exception thrown.
Sample Input and Output 1:
Enter the total runs scored
79
Enter the total overs faced
14
Current Run Rate : 5.64 
Sample Input and Output 2:
Enter the total runs scored
50
Enter the total overs faced
 0
java.lang.ArithmeticException
Sample Input and Output 3:
Enter the total runs scored
a
java.lang.NumberFormatException
*/




package com.problem5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferdExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStreamReader inpstrmrdr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(inpstrmrdr);
		try{
			System.out.println("Enter total runs scored");
		int totalRunsScored = Integer.parseInt(br.readLine());
		System.out.println("Enter overs");
		float overs = Float.parseFloat(br.readLine());
		float runRate = totalRunsScored/overs;
		System.out.println("Run Rate is "+runRate);
		}
		catch(ArithmeticException|NumberFormatException e){
			System.out.println("Exception occuted "+e.getMessage());
			System.out.println(e);
		}
		finally
		{
			br.close();
		}
		

	}

}
