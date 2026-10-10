//13.  Longest Common Prefix — Given an array of strings, find the longest prefix that is common to all strings. If no common prefix exists, return an empty string. 
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] words = new String[n];
        for (int i = 0; i < n; i++) {
            words[i] = sc.nextLine();
        }
        String prefix = words[0];
        for (int i = 1; i < n; i++) {
            while (!words[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.length() == 0) {
                    break;
                }
            }
        }
        System.out.println(prefix);
    }
}
