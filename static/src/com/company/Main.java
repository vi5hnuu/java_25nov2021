package com.company;

class Ex{
    private int i;
    private static int count=0;

    public Ex(int val){
        i=val;
        count+=1;
    }

    public static void showcount(){
        System.out.println("count of objects is "+count);
    }
}

public class Main {

    public static void main(String[] args) {
    	Ex e1=new Ex(10);
	    Ex.showcount();
	    Ex e2=new Ex(15);
        Ex.showcount();
        Ex e3=new Ex(20);
        Ex.showcount();
    }
}
