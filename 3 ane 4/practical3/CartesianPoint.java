import java.util.Scanner;

public class CartesianPoint {
    int x;
    int y;

    CartesianPoint(int x, int y){
        move(x, y);
    }

    CartesianPoint(int x){
        moveX(x);
    }

    CartesianPoint(int y, float isY){
        moveY(y);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void move(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void moveY(int y){
        this.y = y;
    }
    public void moveX(int x){
        this.x = x;
    }

    public void display(){
        System.out.println("X is: " + x +  ", Y is: " + y);
    }

}