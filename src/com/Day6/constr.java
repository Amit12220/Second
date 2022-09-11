package com.Day6;

public class constr {
    String name;
    int rollno;

    constr(String n,int r)
    {
      this.name=n;
      this.rollno=r;

    }
    public static void main(String []args)
    {
        constr s1=new constr("Amit",101);
        constr s2=new constr("Sumit",102);
        System.out.println(s1.name+"  "+s1.rollno);
        System.out.println(s2.name+"  "+s2.rollno);
    }

}
