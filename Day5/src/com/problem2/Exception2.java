/*2.Java has built-in mechanism to handle exceptions. Using the try statement we can test a block of code for errors. The catch block contains the code that says what to do if exception occurs. 
This problem will test your knowledge on try-catch block.
You will be given two integers and as input, you have to compute . If and are not bit signed integers or if is zero, exception will occur and you have to report it. Read sample Input/Output to know what to report in case of exceptions.
Sample Input :
10
3
Sample Output :
3
Sample Input :
10
Hello
Sample Output :
java.util.InputMismatchException
Sample Input :
10
0
Sample Output :
java.lang.ArithmeticException: / by zero
Sample Input :
23.323
0
Sample Output :
java.util.InputMismatchException
*/

package com.problem2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("Enter two numbers");
			float output;
			int input1 = scanner.nextInt();
			int input2 = scanner.nextInt();
			output = input1 / input2;
			System.out.println("Output is " + output);
		} catch (InputMismatchException ex1) {
			System.out.println("Exception occured please enter both of int types " + ex1);
		} catch (ArithmeticException ex2) {
			System.out.println("Exception occured dicision by zerp " + ex2);
		} finally {
			scanner.close();
		}

	}

}
