package com.syntax.class19;

public class Car {
    //THIS KEYWORD, shortcut, right click, generate, constructor, select all fields, then click ok
    String name ="Toyota";
    String make;
    String color;
    String type;
    Car(String name, String make, String color, String type){
        /*
        if we have same local and instance variable
        Java always prefers locla variables
        if you want to instruct Java to use instance variable
        we use the "this" keyword
         */
        this.name=name;
        this.make=make;
        this.color=color;
        this.type=type;
    }
    Car(){

    }
    void PrintCar(){
        String name="Tesla";
        System.out.println(name);
        System.out.println(this.name);
    }
}
