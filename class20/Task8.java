package com.syntax.class20;

public class Task8 {
    /*
    Write program to inherit class AA that has method print F
    which is static and call or reuse that method into class BB
     */

    public static void main(String[] args) {
        BB.printF();
    }
}

class AA{
    static void printF(){
        System.out.println("Batch 12 will be making memes on jobs");
    }
}
class BB extends AA{

}
