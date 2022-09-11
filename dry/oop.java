package com.practice;

public class oop {

        int x=10; //inside a class: instance variable
        static int myStaticVariable=0;
        int instanceVariableWithoutAValue;
        String string="ram";  //ue will be null, same for all the user defined objects as well.
        //x is non static
        public static void main(String[] args) {

            //this area is static
            int y=5; //inside a method: local variable
           // System.out.println(y);
            // System.out.println(x);
            oop object=new oop();
        //    System.out.println(object.x);
//          System.out.println("instanceVariableWithoutAValue "+object.instanceVariableWithoutAValue);//
            System.out.println(object.string);

            int localVariableWithoutAValue; //no default value
            //intialize it
            //localVariableWithoutAValue=10;
            //System.out.println(localVariableWithoutAValue); //error
        }
    }

