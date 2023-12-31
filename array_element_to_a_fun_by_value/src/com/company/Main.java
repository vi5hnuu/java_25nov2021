package com.company;

public class Main {

    public static void main(String[] args) {
	int[] a={1,2,3,4,5,6};
	for(int i=0;i<a.length;i++){
    modify(a[i]);
        System.out.print(a[i]);
	}
    }
    static void modify(int m){
        m=m*2;
    }
}
