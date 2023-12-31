package com.company;

public class Main {
static abstract  class vehicle{
    public abstract void speed();//protected
    public abstract void maintainance();//protected
    public abstract void value();//protected //method body is necessay if not abstract
}

static class fourwheeler extends vehicle{
    public void speed(){
        System.out.println("In speed of four fourwheelers");
    }
    public void maintainance(){
        System.out.println("In mainatainance of fourwheelers");
    }
    public void value(){
        System.out.println("In value of fourwheelers");
    }
}

static class twowheeler extends vehicle{
    public void speed(){
        System.out.println("In speed of four twowheelers");
    }
    public void maintainance(){
        System.out.println("In mainatainance of twowheelers");
    }
    public void value(){
        System.out.println("In value of twowheelers");
    }
}
static class airborne extends vehicle{
    public void speed(){
        System.out.println("In speed of four airborne");
    }
    public void maintainance(){
        System.out.println("In mainatainance of airborne");
    }
    public void value(){
        System.out.println("In value of airborne");
    }
}
    public static void main(String[] args) {
vehicle maruti,bajaj,jumbo;
maruti=new fourwheeler();
bajaj=new twowheeler();
jumbo=new airborne();
maruti.speed();
maruti.maintainance();
maruti.value();
bajaj.speed();
bajaj.maintainance();
bajaj.value();
jumbo.speed();;
jumbo.maintainance();
jumbo.value();
    }
}
