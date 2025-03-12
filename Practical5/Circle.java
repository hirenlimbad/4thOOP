
public class Circle extends Shape{
    int radius;

    Circle(int radius){
        this.radius = radius;
    }
    
    int area(){
        return 2 * radius * (22/7);
    }
}