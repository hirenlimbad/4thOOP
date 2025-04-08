
package bpack;
import pack.A;

public class B extends A{
    public void display(){
        System.out.println( String.format("priavate variable value : %s\npublic value: %s\n protected value : %s", getPriv(), super.pub, super.protect));
    }
}