package com.Day6;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class _1arr {
    int a[]=new int[10];
    int key;
    void getData()
    {
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<10;i++)
        {
            System.out.println("Enter Number");
            int x=sc.nextInt();
            a[i]=x;
        }
        System.out.println("Enter Search Number");
        key=sc.nextInt();

    }
    void Search()
    {
      int flag=0,position=-1;
        for(int i=0;i<10&&flag==0;i++)
        {
            if(a[i]==key)
            {
                flag=1;
                position=i+1;
            }
        }
        if(flag==1)
        {
            System.out.println(position);
        }
    }

}
class Demo
{
    public static void main(String []args)
    {
        _1arr obj=new _1arr();
        obj.getData();
        obj.Search();
    }
}
