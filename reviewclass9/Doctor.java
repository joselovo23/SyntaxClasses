package com.syntax.reviewclass9;
//instance variables example

public class Doctor {

    //instance variables-declared inside the class but outside of any method, constructor, or block
    //using access modifiers: public, protected, default, private
    public String firstName;
    protected String lastName;
    String speciality;//default
    private double salary;

    //static variable-declared inside the class but outside of any method, constructor, or block
    //using static keyword

    static String hospital="Jorge Washington";


    //static methods can access only static variables
    static void work(){
        System.out.println("All doctors work at "+hospital);
    }
    //Constructor-initializing instance variables
    //Constructor can have access modifiers
    public Doctor(String firstName, String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
    }
    //We can have multiple constructor by overloading them
    public Doctor(String firstName, String lastName, String speciality){
        this(firstName, lastName);
        this.speciality=speciality;
    }
    //static method cannot access non static members
    //non static methods can access static and non static members
     public void printInfo(){
        this.hello(); //calling hello method, we do not need to put "this" (compiler adds it)
        System.out.println("Doctor "+firstName+" "+lastName+" is a "+speciality+" at "+hospital);
    }
    protected static void work1(){
        System.out.println("All doctors work at "+hospital);
    }
    void hello(){
        System.out.println("Hello");
    }
    private void getPaid(){
        System.out.println("Doctor "+firstName+" "+lastName+" gets paid "+salary);
    }
    //non static members can access static members
   /*
    static void printInfo(){
        System.out.println("Doctor "+firstName+" "+lastName+" is a "+speciality);
    }

    if we have same local and instance variables java always prefer local variables
    if you want to instruct java to use instance variables we use the "this" keyword

    */


}
