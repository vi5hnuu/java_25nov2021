package com.company;

import java.util.Calendar;

class sample{
    private static int y;
    private static int m;
    private static int d;
    static {
        Calendar cal=Calendar.getInstance();
        y=cal.get(Calendar.YEAR);
        m=cal.get(Calendar.MONTH);
        d=cal.get(Calendar.DAY_OF_MONTH);
    }
    public  static void showdate(){
        System.out.println("YEAR :"+y);
        System.out.println("MONTH :"+m);
        System.out.println("DAY :"+d);
    }
}

public class Main {

    public static void main(String[] args) {
	sample.showdate();
    }
}
