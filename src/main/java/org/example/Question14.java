package org.example;
//Abstract concept
 abstract class Parents{
//   error throwed because abstract was not defined
  abstract void printInfo();
}
class Childs extends Parent{
     void printInfo(){
         System.out.println("Iam a child");
     }
}
public class Question14 {
    public static void main(String[] args) {
//         we cannot create an obj of abstarct class
//        parents p = new Childs();

//        c.printInfo();

    }
}
//__________________________________________________________________________________________________________
//interface using same
//interface Parents{
//void printInfo();
// }
// class Childs implemets Parents{
////     error because interface support onlu public
//    void printInfo(){
//        System.out.println("child");
//    }
// }
