//2.	Generate all the ODD numbers from 1 to 100.

package Assignment01;

public class GenerateAllOdd {

	public static void main(String[] args) {
		System.out.println("All Odd Numbers from 1 to 100 are: ");
		for (int i = 1; i <= 100; i++) {
			if (i % 2 != 0)
				System.out.print(i + " ");
		}
	}

}
