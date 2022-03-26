package com.syntax.class16;

public class StringDemo3 {
    public static void main(String[] args) {
        String str="123456!#$#%#&asdnkaASGJSXU";
        String str2=str.toLowerCase();
        System.out.println(str.replaceAll("[0-9]","Julia"));
        System.out.println(str.replaceAll("[0-9]",""));
        System.out.println(str.replaceAll("[a-z]",""));
        System.out.println(str.replaceAll("[A-Z]",""));
        System.out.println(str.replaceAll("[!-/]",""));
        System.out.println(str.replaceAll("[A-Za-z0-9]",""));//can specify multiple ranges inside brackets without commas.
        System.out.println(str.replaceAll("[^A-Za-z0-9]",""));//using not, use ^, removes everything thats not specified
    }
}
