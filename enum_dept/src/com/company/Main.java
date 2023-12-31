package com.company;

public class Main {
        enum department{assembly,manufacturing,accounts,stores};

        static class employee{
            private String name;
            private int age;
            private float salary;
            private department dept;

            public employee(String n,int a,float s,department d){
                name=n;
                age=a;
                salary=s;
                dept=d;
            }
            public void displaydata(){
                System.out.println(name+" "+age+" "+salary+" "+dept);
                if(dept==department.accounts)
                    System.out.println(name+" is an accountant");
                else
                    System.out.println(name+" is not an accountant");
            }
        }
    public static void main(String[] args) {
	employee e=new employee("sandeep shah",28,55575.50f,department.manufacturing);
	e.displaydata();
    }
}
