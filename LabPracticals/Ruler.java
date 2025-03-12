
public class Ruler{

	public static void main (String args[]){
		System.out.print("Let's Convert into the feet!: Please enter the value in the meter: ");
		float meter = Integer.parseInt(System.console().readLine());
		float feet = meter * 3.28084f;
		System.out.println( "No of feet are : " + feet);
		
	}
	
}