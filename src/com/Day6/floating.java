package com.Day6;

public class floating {
    public static void main(String[] args) {
        //default data type for decimal nums is double
        //byte<int
        //float<double
        double d= 5.35;
        float r=(float) d;
        //casting: 2 ways
        //1st way
        float f= (float) 5.35;
        //2nd way: shortcut
        float g=5.35f;
        float l=(float) 5.2;
        double q=l;
        System.out.println(r);
    }
}
