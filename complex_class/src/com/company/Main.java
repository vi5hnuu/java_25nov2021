package com.company;

import java.util.Scanner;

class complex{
    private  float real,imag;

    public complex(){
    }
    public complex(float a, float b){
        real=a;
        imag=b;
    }
    public void getdata(){
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the real and imag part");
        real=scn.nextFloat();
        imag=scn.nextFloat();
    }
    public void setdata(float r, float i){
        real=r;
        imag=i;
    }

    public void display(){
        System.out.println("real part is "+real);
        System.out.println("imaginary part is "+imag);
    }

    public complex addcomplex(complex y){
        complex t;
        t=new complex();
        t.real=real+y.real;
        t.imag=imag+y.imag;
        return t;
    }
    public complex mulcomplex(complex y){
        complex t;
        t=new complex();
        t.real=real*y.real-imag*y.imag;
        t.imag=imag*y.imag+y.real*imag;
        return t;
    }

}

public class Main {

    public static void main(String[] args) {
	complex c1,c2,c3;
	c1=new complex();
	c1.setdata(2.0f,2.0f);

	c2=new complex();
	c3=new complex();

	c3=c1.addcomplex(c2);
        System.out.println("complex c3:");
        c3.display();

        complex c4,c5,c6;
        c4=new complex();
        c4.getdata();
        c5=new complex(2.05f,3.0f);
        c6=new complex();
        c6=c4.mulcomplex(c5);
        System.out.println("complex c6:");
        c6.display();

        complex c7;
        c7=new complex();
        c7=c1.addcomplex(c2.mulcomplex(c3));
        System.out.println("complex c7:");
        c7.display();
    }
}
