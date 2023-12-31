package com.company;

import java.util.Scanner;

class Number{
    private int i;
    public  void setdata(int j){
        i=j;
    }

    public void getdata(){
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter an integer");
        i=scn.nextInt();
    }

    public Number(){
        System.out.println("zero-arg constructor is called.");
    }
    public Number(int j){
        System.out.println("1-arg constructor is called.");
        i=j;
    }
    protected void finalize() throws Throwable{
        System.out.println("destructor called"); // not displayed.
        super.finalize();
    }
    public void displaydata(){
        System.out.println("value of i ="+i);
    }

}

public class Main {

    public static void main(String[] args) {
	Number n1,n2,n3;
	n1=new Number();
	n1.displaydata();
	n1.setdata(200);
	n1.displaydata();

	n2=new Number();
	n2.displaydata();
	n2.getdata();
	n2.displaydata();

	n3=new Number(100);
	n3.displaydata();
    }
}
