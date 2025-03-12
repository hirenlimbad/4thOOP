
class Animal {
    void speak(){
        System.out.println("Yes! i can speak. as an animal");
    }
    void walk(){
        System.out.println("Animal walks.");
    }
}

class dog extends Animal{
    void speak(){
        System.out.println("i bark.");
    }

    void sayHello() {
        System.out.println("i am saying hello.");
    }
}