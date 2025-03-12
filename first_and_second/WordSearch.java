
import java.util.Scanner;

class WordSearch{
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		System.out.print("How many word you have ?: ");
		int n = sc.nextInt();

		String arr[] = new String[n];
			sc.nextLine();
		for (int i = 0; i<n; i++){
			System.out.print("Enter your word for "+ i + " index location: ");
			arr[i] = sc.nextLine();
		}
		
		System.out.print("Enter word you want to search : ");

		String x = sc.nextLine();
		System.out.println("");
		
		int flag = 0;
		for (int i = 0; i<n; i++) {
			if (x.equals(arr[i])){
				System.out.println("Your word found at "+ i + " index location.");
				flag = 1;
			}
		}

		if (flag == 0) System.out.println("Sorry! word not found.");

	}
}