//1.	Write a program to check whether a number is ODD or EVEN.

package Assignment01;

import java.util.Scanner;

public class OddOrEven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int number = sc.nextInt();
		if (number % 2 == 0)
			System.out.println("Even Number");
		else
			System.out.println("Odd Number");
	}

}
