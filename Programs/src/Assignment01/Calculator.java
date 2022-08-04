//6.	Define a class Calculator which has the two integer members. Define add(), sub(), multi(), divi() , show() methods to perform Addition, Subtraction, Multiplication , Division and Display operations. [Don’t pass the parameter in the methods]. Create an object and call the methods in correct order. 

package Assignment01;

import java.util.Scanner;

public class Calculator {
	static int a, b;

	int add() {
		return a + b;
	}

	int sub() {
		return a - b;
	}

	int multi() {
		return a * b;
	}

	double divi() {
		return a / b;
	}

	void show() {
		System.out.println(a + " + " + b + " = " + add());
		System.out.println(a + " - " + b + " = " + sub());
		System.out.println(a + " * " + b + " = " + multi());
		if (b == 0)
			System.out.println(a + " / " + b + " = Undefined");
		else
			System.out.println(a + " / " + b + " = " + divi());
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the First Number: ");
		a = sc.nextInt();
		System.out.print("Enter the Second Number: ");
		b = sc.nextInt();
		Calculator ob = new Calculator();
		ob.show();
	}

}
