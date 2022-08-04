//3.	Write a program to check whether a number is Prime or Not.

package Assignment01;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int number = sc.nextInt();
		boolean isPrime = true;
		for (int i = 2; i <= number / 2; i++)
			if (number % i == 0)
				isPrime = false;

		if (isPrime)
			System.out.println("Prime Number");
		else

			System.out.println("NOT a Prime Number");
	}

}
