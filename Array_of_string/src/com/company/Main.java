package com.company;

public class Main {

    public static void main(String[] args) {
	String[] names={"vishnu","krishan","pooj","prakash"};
	for(int i=0;i<names.length;i++)
        System.out.println(names[i]);

        for(String x:names)
            System.out.println(x);

        String[] y=new String[]{ "vishnu","krishan","laxmi","manisha","prakash"};
        for(int i=0;i<y.length;i++)
            System.out.println(y[i]);

        for(String x:y)
            System.out.println(x);



    }
}
