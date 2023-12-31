package com.company;

import java.io.File;
import java.io.FileFilter;

public class Main {

    public static void main(String[] args) {
	File d;
	d=new File(".");
	ListFiles(d,"");
    }

    static void ListFiles(File d, String indent) {
    String s;
        System.out.println(indent+d.getName()+"/");
        for(File fi:d.listFiles()){
            s=indent+" "+fi.getName();
            System.out.println(s);
        }
        FileFilter dirFilter=new FileFilter() {
        public boolean accept(File file){
            return file.isDirectory();
        }
        };
        for (File di:d.listFiles(dirFilter))
            ListFiles(di,indent+" ");
    }
}
