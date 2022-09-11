package com.Day6;
import java.util.Scanner;
public class Factorial {

    void pf(int k)
    {
        if(k<2||k>100)
        {
            System.out.println("Invalid number");
        }
        else {
            for(int i=1;i<=k;i++)
            {
                if(k%i==0)
                {
                    System.out.println(i);
                }
            }
        }
    }

    public static void main(String []args)
    {
      Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number");
        int n=sc.nextInt();
        Factorial obj=new Factorial();
        obj.pf(n);
    }
}
