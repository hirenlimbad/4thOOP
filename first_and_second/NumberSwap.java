
import java.util.Scanner;

class NumberSwap{

	public static void main(String args[]){

	Scanner sc = new Scanner(System.in);

	System.out.print("Enter the value for A and B, followed by space: ");
	int[] arr = new int[2];
	arr[0] = sc.nextInt();
	arr[1] = sc.nextInt();
	arr = swap(arr);
	System.out.print("Value for A =" + arr[0] + " and B = "  + arr[1]);
	}
public static int[] swap(int arr[]){
	int temp = arr[0];
	arr[0] = arr[1];
	arr[1] = temp;
	return arr;
}
}

