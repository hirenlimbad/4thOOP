// Define Class named Point which represents 2-D Point, i.e P (x, y). Define
// Defaultconstructor to initialize both data member value 5, Parameterized constructor
// to initialize member according to value supplied by user and Copy Constructor.
// Define Necessary Function and Write a program to test class Point.

public class Point {

    int x = 0;
    int y = 0;
    
    Point(){
        x = 5;
        y = 5;
    }

    Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    Point(Point ag){
        x = ag.x;
        y = ag.y;
    }

    public String toString() {
        return "x = " + this.x + ", y = " + this.y + "\n";
    }
}
