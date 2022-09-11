package com.Day6;
import java.util.Scanner;
public class natural {
    int sum=0;
    void sum(int k)
    {
      sum=sum+(k*(k+1))/2;
        System.out.println(sum);
    }

    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number");
        int n=sc.nextInt();
        natural obj=new natural();
        obj.sum(n);
    }

}
