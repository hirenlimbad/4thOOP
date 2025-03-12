import java.util.Scanner;


public class PasswordChecker{

	public static void checkPass(String password){

		if (password.length() < 8 ){
			System.out.println("Password must be have more then the 8 chars.");
			return;
		}
		
		char nums[] = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};
		int counter = 0;
		for (int i=0; i<password.length(); i++){
			for (char n: nums){
				if (n == password.charAt(i)) counter++;
			}
		}

		if (password.length() - 1 == counter) { System.out.println("Passoword must contain letters.");  return; }
		if (counter<2){ System.out.println("atleast 2 digit is required in password."); return; }
		System.out.println("Password is valid.");
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your password : ");
		String password = sc.nextLine();
		checkPass(password);
	}

}