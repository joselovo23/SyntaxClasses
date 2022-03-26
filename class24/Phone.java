package com.syntax.class24;
//Abstraction,
public abstract class Phone {
    void makePhoneCall(){
        System.out.println("Making a phone call");
        }
    void sendText(){
        System.out.println("Sending a text");
    }
abstract void displayPicture();
    abstract void unlockPhone();
}
class  Iphone extends Phone{
    void displayPicture(){
        System.out.println("Use photo app to display the pics");
    }
    void unlockPhone(){
        System.out.println("Use the faceID unlock to open this phone");
    }
}
class Samsung extends Phone{
    @Override
    void displayPicture() {
        System.out.println("Use gallery app to display pics");
    }
    void unlockPhone(){
        System.out.println("Can use face unlock and display finger to unlock the phone");
    }
}
