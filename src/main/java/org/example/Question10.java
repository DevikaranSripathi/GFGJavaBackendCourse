package org.example;
// Run time polymorphism or methodoverriding
class Anu{
    public void display(){
        System.out.println("\t Anu");
    }
}
class Binu extends Anu{
    public void dis1play(){
        System.out.println("\t Binu");
    }
}

public class Question10 {
    public static void main(String[] args) {
        Anu obj1 = new Anu();
        Binu obj2 = new Binu();
        Anu obj3 = new Binu();
        Anu obj4;
        obj4 = obj1;
        obj4.display();

        obj4 = obj2;
        obj4.display();

        obj4 =obj3;
        obj4.display();
    }

}
