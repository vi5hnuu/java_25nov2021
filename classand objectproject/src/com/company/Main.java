package com.company;

import java.util.Scanner;

class Rectangle{
    private int len,brd;
    public void getdata(){
        Scanner scn;
        scn=new Scanner(System.in);
        System.out.println("Enter length and breadth");
        len=scn.nextInt();
        brd=scn.nextInt();
    }

    public void setdata(int l,int b){
        len=l;
        brd=b;
    }

    public  void displaydata(){
        System.out.println("lenght="+len);
        System.out.println("breadth="+brd);
    }

    public  void areaperi(){
        int a,p;
        a=len*brd;
        p=2*(len+brd);
        System.out.println("area="+a);
        System.out.println("perimeter="+p);
    }

}

public class Main {

    public static void main(String[] args) {
	Rectangle r1,r2,r3;
	r1=new Rectangle();
	r2=new Rectangle();
	r3=new Rectangle();
        r1.setdata(10,20);
        r1.displaydata();
        r1.areaperi();

        r2.setdata(5,8);
        r2.displaydata();
        r2.areaperi();

        r3.getdata();
        r3.displaydata();
        r1.areaperi();

    }
}
