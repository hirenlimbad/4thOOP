
public class Rectangle{
	
	double width;
	double height;
	
	Rectangle(){
		height = 1;
		width = 1;
	}

	Rectangle(double width, double height){
		this.width = width;
		this.height = height;
	}
	
	public double getArea(){
		return this.height * this.width;
	}
	
	public double getPerimeter(){
		return 2 * (this.height+this.width);
	}

	public String toString(){
		return "height is: " + this.height +  " width is: " + this.width + " \n perimeter is: " + this.getPerimeter() + " area is: " + this.getArea();
	}
	

	
	public static void main(String args[]){
		Rectangle r = new Rectangle(4, 40);
		Rectangle r2 = new Rectangle(3.5, 35.5);
		System.out.println( "For rectangle 1\n " + r);
		System.out.println("\nFor rectangle 2\n " + r2);
	}
	
}