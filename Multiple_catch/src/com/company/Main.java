package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
	int i,j;
	try{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter i:");
        i=Integer.parseInt(br.readLine());
        System.out.print("Enter j:");
        j=Integer.parseInt(br.readLine());

        System.out.println("you entered:"+i+" "+j);
        System.out.println("Result:"+i/j);
    }
	catch (IOException e){
        System.out.println("Error in input");
    }
	catch (NumberFormatException ne){
        System.out.println("Incorrect input");
    }
	catch (ArithmeticException ae){
        System.out.println("Arithmatic Exception div by 0");
    }
	catch (Exception e){
        System.out.println("Unknown error:"+e);
    }
    }
}
