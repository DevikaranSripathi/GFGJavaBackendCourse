package Strings_9;

public class StringBuilder1 {
    public static void main(String[]args){
        StringBuilder stringBuilder = new StringBuilder("Sripathi devikaran");
        stringBuilder.reverse();
        System.out.println(stringBuilder);
        stringBuilder.append("efg");
        System.out.println(stringBuilder);
        stringBuilder.setCharAt(1, 'h');
        System.out.println(stringBuilder);
        stringBuilder.delete(0,2);
        System.out.println(stringBuilder);
        stringBuilder.insert(1, "efg");
        System.out.println(stringBuilder);
    }
}
