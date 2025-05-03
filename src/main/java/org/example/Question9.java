package org.example;
// using final keyword we cannot extends parent properites to child
//final class AXT{
class AXT{
    int i;
}
class BV extends
        AXT{
    int j;
    void display(){
    System.out.println(j+" "+i);
}
}
public class Question9 {
    public static void main(String[] args) {
        BV obj =new BV();
        obj.display();
    }
}
