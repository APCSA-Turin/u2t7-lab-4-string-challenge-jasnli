package com.example.project;

public class Main {
    public static void main(String[] args) {

            String s1 = "aapple";
            //implement code here
            if (s1.substring(1,2).equals("b")) {
                System.out.println("check 1");
                if (!s1.substring(0,1).equals("a")) {
                    System.out.println(s1.substring(1));
                    System.out.println("check 2");
                }
            }
            if (s1.substring(0,1).equals("a")) {
                System.out.println("check 3");
                if (s1.substring(1,2).equals("b")) {
                    System.out.println(s1);
                    System.out.println("check 4");
                }
                System.out.println("check 5");
                System.out.println(s1.substring(0, 1) + s1.substring(2));
            }
            System.out.println("check 6");
            System.out.println(s1.substring(2)) ;
    
    }
}
    

