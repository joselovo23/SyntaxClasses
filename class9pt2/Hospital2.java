package com.syntax.class9pt2;

import com.syntax.reviewclass9.Doctor;

//test out Doctor
public class Hospital2 {
    public static void main(String[] args) {
        Doctor doc =new Doctor("Volcan", "Dereli");
        doc.printInfo();//public, available everywhere
        //we won't be able to see  a difference between protected and default unless we use inheritance
        //to use protected, we have to use inheritance: "extends"
        //Doctor.work(); //protected method is not available in different package
        //doc.hello(); not available in different package because it is a defualt method
        //doc.getPaid(); private method is not available in different classes
    }
}
