package org.example;
//Data hiding concept
class AB{
    public int i;
    protected int j;
}
class CD extends AB{
    int j;
    void display(){
        super.j=3;
        System.out.println(i+" "+j);
    }
}
public class Question8 {
    public static void main(String[] args) {
        CD obj =new CD();
        obj.i=1;
        obj.j=2;
        obj.display();
    }
}
