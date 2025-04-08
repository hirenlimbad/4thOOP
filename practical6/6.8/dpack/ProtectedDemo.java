package dpack;

import bpack.B;
import cpack.C;
public class ProtectedDemo{
    public static void main(String[] args) {
        B b = new B();
        C c = new C();
        b.display();
        c.display();
    }
}