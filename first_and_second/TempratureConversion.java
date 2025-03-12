import java.util.Scanner;

class TempratureConversion{
	public static void main(String args[]){
	System.out.print("Enter the temprature in fahrenheit: ");
	float temprature = new Scanner(System.in).nextInt();
	System.out.println("Equivalent celsius value is: " + convertFtoC(temprature));
}

static float convertFtoC(float f){
	return (f - 32) * 5/9;
}

}