package com.company;

public class Main {

    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6};
        modify(a);
        for(int i=0;i<a.length;i++)
            System.out.format("%5d",a[i]);

    }
    static void modify(int[] m){
        for(int i=0;i<m.length;i++)
            m[i]=m[i]*2;
    }
}
