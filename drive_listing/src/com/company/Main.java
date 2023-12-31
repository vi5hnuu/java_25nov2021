package com.company;

import java.io.File;

public class Main {

    public static void main(String[] args) {
	for(File d:File.listRoots()){
        System.out.println("Drive="+d);
        System.out.println("Total space="+d.getTotalSpace()/(1024*1024*1024)+"GB");
        System.out.println("free space="+d.getFreeSpace()/(1024*1024*1024)+"GB");
    }
    }
}
