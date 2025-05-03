package org.example;
class Animal {
    public int i;
    public int j;
    Animal(){
        i=1;
        j=2;
    }
}
class Bat extends Animal{
    int a;
    Bat(){
//      i=7;
    }
}
public class Question7 {
    public static void main(String[] args) {
        Bat obj =new Bat();
        System.out.println(obj.i+" "+obj.j);
    }
}
