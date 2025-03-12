 

import java.util.Scanner;

public class Sorting{
	
	public static void SelectionSort(int arr[]){
		int n = arr.length;
		for (int i = 0; i<n; i++){
			for (int j = i+1; j<n; j++){
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		System.out.print("Enter array: ");
		for (int i =0; i<10; i++){
			arr[i] = sc.nextInt();
		}
		SelectionSort(arr);
		System.out.println("Sorted array is: ");
		for (int i =0; i<10; i++){
			System.out.print(arr[i] + " " );
		}

	}

}