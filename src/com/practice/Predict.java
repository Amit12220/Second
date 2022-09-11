package com.practice;

public class Predict {
    static int j=200;
    A a1=new A();

    public static void main(String[] args) {

        Predict obj= new Predict();

        System.out.println(obj.j);//200
        System.out.println(obj.a1); //print address of a1
        obj.a1.funA(); //cmd+click
    }
}
class A{
    int x=10;
    void funA(){
        //System.out.println("inside funA of class A");
        return ;
    }
}
