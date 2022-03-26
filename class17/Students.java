package com.syntax.class17;

public class Students {
    /*
    Create a Class called Students
Create three  variables  Name , ID  and  numberOfStudents
Create three objects of the Students Class
Set the value for  studentName , studentID and increment  the numberOfStudents for each object
Print out  total number of students
     */

    String name;
    String id;
    static int numberOfStudents;

    public static void main(String[] args) {
        Students student1=new Students();
        student1.name="Yazgul";
        student1.id="123";
        Students.numberOfStudents++;

        Students student2=new Students();
        student1.name="Zuhoor";
        student1.id="456";
        Students.numberOfStudents++;

        Students student3=new Students();
        student1.name="Sayed";
        student1.id="789";
        Students.numberOfStudents++;
        System.out.println(Students.numberOfStudents);
    }
}
