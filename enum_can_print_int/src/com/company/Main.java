package com.company;

public class Main {
enum cartype{suv,hatchback,sedan,convertible}//no semi colan

    public static void main(String[] args) {
	cartype car1=cartype.sedan;
        System.out.println("value of car1 is "+car1);
        System.out.println("value of car1 is "+car1.ordinal());

        System.out.println("car names and their values");
        for (cartype c: cartype.values())
            System.out.println(c+" = "+c.ordinal());

    }
}
