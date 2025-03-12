
import java.util.Scanner;

public class Names{
	public static void main(String[] args) {
		Scanner	sc = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name = sc.nextLine();
		System.out.print("\n How many times you wanna repeat? : ");
		int n = sc.nextInt();
		System.out.println("");
		
		for (int i=0; i<n;i++ ) {
			System.out.println(name);
		}
	}
}