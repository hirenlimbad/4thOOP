// The gcd of 60 and 48 is : 12

import java.util.Scanner;
public class CalcGCD{
	
	public static int getGCD(int a, int b){
		if (b == 0){
			return a;
		}
		else{
			return getGCD(b,  a % b);
		}
	}

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("To find the GCD enter the 2 numbers followed by space: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("GCD is: " + getGCD(a, b));	
	}
}