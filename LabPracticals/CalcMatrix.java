

import java.util.Scanner;

public class CalcMatrix{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int matA[][] = new int[3][3];
		System.out.println("Enter the 3 elements 3 times: ");
		for (int i=0; i<3; i++){
			for (int j=0; j<3; j++){
			matA[i][j] = sc.nextInt();
			}
		}

		int matB[][] = new int[3][3];
		System.out.println("Enter the 3 elements 3 times: ");
		for (int i=0; i<3; i++){
			for (int j=0; j<3; j++){
			matB[i][j] = sc.nextInt();}
		}
		
		int result[][] = new int[3][3];

		System.out.println("Which operation whould you like to perform? + for addition, - for substraction, * for multiplication.");
		sc.nextLine();
		char choice = sc.nextLine().charAt(0);

		switch (choice){
			case '+':
				addition(matA, matB, result);
				break;
			case '-':
				substraction(matA, matB, result);
				break;
			case '*':
				multiplication(matA, matB, result);
				break;
			default:
				System.out.println("Invalid! operation.");
				return;
		}

		
		for (int i = 0; i<result.length; i++){
			for (int j = 0; j<result[0].length; j++){
				System.out.print(result[i][j] + " " );
			}
			System.out.println();
		}
		
}
	static void addition(int arrA[][], int arrB[][], int result[][]){
			for (int i = 0; i<arrA.length; i++){
					for (int j = 0; j<arrB.length; j++){
						result[i][j] = arrA[i][j] + arrB[i][j]; 
					}
			}
	}
	static void substraction(int arrA[][], int arrB[][], int result[][]){
			for (int i = 0; i<arrA.length; i++){
					for (int j = 0; j<arrB.length; j++){
						result[i][j] = arrA[i][j] - arrB[i][j]; 
					}
			}
	}

	static void multiplication(int arrA[][], int arrB[][], int result[][]){
		for (int i = 0; i<3; i++){
			for (int j = 0; j<3; j++){
				result[i][j] = 0;
				for (int k = 0; k<3; k++){
				 	 result[i][j] += arrA[i][k] * arrB[k][j];
				}
		}
}
	}

	
}
