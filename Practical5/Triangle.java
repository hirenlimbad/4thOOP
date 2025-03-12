public class Triangle extends Shape {

    int sideA;
    int sideB;
    int sideC;

    int area(){
        return this.sideA * this.sideB * this.sideC;
    }
}
