import java.util.Scanner;

public class CalcBMI{
	
	public static float getBMI(float weight, float height){
		float w_in_kg = weight /  2.205f;
		float h_in_metr = height / 39.37f;
		return w_in_kg / (h_in_metr * h_in_metr);
		
	}

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter your weight in pound and height in inchs seperated by space: ");
		float weight = sc.nextFloat();	
		float height = sc.nextFloat();
		float BMI = getBMI(weight, height);
		System.out.println("Calculated BMI is: " + BMI);
	}

}