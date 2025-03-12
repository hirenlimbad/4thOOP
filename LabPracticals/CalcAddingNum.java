
import java.util.Scanner;
public class CalcAddingNum{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter your number: ");
		int num = sc.nextInt();
		int carry = 0;
		int my_out = 0;	
		int my_count = 10;
		while (num > 0){
			int digit = num % 10;
			num = num / 10;
			int temp = digit+1+carry;
			my_out = (temp%10) * my_count + my_out;
			my_count *= 10;
			carry = temp/10;
		}
		if (carry == 1){
			System.out.print(carry);
		}
		System.out.println(my_out/10);
	}
}