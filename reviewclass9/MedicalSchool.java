package com.syntax.reviewclass9;

public class MedicalSchool {
    public static void main(String[] args) {
        //I want to test accessibility

        Doctor doc = new Doctor("Asel", "Kiyatova","Dermatologyst");

        doc.printInfo(); //public method avaialable
        Doctor.work();//protected method available
        doc.hello(); //default method available
        //doc.getPaid(); private method is not available in different classes

        System.out.println(doc.firstName);
        System.out.println(doc.lastName);
        System.out.println(doc.speciality);
       // System.out.println(doc.salary); private variable is not available

    }

}
