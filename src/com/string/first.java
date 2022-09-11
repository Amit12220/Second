package com.string;
import java.util.Scanner;
public class first {
    public static void main(String []args)
    {
     String name=new String();
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter Name");
     name=sc.next();
        String add=new String();
        System.out.println("Enter Address");
        add=sc.next();
        System.out.println(name);
        System.out.println(add);
    }
}
