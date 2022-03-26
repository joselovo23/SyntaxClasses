package com.syntax.class16;

public class StringVsStringBuilder {
    public static void main(String[] args) {
        String s= new String("Asghar is Great"); //original string
        s.concat("hahah"); //add a new String hahha to the string
        System.out.println(s); //printing the original string
        //StringBuilder updates with every change made in print, String doesn't change even if you print differently

        StringBuilder stringBuilder = new StringBuilder("Asghar Is Great");//original string
        stringBuilder.append("Hahha");//add new String hahha to the string
        System.out.println(stringBuilder);//printing out the original string

        //String str="";
            //for(int i =0; i < 1000; i++){
               // str.append(i);

        //boolean flag=true;


    }
}
