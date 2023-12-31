package com.company;

class Ex{
    private  int i;
    private  float f;

    public void setdata(int x,float y){
        i=x;
        f=y;
    }

    public void display(){
        System.out.println(i+" "+f);
    }
}


public class Main {

    public static void main(String[] args) {
	Ex e=new Ex();
	e.setdata(1,2.5f);
	e.display();
	fun(e);
	e.display();
    }
    static void fun(Ex m){
        m.setdata(3,8.5f);
    }
}
