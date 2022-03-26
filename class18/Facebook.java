package com.syntax.class18;

public class Facebook {

    private String userName;
    private String password;
    private int age;
    void setAge(int personAge){
        if(personAge>14&& personAge<120){
            age=personAge;
        }else{
            System.out.println("Not allowed its not a horse");
        }
    }

    int getAge(String userPassword){
        //protecting the age with a password
        if(userPassword.equals(password)){
            return age;
        }else{
            return -1;
        }
    }

}
