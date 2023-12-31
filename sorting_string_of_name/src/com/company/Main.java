package com.company;

public class Main {

    public static void main(String[] args) {
        String[] names = new String[]{"akshay", "parag", "raman", "srinivas", "gopal", "rajesh"};
        int result;
        String temp;
        for (int i = 0; i < names.length; i++)
            for (int j = i + 1; j < names.length; j++) {
            result=names[i].compareTo(names[j]);
            if(result>0)
            {
                temp=names[i];
                names[i]=names[j];
                names[j]=temp;
            }
            }
        for(String x:names)
            System.out.println(x);
    }
}
