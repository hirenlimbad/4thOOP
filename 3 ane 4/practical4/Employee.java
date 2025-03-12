package practical4;
public class Employee extends Human {
    double salary;
    String position;

    Employee(String name, String address, int salary, String position){
        super(name, address);
        this.salary = salary;
        this.position = position;
    }

    public String toString(){
        return  super.toString() + ", Salary is " + salary + " and position is " + position;
    }
}
