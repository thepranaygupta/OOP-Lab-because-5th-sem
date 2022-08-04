//5.	Write a program to perform the following operation between two operands of integer type, the operation includes Addition, Subtraction, Division and Multiplication.

package Assignment01;

import java.util.Scanner;

public class ArithmeticOperations {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the First Number: ");
		int a = sc.nextInt();
		System.out.print("Enter the Second Number: ");
		int b = sc.nextInt();
		System.out.println(a + " + " + b + " = " + (a + b));
		System.out.println(a + " - " + b + " = " + (a - b));
		System.out.println(a + " * " + b + " = " + (a * b));
		if (b == 0)
			System.out.println(a + " / " + b + " = Undefined");
		else
			System.out.println(a + " / " + b + " = " + (a / b));
	}

}
