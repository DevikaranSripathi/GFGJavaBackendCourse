package org.example;
interface Calculates{
    void cal(int num);

}
class DisplaysA implements Calculates{
    int x;
    void multiply(int num){
        x=num*num;
    }

    @Override
    public void cal(int num) {

    }
}
class DisplaysB implements Calculates{
    int x;
    public void cal(int num) {
        x=num/num;
    }
}
public class Question13 {
    public static void main(String[] args) {
        DisplaysA obj1 = new DisplaysA();
        DisplaysB obj2 = new DisplaysB();
        obj1.x=0;
        obj1.multiply(2);
        obj2.x=0;
        obj2.cal(2);
        System.out.println(obj1.x+" "+obj2.x);
    }
}
