// Write a program that finds Volume of any shape by overloading volume () method for 
// Cube, Rectangular Cube and Sphere.

import java.util.Scanner;

public class VolumeCalc {

    static double volume(double edge){
        return edge * edge * edge;
    }

    static double volume(double l, double w, double h){
        return l * w * h;
    }

    static double volume(double r, int isSpeare){
        return (3.14) * (r * r * r) * 4/3;
    }
    static void print(double area){
        System.out.println("Volume is: "  + area);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side of Cube: ");
        print(volume(sc.nextDouble()));

        System.out.print("Enter the radius of speare: ");
        print(volume(sc.nextDouble(), 1));

        System.out.print("Enter the 3 side of Rectangular cube: ");
        print(volume(sc.nextDouble(), sc.nextDouble(), sc.nextDouble()));
    }
}
