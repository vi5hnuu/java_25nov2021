package com.company;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
	String str;
	try{
        BufferedReader abc=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter file name");//P:\c fiels\width_int.c
        str=abc.readLine();
        File c;
        c= new File(str);
        if(c.exists()){
            String dname=c.getParent();
            System.out.println("Directory name: "+dname);
            String fname=c.getName();
            System.out.println("File name :"+fname);
            String abspath=c.getAbsolutePath();
            System.out.println("Full path:"+abspath);

            long size=c.length();
            System.out.println("Size:"+size);
            String ext;
            int dot=str.lastIndexOf(".");
            ext=str.substring(dot);
            System.out.println("extension="+ext);
            System.out.println("Last modified="+new Date(c.lastModified()));

            String d=c.getName();
            boolean m=c.canExecute();
            boolean k=c.canWrite();
            int s=c.compareTo(new File("P:\\c fiels\\perfect_sq.c"));
            boolean e=c.isDirectory();
            boolean z=c.isFile();
            System.out.println(d+" "+m+" "+k+" "+s+" "+e+" "+z);

        }
	}
	catch (IOException e){
        System.out.println("Error in input");
    }

    }
}
