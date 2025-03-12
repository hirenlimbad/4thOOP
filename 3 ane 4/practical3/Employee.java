
// Create a class Employee which has two private data members name and salary and it
// has two public member functions named as getData() and putData() where getData()
// gets name and salary from the user putData() displays name and salary for any user.


public class Employee {
    private int salary = 0;
    private String name = "";

    public Employee(String string, String string2, int i, String string3) {
        //TODO Auto-generated constructor stub
    }

    public String getData(){
        return "Name is " + this.name + ", Salary is: " + this.salary;
    }

    public void putData(String name, int salary){
        this.name = name;
        this.salary = salary;
    }

    public String toString(){
        return this.getData();
    }
}
