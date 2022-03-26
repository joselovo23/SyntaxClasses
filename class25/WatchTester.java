package com.syntax.class25;
//can you have static and non static methods inside an abstract class? INTERVIEW QUESTION
public class WatchTester {
    public static void main(String[] args) {
        AppleWatch appleWatch = new AppleWatch(2, 16, 1.5, "Apple");
        appleWatch.showHealthTips();
        AppleWatch.displayTime();
    }
}
