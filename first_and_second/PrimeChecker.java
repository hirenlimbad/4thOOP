
// finding the number is prime or not.
// 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97

import java.util.Scanner;
class PrimeChecker{
	public static String isPrime(int number){
		for (int i=2; i<number; i++){
			if (number % i == 0 ){
				return "Not Prime"; 
			}
		}
		return "Prime";
	}

	public static int isItPrime(int number){
		for (int i=2; i<number; i++){
			if (number % i == 0 ){
				return 0; 
			}
		}
		return 1;
	}

	public static void printPrimes(int number){
		for (int i=2; i<number; i++){
			if (isItPrime(i)  == 1){
				System.out.print(i + ", ");
			}
		}
	}

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your number: ");
		int number = sc.nextInt();
		System.out.println("Your number is: " + isPrime(number));

		System.out.print("Enter your number i will give you all prime number within: ");
		number = sc.nextInt();
		printPrimes(number);
	}

}