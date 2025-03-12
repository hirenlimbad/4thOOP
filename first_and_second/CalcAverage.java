import java.util.Scanner;

class CalcAverage{
	public static void main(String args[]){
		
	int n = 5;
	System.out.print("Enter the 5 numbers separated by space: ");
	Scanner sc = new Scanner(System.in);
	int summation = 0;
	for (int i=0; i<n; i++){
		summation += sc.nextInt();
	}

	System.out.println("Average is: "+ summation/5);
}

}
