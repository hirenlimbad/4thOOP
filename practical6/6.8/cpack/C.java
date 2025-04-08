package cpack;
import pack.A;


public class C {
    public void display(){
        A a = new A();
        System.out.println( String.format("priavate variable value : %s\npublic value: %s\n protected value : %s", a.getPriv(), a.pub, a.getProtec()));
    }
}
