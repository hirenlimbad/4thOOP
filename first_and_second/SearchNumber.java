import java.util.Scanner;

class SearchNumber{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n, x;
		int arr[];

		System.out.print("How many numbers you have? : ");
		n =  sc.nextInt();
		arr = new int[ n ];
	
		for (int i=0; i<n; i++){
			System.out.print("Enter number for the " + i + " index: ");
			arr[i] = sc.nextInt();
		}
		
		System.out.print("Enter the number you wanna search: ");
		x = sc.nextInt();
		
		System.out.println("");

		int flag = 0;
		for (int i=0; i<n; i++){
			if (arr[i] == x){
				flag = 1;
				System.out.println("\nNumber found at " + i + " index location.");
			}
		}

		if (flag == 0) System.out.println("Sorry! your number are not found in given list.");
		sc.close();
	}
}
