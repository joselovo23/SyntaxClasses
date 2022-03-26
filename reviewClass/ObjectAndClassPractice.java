package com.syntax.reviewClass;

public class ObjectAndClassPractice {

    String empName;
    int empID;
    String group;

    void employeeDetails(){//void doesn't return anything
        System.out.println("This method shows the details of the employee");
    }

    void employeeGroup(){
        System.out.println("This method shows the group of the employee");
    }

    public static void main(String[] args) {
        ObjectAndClassPractice obj = new ObjectAndClassPractice();
        obj.employeeGroup();
        obj.employeeDetails();

    }
}
