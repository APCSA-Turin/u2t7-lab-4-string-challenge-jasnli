package com.example.project;

public class Main {
    public static void main(String[] args) {


        
    String s1 = "Hello";



    if (s1.substring(1,2).equals("b")) {
        if (!s1.substring(0,1).equals("a")) {
            System.out.println(s1.substring(1));
        }
    }
    if (s1.substring(0,1).equals("a")) {
        if (s1.substring(1,2).equals("b")) {
            System.out.println(s1);
        }
        System.out.println(s1.substring(0) + s1.substring(2));
    }
    System.out.println(s1.substring(2));    


    }
}



