package com.Day6;
import java.util.Scanner;
public class Switch {

//    void Palace(String s)
//    {
//        switch(s)
//        {
//            case "Mumbai" :
//                System.out.println("Financial city");
//                break;
//            case "Kolkata" :
//                System.out.println("City of Joy");
//                break;
//            case "Delhi" :
//                System.out.println("Capital of the country");
//                break;
//            case "Bangalore" :
//                System.out.println("Cyber City");
//                break;
//           default :
//                System.out.println("May be Other Indian City");
//                break;
//        }
//    }
//    public static void main(String []args)
//    {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter City");
//        String s=sc.nextLine();
//        Switch obj=new Switch();
//        obj.Palace(s);
//    }

    public static void main(String[] args) {
        //break will take you out the current code block of a loop or a switch-case
        for (int i = 0; i < 50; i++) {
            System.out.println("break demo");
            if(i==2)
                break;

        }
        for (int outer = 0; outer < 5; outer++) {
            System.out.println("outer "+outer);
            for (int inner = 0; inner <2 ; inner++) {

                if (inner==1)
                    break;

                System.out.println("inner "+inner);
            }
        }

        while(true){
            System.out.println("this is reachable");
            System.out.println("bye");
            break;
            //unreachable
            //System.out.println("this is not");
        }
        System.out.println("out of while loop");
    }
}
