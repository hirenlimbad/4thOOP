

//largest common prefix of 2 string.

//aaaabbb
//aabaaav

// ans = 'aa'

import java.util.Scanner;

public class CommonPrefix{

		public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your first string: ");
		String str1 = sc.nextLine();

		System.out.print("Enter your second string: ");
		String str2 = sc.nextLine();

		int counter = 0;
		
		for (int i = 0; i<str1.length(); i++){
			if (str1.charAt(i) == str2.charAt(i) ){
				counter++;
			}
			else{
				break;
			}
		}

		System.out.println("Common Substring is: " + str1.substring(0, counter));

		}
}