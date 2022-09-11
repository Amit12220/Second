package com.Day6;
import java.util.Scanner;
public class select {
    public static void main(String []args)
    {
        _4arr obj1=new _4arr();
        obj1.getData();
        obj1.sort();
        obj1.print();
    }

}
class _4arr{
    int a[]=new int[10];
    void getData()
    {
        Scanner sc=new Scanner(System.in);

        for(int i=0;i<10;i++)
        {
            System.out.println("Enter Number");
            a[i]=sc.nextInt();

        }

    }

    void sort()
    {
        for(int i=0;i<9;i++)
        {
            for(int j=i+1;j<10;j++)
            {
               if(a[i]>a[j])
               {
                   int temp=a[i];
                   a[i]=a[j];
                   a[j]=temp;
               }
            }
        }
    }
    void print()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println(a[i]);
        }

    }
}
