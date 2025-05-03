package org.example;

class parent{
    int a;
    void display(){
        System.out.println(a);
    }
}
class child extends parent{
    int b;
    void display(){
        System.out.println(b);
        System.out.println(a);
    }
}
public class Question4 {
    public static void main(String[] args) {
        parent obj = new parent();
        obj.a=34;
        obj.display();

        child obj1 = new child();
        obj1.b=9;
        obj1.display();
    }
}
