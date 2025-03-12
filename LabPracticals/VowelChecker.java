import java.util.Scanner;

public class VowelChecker{

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		char vowels[] = {'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u'};
	
		System.out.print("Please enter your letter: ");
		char letter = sc.next().charAt(0);
		int flag = 0;
		for (char c: vowels){
			if (letter == c){
			 	System.out.println("Your letter is vowel.");
				flag = 1;
			}
		}
		if (flag == 0){
			System.out.println("Your letter is consonent.");
		}
	}

}