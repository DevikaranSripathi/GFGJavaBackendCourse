package org.example;


// Interface program
interface Calculate{
    void cal(int item);
}
class Display1 implements Calculate{
    int x;
//    cannout use default for this next line use public to get no error
 public  void cal(int item){
        x=item*item;
    }
}
public class Question12 {
    public static void main(String[] args) {
        Display1 arr1 = new Display1();
        arr1.x=0;
        arr1.cal(2);
        System.out.print(arr1.x);
    }

}
