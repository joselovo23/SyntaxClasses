package com.syntax.class16;

public class Task1 {
    public static void main(String[] args) {
        //create a string that will hold a sentence. Write a program to get a new
        //string without any spaces

        String s="This is a sentence";
        String newStr=s.replace(" ", "");
        System.out.println(newStr);
    }
}
