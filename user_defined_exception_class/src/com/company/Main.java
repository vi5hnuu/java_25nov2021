package com.company;

import java.util.Scanner;

public class Main {
static class customer{
    private String name;
    private int accno;
    private int balance;
    public customer(String name,int a,int b){
        this.name=name;
        accno=a;
        balance=b;
    }
    public void withdraw(int amt) throws BankException{
        if(balance-amt<=500){
            throw new BankException(accno,balance);
        }
        balance-=amt;
        System.out.println("Transaction successful");
    }
}

static class BankException extends Exception{
    private int acc;
    private int bal;
    public BankException(int a,int b){
        acc=a;
        bal=b;
    }
    public void inform(){
        System.out.println("Acc no. "+acc);
        System.out.println("Acc balance "+bal);
    }
}
    public static void main(String[] args) {
	while (true){
    try{
	    customer c=new customer("rahul",2453,900);
        System.out.print("Enter the amount to withdraw:");
        Scanner scn=new Scanner(System.in);
        int d=scn.nextInt();
	    c.withdraw(d);
	    break;
    }
	catch (BankException ex){
        System.out.println("Transaction failed");
        ex.inform();
    }}
    }
}
