package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws NumberFormatException {
	int num;
	while(true){
	try{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number");
        num=Integer.parseInt(br.readLine());
        System.out.println(num);
        break;
    }
	catch (IOException e){
        System.out.println("Error in input");
    }
	catch (NumberFormatException e){
        System.out.println("Incorrect input");
    }}
    }
}
