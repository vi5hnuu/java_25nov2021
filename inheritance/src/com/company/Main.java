package com.company;

public class Main {
    static class index{
        protected int count;
        public index(){
            System.out.println("index class constructor");
            count=0;
        }
        public  void display(){
            System.out.println("count="+count);
        }
        public void increment(){
            count+=1;
        }
    };

     static class index1 extends index{
        public void decrement(){
            count-=1;
        }
    };

    public static void main(String[] args) {
	index1 i;
	i=new index1();
	i.increment();;
	i.display();;
	i.decrement();;
	i.display();
    }
}
