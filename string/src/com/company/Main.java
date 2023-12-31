package com.company;

public class Main {

    public static void main(String[] args) {
	String s1="vishnu";
	String s2="vishnu";
	if(s1==s2)
        System.out.println("Equal");
	else
        System.out.println("Unequal");

	String s3=new String("vishnu");
	String s4=new String("vishnu");
	if(s3==s4)
        System.out.println("Equal");
	else
        System.out.println("Unequal");

	if(s3.equals(s4))
        System.out.println("same content");
	else
        System.out.println("Different content");
    }
}
