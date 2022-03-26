package com.syntax.class24;
//Final keyword; doesn't let other classes extend from parent
//class
/* EXAMPLE:
public final class Parent {
    void method(){
        System.out.println("i am parent");
    }
}
 */
public  class Parent {
    final String name="Vladlen";
    final void method(){//cant override method
        //name="Mr.A"; //cannot assign value to final variable if variable is final
         System.out.println("i am parent");
    }
}
class Child extends Parent{
    /* void method(){
        can't override because it is final method
     */
}