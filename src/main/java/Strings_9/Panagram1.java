package Strings_9;

import java.util.Scanner;

public class Panagram1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(isPanagram(s));
    }

    static boolean isPanagram(String s) {
        int n = s.length();
        if (n < 26) {
            return false;
        }

        boolean[] visited = new boolean[26];

        for (int i = 0; i < n; i++) {
            char x = s.charAt(i);
            if (x >= 'a' && x <= 'z')
                visited[x - 'a'] = true;

            if (x >= 'A' && x <= 'Z')
                visited[x - 'A'] = true;
        }

        for (int i = 0; i < 26; i++) {
            if (visited[i] == false) {
                return false;
            }
        }
        return true;
    }
}
