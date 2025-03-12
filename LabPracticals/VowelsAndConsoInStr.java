

import java.util.Scanner;
public class VowelsAndConsoInStr{

		static boolean checkVowel(char c){
			char vowels[] = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
			for (char temp: vowels)
				if (temp == c) return true;

			return false;
		}
		
		public static void main(String args[]){

			Scanner sc = new Scanner(System.in);

			System.out.println("Enter your name: ");
			String inp = sc.nextLine();
			int vowels = 0;
			int consonent = 0;

			for (int i =0; i<inp.length(); i++){
				if (checkVowel(inp.charAt(i))){
					vowels++;
				}
				else{
					consonent++;
				}
			}
			
			System.out.println("in your name, the total no of vowels is: " + vowels + "\nConsonents are: " + consonent );
		
		}
}