package com.syntax.class18;
//import com.syntax.class18.AccessModifiers;
//***in the class example, the package was class17;

public class AccessModifiersTester {
    public static void main(String[] args) {
        AccessModifiers am = new AccessModifiers();
        /*
        Can't access as name has private access
        Can't access age because it has default access
        Can't access weight because it has protected access
        can only access color because it has public
        access which cna be accessed from anywhere inside the same project
         */
        //System.out.println(am.name);
        //System.out.println(am.age);
        //System.out.println(am.weight);
        System.out.println(am.color);
    }
}