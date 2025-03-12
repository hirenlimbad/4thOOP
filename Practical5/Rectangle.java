

public class Rectangle extends Shape{
    int height;
    int width;
    
    Rectangle(int height, int width){
        this.height = height;
        this.width = width;
    }

    int area(){
        return this.width * this.height;
    }
}