//4.	Generate all the Prime numbers from 1 to 100.

package Assignment01;

public class GenerateAllPrime {

	public static void main(String[] args) {
		System.out.println("All Prime Numbers from 1 to 100 are: ");
		for(int i = 1; i <= 100; i++) {
			boolean isPrime = true;
			for (int j = 2; j <= i / 2; j++)
				if (i % j == 0)
					isPrime = false;

			if (isPrime)
				System.out.print(i+" ");
		}
	}

}
