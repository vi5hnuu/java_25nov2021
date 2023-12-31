package com.company;

public class Main {
static class a{
    public a(){
        System.out.println("a's zero arg constructor");
    }
    public a(int xx){
        System.out.println("a's i arg constructor");
    }
}

 static class b extends a{
    public b(){
        System.out.println("b's zero arg constructor");
    }
    public b(int xx){
        System.out.println("b's 1 arg constructor");
    }
}
    public static void main(String[] args) {
	b y=new b();
	b z=new b(10);
    }
}
