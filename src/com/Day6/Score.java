package com.Day6;

import java.util.Scanner;

public class Score {
    public static void main(String []args)
    {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First Number");
       int n=sc.nextInt();
        System.out.println("Enter Second  Number");
        int m=sc.nextInt();
        System.out.println("Enter Third Number");
        int q=sc.nextInt();
        System.out.println("Enter Fourth Number");
        int w=sc.nextInt();
        System.out.println("Enter Fifth Number");
        int r=sc.nextInt();
        Score obj=new Score();
        obj.sum(n,m,q,w,r);

    }
    void sum(int a,int b,int c,int d,int e)
    {
        int sum=0;
        sum+=a+b+c+d+e;
        System.out.println(sum);
    }
}
