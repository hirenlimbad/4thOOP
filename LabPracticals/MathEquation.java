public class MathEquation {
	
	public static void main(String args[]){
		float a, b, c, d, e, f, x, y;
		a = 3.4f;
		b = 50.2f;
		e = 44.5f;
		c = 2.1f;
		d = 0.55f;
		f = 5.9f;
		
		x = ((e*d) - (b * f) ) / ((a*d) - (b*c));
		y = ((a*f) - (e*c)) / ((a*d) - (b*c));

		System.out.print("Value of x is "+x);
		System.out.println(" and value of y is "+ y + ".");
	
	}
	
}