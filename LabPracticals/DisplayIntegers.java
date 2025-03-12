
import java.util.Scanner;

public class DisplayIntegers{

	static void swap(int arr[], int i, int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int arr[]  = new int[3];
		System.out.print("Enter the 3 integer values seperated by space: ");
		arr[0] = sc.nextInt();
		arr[1] = sc.nextInt();
		arr[2] = sc.nextInt();
		
		if (arr[0] < arr[1]){
			swap(arr, 0, 1);
		}
		if (arr[1] < arr[2]){
			swap(arr, 1, 2);
		}
		if (arr[0] < arr[1]){
			swap(arr, 0, 1);
		}

		System.out.print("Descresing order is: ");
		for (int number: arr){
			System.out.print(number + " ");
		}		

		
 	}

}