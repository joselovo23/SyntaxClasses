package com.syntax.class24;

public class Task1Tester {
    public static void main(String[] args) {
        //in java we can store the object of a child classs
        //in a parent type variable
        //Every class in java can be treated as data type
        Student syntaxStudent = new SyntaxStudent();
        Student schoolStudent=new SchoolStudent();
        /*
        as we can store the object of a child class in a parent class
        we can also create an array of these students as shown below
         */
        Student[] students={new SyntaxStudent(),new SchoolStudent(),
        new CollegeStudent()};
        /*int[]arr={1,2,3};
        for(int number:arr){
            System.out.println(number);
        } THIS IS AN EXAMPLE OF HOW TO PRINT STUFF WITH A FOR EACH LOOP
        */
        //student[0].practice();

            //calling the methods from all the children classes
            for(Student student: students){
                student.study();
                student.doHomework();
                student.practice();
            }

    }
}
