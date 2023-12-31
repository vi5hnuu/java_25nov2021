package com.company;

public class Main {
interface mouse{
    void lbtndown(int x,int y);
    void rbtndown(int x,int y);
}

class geniusmouse implements mouse{
    @Override public void lbtndown(int x,int y){
        System.out.println("Left button:"+x" "+y);
    }
    @Override public void rbtndown(int x,int y){
        System.out.println("right button:"+x" "+y);
    }
}
    public static void main(String[] args) {
	geniusmouse m=new geniusmouse();
	m.lbtndown(10,20);
	m.rbtndown(10,20);
    }
}
