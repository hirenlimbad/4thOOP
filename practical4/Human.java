public class Human {
    String name;
    String address;
    
    Human(String name, String address){
        this.name = name;
        this.address = address;
    }
    void walk(){
        System.out.println("yes i am walking.");
    }
    public String toString(){
        return "Name is " + name + " and address is " + address;
    }
}
