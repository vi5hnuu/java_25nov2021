package com.company;

public class Main {
    static class base1{
    final public void a(){
        System.out.println("hey there!");
    }
    }

    static class c extends base1{
        public  void a(){
            System.out.println("hey there!!");
        }
        public  void fun(){
            System.out.println("hey !");
        }
    }
    public static void main(String[] args) {
        c z=new c();
        c.a();
    }
}
