
import java.util.Scanner;

public class ReverseNumber{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the 5 numbers separated by space: ");
		
		int arr[] = new int[5];
		int arrR[] = new int[5];
		for (int i = 4; i>=0; i--){
			arr[i]  = sc.nextInt();
			arrR[4-i] = arr[i];
			System.out.println(5-i);
		}
		
		for (int num: arrR){
			System.out.print(num + " ");
		}
		
	}
}