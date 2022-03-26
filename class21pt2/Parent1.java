package com.syntax.class21pt2;

public class Parent1 {
    String name ="Parent";
    void printName(){
        System.out.println(name);
    }

}
    //instance variable is declared inside a class
class Child1 extends Parent1{
    String name ="Child";//instance variable
    void printName(){
        //a local variable is only in a method of a class,instance cannot be in the method of a class
       String name ="Teyfuring"; //first priority is given to local variables
        System.out.println(name);

        //when we use the "this" keyword, even though we have a local variable,
        //Java will only bring the values from the instance variable
        System.out.println(this.name);//instance variable

        //when we use the "super" keyword, even though we have a local
        //variable, and instance variable inside the same class
        //Java will only bring the values from parent class instance variables
        System.out.println(super.name);//parent variable
    }
}
class ParentTester{
    public static void main(String[] args) {
       Child1 child1=new Child1();
       child1.printName();
    }
}