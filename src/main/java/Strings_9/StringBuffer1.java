package Strings_9;

public class StringBuffer1 {
    public static void main(String[]args){
        StringBuffer stringBuffer = new StringBuffer("devikaran");
        stringBuffer.reverse();
        System.out.println(stringBuffer);
        stringBuffer.append("efg");
        System.out.println(stringBuffer);
        stringBuffer.setCharAt(1, 'h');
        System.out.println(stringBuffer);
        stringBuffer.delete(0,2);
        System.out.println(stringBuffer);
        stringBuffer.insert(1, "efg");
        System.out.println(stringBuffer);
        stringBuffer.length();
        System.out.println(stringBuffer);
    }
}
