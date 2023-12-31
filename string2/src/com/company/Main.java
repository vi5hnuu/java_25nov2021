package com.company;

public class Main {

    public static void main(String[] args) {
	String s2="Nagpur";
	String s1="Kicit";
        System.out.println("Char at 3rd position :"+s1.charAt(2));

        String s3;
        s3=s1.concat(s2);
        System.out.println(s3);

        System.out.println("Length of s3:"+s3.length());

        s3=s3.replace("p","P");
        System.out.println(s3);

        s3=String.copyValueOf(s2.toCharArray());
        System.out.println(s3);

        int c;
        c=s2.compareTo(s3);
        if(c<0)
            System.out.println("s2 is less than s3");
        else if(c==0)
            System.out.println("s2 is equal to s3");
        else
            System.out.println("s2 is grater than s3");

        if(s1==s3)
            System.out.println("s1 is equal to s3");
        else
            System.out.println("s1 is not equal to s3");

        s3=s1.toUpperCase();
        System.out.println(s3);

        s3=s2.concat("mumbai");
        System.out.println(s3);

        s3=s2.replace(s2.charAt(0),' ');
        System.out.println(s3);

        int fin,lin;
        fin=s1.indexOf("i");
        System.out.println("First index of i in s1 : "+fin);
        lin=s1.lastIndexOf("i");
        System.out.println("last index of i in s1 : "+lin);

        String s;
        s=s1.substring(fin,lin+1);
        System.out.println("Substring :"+s);;

        int i=10;
        float f=9.8f;
        s3=String.format("value of i=%d value of f=%f",i,f);
        System.out.println(s3);
    }
}
