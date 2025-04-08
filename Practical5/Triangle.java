public class Triangle extends Shape {
    int sideA;
    int sideB;
    int sideC;

    Triangle(int a, int b, int c){
        sideA = a;
        sideB = b;
        sideC = c;
    }

    int area(){
        return this.sideA * this.sideB * this.sideC;
    }
}
