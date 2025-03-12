
import java.util.Scanner;

public class Cashier {

	public static void main(String args[]) {
		int avail_notes[] = { 1, 2, 5, 10, 50, 100 };
		int notes[] = new int[avail_notes.length];
		Scanner sc = new Scanner(System.in);

		System.out.print("Please Enter the amount you wanna withdraw: ");
		int amount = sc.nextInt();
		int counter = 5;

		// amount = 0
		while (amount != 0) {

			if (amount - avail_notes[counter] >= 0) {
				amount -= avail_notes[counter];
				notes[counter]++;
			} else {
				counter--;
			}
		}

		for (int i = 0; i < notes.length; i++)
			if (notes[i] != 0)
				System.out.println("Notes of " + avail_notes[i] + " are " + notes[i] + ".");
	}

}