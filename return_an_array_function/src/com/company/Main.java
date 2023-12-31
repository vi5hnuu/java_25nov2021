package com.company;

public class Main {

    public static void main(String[] args) {
	int a[];
	a=func();
	for(int i=0;i<a.length;i++)
        System.out.println(a[i]);
    }
    static int[] func(){
        int[] a={10,20,30,40,50};
        return a;
    }
}
