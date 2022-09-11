package com.practice;

public class oop1 {
    int nonStaticInt=90;
    static int staticInt=100;
    public static void main(String[] args) {
        System.out.println(staticInt);
        //System.out.println(nonStaticInt); //error

        //how to load nonStaticInt into the memory?
        //create an object
        oop1 object=new oop1();
        System.out.println(object.nonStaticInt);
        //1. there are separate static and non-static areas.



    }


}