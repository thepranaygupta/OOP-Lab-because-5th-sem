//7.	Define a class Calculator2 which has the two integer members. Define add(int,int), sub(int,int), multi(int,int), divi(int,int) , show() methods to perform Addition, Subtraction, Multiplication , Division and Display operations. Create an object and call the methods in correct order.

package Assignment01;

import java.util.Scanner;

public class Calculator2 {
	static int a, b;

	int add(int a, int b) {
		return a + b;
	}

	int sub(int a, int b) {
		return a - b;
	}

	int multi(int a, int b) {
		return a * b;
	}

	double divi(int a, int b) {
		return a / b;
	}

	void show() {
		System.out.println(a + " + " + b + " = " + add(a, b));
		System.out.println(a + " - " + b + " = " + sub(a, b));
		System.out.println(a + " * " + b + " = " + multi(a, b));
		if (b == 0)
			System.out.println(a + " / " + b + " = Undefined");
		else
			System.out.println(a + " / " + b + " = " + divi(a, b));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the First Number: ");
		a = sc.nextInt();
		System.out.print("Enter the Second Number: ");
		b = sc.nextInt();
		Calculator2 ob = new Calculator2();
		ob.show();
	}
}
