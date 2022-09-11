package com.Day6;
import java.util.Scanner;
public class _Binary {
    public static void main(String arg[])
    {
        arr obj=new arr();
        obj.getData();
        obj.search();
    }

}

class arr{

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
    void search()
    {
       int flag=0,position=-1,i=0,j=9,mid;
        while(i<=j&&flag==0)
        {
           mid=(i+j)/2;
            if(mid==key)
            {
                flag=1;
                position=mid+1;
            }
            if(mid>key)
            {
                j=mid-1;
            }
            if(mid<key)
            {
                i=mid+1;
            }
        }
        if(position==-1)
        {
            System.out.println("Number Not found");
        }
        else
        System.out.println(position);
    }


}
