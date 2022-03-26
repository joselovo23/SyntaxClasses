package com.syntax.class22;

public class IfElseDemo {
    public static void main(String[] args) {

        int number=10;
        /*
        The  ternary operator has the limitation that it must return something. We can't use it to print out
        things
         */

        //number>10?System.out.println("Number is greater"):System.out.println("Number is smaller");

    }
    int maxNumber(int num1, int num2){
        /*if(num1>num2){
            return num1;

        }else{
            return num2;
        }*/
       return num1>num2?num1:num2;//check if num1 greater than num 2
        //num1>num2=>the condition part

    }
}
