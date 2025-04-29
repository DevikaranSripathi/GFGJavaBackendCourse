package functions_7;

public class CommandLineArguments {
    public static void main(String[] args) {
        if (args.length > 0) {
            System.out.println("Arguments are: ");
            for (String s : args) {
                System.out.print(s + " ");
            }
        } else {
            System.out.println("No arguments");
        }
    }
}
