import java.util.Scanner;

class DuplicateRemove{

	public static void main(String args[]){
		int arr[] = new int[5];
		System.out.print("Enter your 5 numbers: ");
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int blank[]  = new int[5];
		int iterator = findDuplicate(arr, blank);

		for (int i=0; i<iterator; i++){
			System.out.print(blank[i] + " ");
		}
	}

	static int findDuplicate(int arr[], int blank[]){
		int iterator = 0;
		for (int i=0; i<5; i++){
			int flag = 0;
			for (int j=0; j<iterator; j++){
				if (blank[j] == arr[i]){
					flag = 1;
				}
			}
			if (flag == 0){
				blank[iterator] = arr[i];
				iterator++;
			}
			
		}
		return iterator;	
		
	}
}