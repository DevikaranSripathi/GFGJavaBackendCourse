package InputOutput_3;

import java.util.Scanner;

public class ScannerTest {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a String");
            String enteredString = scanner.next();
//        Reads till the end of line \n
//        String enteredString = scanner.nextLine();
            System.out.println("Entered String is " + enteredString);
            int x = scanner.nextInt();
            System.out.println("Entered Integer is " + x);
            float fl = scanner.nextFloat();
            System.out.println("Enetered Float is " + fl);


        /*----------------Output---------------------------
        Enter a String
        vertexpride 212 767.343
        Entered String is vertexpride
        Entered Integer is 212
        Enetered Float is 767.343
        ---------------------------------------------------*/

        }
}
