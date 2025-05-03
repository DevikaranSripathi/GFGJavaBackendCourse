package org.example;
//Runtime polymorphism
class Anus{
    int i;
    public void display(){
        System.out.println(i);
    }
}
class Binus extends Anus{
    int j;
    public void display() {
        System.out.println(j);
    }
}

public class Question11 {
    public static void main(String[] args) {
        Binus obj2 = new Binus();
        obj2.i=1;
        obj2.j=2;
        Anus ref;
        ref =obj2;
        ref.display();
    }
}
