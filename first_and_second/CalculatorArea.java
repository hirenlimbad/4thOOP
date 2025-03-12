import java.util.Scanner;
class CalculatorArea{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the height : ");
		int height = sc.nextInt();
                 System.out.println("The area of square is: "+ height * height);
	}
}