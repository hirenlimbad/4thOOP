

public class Rectangle{
	
	double width;
	double height;
	
	Rectangle(){

	}

	Rectangle(double width, double height){
		this.width = width;
		this.height = height;
	}
	
	public double getArea(){
		return this.height * this.width;
	};
	
	public double getPerimeter(){
		return 2 * (this.height+this.width);
	}
	

	
	public static void main(String args[]){
		Rectangle r = new Rectangle(10, 20);
		System.out.println(r.getArea());
	}
	
}