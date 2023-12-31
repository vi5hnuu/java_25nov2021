package com.company;

 public class Main {
final static class base1{

}

static class c extends base1{
    public  void fun(){
        System.out.println("hey !");
    }
}
    public static void main(String[] args) {
	c z=new c();
	c.fun();
    }
}
