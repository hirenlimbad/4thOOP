import  java.utils.Scanner;

class FindMinimum{
	public static void main(String args[]){
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter 5 - 5 elements one by one.");
		int arr[2][5] = new int[2][5]
		for (int i = 0; i<2; i++){
			for (int j = 0; j<5; j++){
				arr[i][j]  = sc.nextInt();
			}	
		}	
	}	
	
	int findMinimum(int arr[][]){
		int minimum = 0;
		for (int i = 0; i<2; i++){
			for (int j = 0; j<5; j++){
				arr[i][j]  = sc.nextInt();
			}	
		}	
	}
}