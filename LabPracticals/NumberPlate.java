import java.util.Scanner;
import java.util.Random;

public class NumberPlate{
	static String ABCD = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	public static String generateNumberPlate(){
		Random random = new Random();
		int number = random.nextInt(9999);
		String plate = "";
		for (int i = 0; i<3; i++){
			plate += ABCD.charAt(random.nextInt(26));
		}
		System.out.println(plate + "-" +  number);
		return "";
	}

	public static void main(String args[]){
		generateNumberPlate();
	}
}