package com.syntax.class19;

public class Horse {
    //it is very good practice to make the fields private
    private String name;
    private int age;
    private double weight;

    //no argument/zero argument constructor
    Horse(){
        /*write some important lines of code that
            you want to execute when the object of a class is
            created
            For example,
            you might want to fetch some info from internet or hard disk
            to give initial values to the fields
        */
    }

    //purpose of constructor is to give initial values to the field of a class
    Horse(String horseName,int horseAge,double horseWeight){
        name=horseName;
        age=horseAge;
        weight=horseWeight;

    }
    //Rule no 1 Constructors don't have return types like int String not even void
    //void Horse(String horseName,int horseAge,double horseWeight){
       // name=horseName;
        //age=horseAge;
       // weight=horseWeight;

   // }
    /* Rule 2 name of the constructor should be same as name of the class

    Horse(String horseName,int horseAge,double horseWeight){
        name=horseName;
        age=horseAge;
        weight=horseWeight;


     */
    void printHorseName(){
        System.out.println("Name "+name);
    }

    void setName(String horseName){
        name=horseName;
    }
}
