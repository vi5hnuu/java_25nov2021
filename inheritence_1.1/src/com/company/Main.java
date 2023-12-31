package com.company;

public class Main {
static class Ex{
    public void fun(){
        System.out.println("INside Ex-fun()");
    }
    public void save(){
        System.out.println("INside Ex-save()");
    }
    public void enc(){
        System.out.println("INside Ex-enc()");
    }
    public void open(){
        System.out.println("INside Ex-open()");
    }
}
static class NewEx extends Ex{
    public void save(){
        System.out.println("INside newEx-save()");
    }
    public void enc(){
        System.out.println("INside newEx-enc()");
    }
    public void autoupdate(){
        System.out.println("INside newEx-autoupdate()");
    }
    public void open(){
        super.open();
        System.out.println("INside newEx-open()");
    }
}
    public static void main(String[] args) {
	NewEx e=new NewEx();
	e.fun();
	e.save();
	e.enc();
	e.autoupdate();
	e.open();
    }
}
