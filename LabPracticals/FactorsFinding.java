
import java.util.Scanner;
public class FactorsFinding	{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your integer : ");
		int number = sc.nextInt();
		for (int i = 2; i <= number; i++){
			if ( number % i == 0){
				System.out.print(i + " ");
				number = number / i;
				i--;
			}
			if (number == i){
				System.out.println(number);
				break;
			}
		}
	}
}