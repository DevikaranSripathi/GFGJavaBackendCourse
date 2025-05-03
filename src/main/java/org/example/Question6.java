package org.example;
class A{
    public int i;
    protected int j;
//    in the place of protected it has private so it wont acess by child class beacuse it is declared as private
}
class B extends A{
    void display(){
        super.j=super.i+1;
        System.out.println(super.i+" "+super.j);
    }
}
public class Question6 {
    public static void main(String[] args) {
        B obj = new B();
        obj.i=1;
        obj.j=2;
        obj.display();
    }
}
