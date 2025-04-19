package InputOutput_3;

public class JavaOutputs {
    public static void main(String[] args) {
        int x = 10, y = 20;
        char z = 'G';
        String str = "GFG";

        System.out.println(x);
        System.out.println(x + y);
        System.out.println(x + " " + y);
        System.out.print(str + " ");
        System.out.print("Courses");

        System.out.println("----------------------------");

        int a = 100, b = 200;
        System.out.format("Value of a is %d\n", a);

        float f = (float) Math.PI;
        System.out.println(f);

        System.out.format("Value of PI = %f\n", f);
        System.out.format("Value of PI = %.2f\n", f);
        System.out.format("Value of PI = %5.2f\n", f);
        System.out.format("Value of PI = %05.2f\n", f);
        System.out.printf("x= %d, y = %d", x, y);
    }
}
