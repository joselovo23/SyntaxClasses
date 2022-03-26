package com.syntax.class24;
//anything under interface is assumed to be abstract
//you don't need the abstract keyword
//INTERFACE IS ALREADY ABSTRACT
// keywords we can't use in Interface: static, final,private
public  interface Employee {
    public static final int age=10;
    /*
    by default all the variabes in a interface are public static final
     */
    void work();

    /*
    All the methods inside an interface which do not have body
    are abstract & public.
    We cannot create an object, no instance variables
     */
}

class Tester implements Employee{

    @Override
    public void work() {
        System.out.println("Testing a website");
    }

    public static void main(String[] args) {
        Tester tester =new Tester();
        tester.work();
        System.out.println(Employee.age);
        Employee tester2=new Tester();

    }
}
