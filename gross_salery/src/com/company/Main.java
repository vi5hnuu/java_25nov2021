package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
	// write your code here

       /* float bs,gs,da,hra;
        Scanner scn=new Scanner(System.in);
        bs=scn.nextFloat();
        if(bs<1500){
            hra=bs*10/100;
            da=bs*90/100;
        }
        else {
            hra=1200;
            da=bs*98/100;
        }
        gs=bs+hra+da;
        System.out.println("gross salery "+gs);*/
        /*System.out.println("printing 1 to 10");
        for(int i=1;i<=10;i++)
            System.out.print(i);
        System.out.print("printing 1 to 10 :");
        for(int i=1;i<=10;System.out.print(i++));
        System.out.println();
        System.out.print("Enter the starting value:");
        Scanner scn=new Scanner(System.in);
        for(int i=scn.nextInt();i<=10;System.out.print(i++));*/
       /* int i=50,j=50;
        first : while(i++<=100){
            while(j++<=200){
                if(j==150)
                break first;
                else
                    System.out.println(i+" "+j);
            }


        }*/
        /*char ch;
        ch=(char) System.in.read();
        System.out.println(ch);*/

        /*message();
        System.out.println("hey there!");*/

     /* int z=  rev(5,6);
        System.out.println(z);*/

        /*double d1=5.5,d2=5.5,d3=5.6,d4=5.7;
        double d=printtt(d1,d2,d3,d4);
        System.out.println(d);*/

        double d1=5.5,d2=5.5,d3=5.6,d4=5.7;
        int a=5;
        double d=printy(a,d1,d2,d3,d4);
        System.out.println(d);
    }
    /*static double printtt(double...num){
        double sum=0;
        for(double x:num)
        {System.out.println(x);
        sum=sum+x;
        }
        double avg;
        avg=sum/num.length;
        return avg;
    }*/
    static double printy(int x,double...num){
        double sum=0;
        for(double z:num)
        {System.out.println(x);
            sum=sum+x;
        }
        double avg;
        avg=sum/num.length;
        System.out.println("x="+x);
        return avg;

    }
    /*static void message(){
        System.out.println("happy tuesday");*/
    /*static int rev(int a,int b){
        return (a);*/


}
