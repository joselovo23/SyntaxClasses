package com.syntax.reviewclass9;

public class Hospital {
    public static void main(String[] args) {


        Doctor doc=new Doctor("John", "Smith", "Surgeon");
        doc.printInfo();
        Doctor doc1=new Doctor("Jane", "Smith");
        doc1.printInfo();

        System.out.println("Changing value of instance variable");
        doc1.speciality="Dermatologyst";
        doc1.printInfo();

        doc.printInfo();

        System.out.println("Changing the value of static variable by the name of the class");
        //static variable should access in static way -> by class name where variable is defined
        Doctor.hospital="Inova";
        doc.printInfo();
        doc1.printInfo();

        System.out.println("----------------------------------");
        doc1.hospital="Best Hospital"; //changing static variable for doc1, changes for doc as well
        //this. works with variables, class constructor
        //this() works
        doc.printInfo();
        doc1.printInfo();

        /*
            VARIABLES
           optional         optional              must    must
           access modifier  non access modifier   dataType name;


            METHODS
            optional            optional                 must        must
            access modifier     non access modifier     returnType  name()


         */

        /*

            from the most restrictive to less restrictive

            private->default->protected->public
         */
    }
}
