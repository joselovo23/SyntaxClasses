package com.syntax.class23;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import javax.crypto.spec.PSource;

public class StaticDemo {

}
class Cat{
    static int NoOfLegs=4;
    String name;

    Cat(String name){
        this.name=name;
    }

    public void printInfo(){
        System.out.println(name+NoOfLegs);

    }
    public static void Print(){
    //we can't access the instance fields directly inside static methods
    //System.out.println(name);
    }

    public static void main(String[] args) {
        Cat cat=new Cat("Stella");

        Cat.Print();
        Cat cat2=new Cat("Nella");
        Cat.Print();

    }
}
