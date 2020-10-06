/*The following Java applications contain errors. Point out the statement(s) that contain errors. Explain what each of the errors is, and how it can be fixed.*/

package com.problem4;

public class OopExcercises {
	public static void main(String[] args) {
		A objA = new A();
		System.out.println("in main(): ");
		// System.out.println("objA.a = "+objA.a); ===>private cant be accesed
		// outside class

		System.out.println("objA.a = " + objA.getA());
		// objA.a = 222;-------> use set method

		objA.setA(222);

	}
}
