package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int avg,sum=0;
	int[] marks=new int[30];
        Scanner scn=new Scanner(System.in);
        for(int i=0;i<=29;i++){
            System.out.println("Enter marks for student "+(i+1));
            marks[i]=scn.nextInt();
        }
        for(int i=0;i<=29;i++)
        {
            System.out.println("Marks of student "+i+" is "+marks[i]);
            sum=sum+marks[i];
        }
        avg=sum/marks.length;
        System.out.println("Average marks is "+avg);
    }
}
