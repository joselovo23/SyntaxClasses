package com.syntax.class17;

public class Dog {
    //when the information is expected to be different from object to object
    //we store that information in an instance variable
    String name; //instance
    String color; //instance
    //if we know that a value will stay the same for all objects of a class
    //we create a static variable for that
   static int numberOfLegs; //static
    void eat(){
        int noOfTimes=3; //local
        System.out.println(name+" eats "+noOfTimes);
    }

    void sleep(){
        //System.out.println(name+" sleeping"); can access local
    }

    public static void main(String[] args) {
        Dog dog =new Dog(); //Local
        //dog spelled with uppercase "D" is the name of the class
        //dog spelled with lower case "d" is the object
        dog.name="scooby";
        dog.color="Pink";
        Dog.numberOfLegs=4;
        dog.eat();

        Dog dog2=new Dog();
        dog2.name="tomy";
        dog2.color="navy blue";
        Dog.numberOfLegs=4;
        dog2.eat();

    }
}
