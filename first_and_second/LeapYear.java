
import java.util.Scanner;

class LeapYear{

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the year to determine is leap or not: ");
		int year = sc.nextInt();
		int isleap = isLeapYear(year);
		
		if (isleap == 1) { 	
			System.out.print("Yes! Number is leap year."); 
		}
		else{
			System.out.print("No, Number is not leap year.");
		}
		
	}


	public static int isLeapYear(int year){
		if (year % 4 == 0 & year % 100 != 0 ){
			return 1;	
		}
		if (year % 400 == 0){
			return 1;
		}
		return 0;
	}
}