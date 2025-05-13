//File A
package apack;
public class A {
    int defaultVar=10;
    protected int protectedVar=20;
    private int privateVar= 30;
    public int publicVar= 40;
}

//File B
package bpack;
import apack.A;
public class B extends A {
    public void display(){
        System.out.println("Protected:" + protectedVar);
        System.out.println("Public:"+ publicVar);

    }
}

//File C
package cpack;
import apack.A;
public class C {
    public void display(){
        A obj = new A();
        System.out.println("Public:"+ obj.publicVar);
    }
}

//Main File
package dpack;
import bpack.B;
import cpack.C;
public class ProtectedDemo {
    public static void main(String[] args){
        B BObj= new B();
        C cObj= new C();
        System.out.println("from class B:");
        BObj.display();
        System.out.println("from class C:");
        CObj.display();
    }
}
