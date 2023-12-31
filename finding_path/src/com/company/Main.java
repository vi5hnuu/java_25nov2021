package com.company;

import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
	File a=new File(".");
	String m=a.getCanonicalPath();
        System.out.println(m);
    }
}
