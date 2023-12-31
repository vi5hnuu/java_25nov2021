package com.company;

import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
	File f=new File(".");
	String d=f.getCanonicalPath();
	String m=f.getAbsolutePath();
        System.out.println("canonical path : "+m);
        System.out.println("absolute path :"+d);
        String[] parts=d.split("\\\\");
        String[] partss=m.split("\\\\");
        System.out.println("Dir name :"+parts[parts.length-1]);
        System.out.println("Dir name :"+partss[parts.length-1]);

    }
}
