package com.syntax.reviewClass;

public class Practice2 {

    //writing method in the class to return record
   String getRecord(){
        String department="QA";
        String empName="Voilet";
        String details ="Worker "+empName+" belongs to "+department;
       System.out.println(details);
        return details;
    }

    public static void main(String[] args) {
       //creating an object of class
        Practice2 p = new Practice2();
        p.getRecord();

    }
}
