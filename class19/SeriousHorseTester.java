package com.syntax.class19;

public class SeriousHorseTester {
    public static void main(String[] args) {
        Horse horse=new Horse("jacky",20,400);

        /*
        Horse-> Data Type (names of classes)
        horse-> Object/Instance/reference variable/ variable
        = -> assignment operator
        Horse("jacky",20,400)-->call to a constructor
        ; line terminator
         */
        horse.printHorseName();
    }
}
