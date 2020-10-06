/*1.Create an abstract class named Shape with the following protected attributes / member variables.
 String name
 Include a 1-argument constructor.
 Include getters and setters.
 Include an abstract method named calculateArea() . This method returns a Float value.
 Create a class named Circle . The class Circle is a derived class of Shape. Include the   following private attributes / member variables.
 Integer radius
 Include a 2-argument constructor. The order of the arguments is name, radius.
 Include getters and setters.
 Override the abstract method calculateArea() defined in the Shape class. This method returns the area of the circle. [Take the value of pi as 3.14]
 Create a class named Square . The class Square is a derived class of Shape. Include the following private attributes / member variables.
 Integer side
 Include a 2-argument constructor. The order of the arguments is name, side.
 Include getters and setters.
 Override the abstract method calculateArea() defined in the Shape class. This method returns the area of the square.
 Create a class named Rectangle . The class Rectangle is a derived class of Shape. Include the following private attributes / member variables.
 Integer length
 Integer breadth
 Include a 3-argument constructor. The order of the arguments is name, length, breadth
 Include getters and setters.
 Override the abstract method calculateArea() defined in the Shape class. This method returns the area of the rectangle.
 Create another class called Main. In the method, create instances of the above classes and test the above classes.




All Float values are displayed correct to 2 decimal places.
All text in bold corresponds to input and the rest corresponds to output.
Sample Input and Output 1:
Circle
Square
Rectangle 
Enter the shape name 
Circle 
Enter the radius 
25 
Area of Circle is 1962.50
*/


package com.problem1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter 1 for circle\n 2 for square \n 3 for rectangle");
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		if (input == 1) {
			System.out.println("Enter the radius");
			float radius = scanner.nextFloat();
			Shape shape = new Circle("circle", radius);
			System.out.printf("Area is %.2f", shape.calculateArea());

		}
		if (input == 2) {
			System.out.println("Enter the length");
			float length = scanner.nextFloat();
			Shape shape = new Square("square", length);
			System.out.printf("Area is %.2f", shape.calculateArea());

		}
		if (input == 3) {
			System.out.println("Enter the length");
			float length = scanner.nextFloat();
			System.out.println("Enter breadth");
			float breadth = scanner.nextFloat();
			Shape shape = new Rectangle("Rectangle", length, breadth);
			System.out.printf("Area is %.2f", shape.calculateArea());
		}

		scanner.close();
	}

}
