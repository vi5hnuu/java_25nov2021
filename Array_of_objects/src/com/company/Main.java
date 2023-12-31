package com.company;
class sample{
    private int i;
    private  float a;
    public sample(int i,float f){
        System.out.println("zero arg constructor.");
        this.i=i;
        a=f;
    }
    public  void display() {
        System.out.println("i="+i+" a="+a);
    }
}
public class Main {

    public static void main(String[] args) {
	/*sample[] arr= new sample[3];// no constructor are called
        arr[0]=new sample(10,3.14f);// ctor called
        arr[1]=new sample(20,6.28f);// ctor called
        arr[2]=new sample(30,3.55f);// ctor called
        for(sample x:arr)
            x.display();*/
        sample[] arr={// no constructor are called
        new sample(10,3.14f),
        new sample(20,6.28f),
        new sample(30,3.55f)};
        for(sample x:arr)
            x.display();

    }
}
