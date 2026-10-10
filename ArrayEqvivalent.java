//17.   Check If Two String Arrays are Equivalent — Given two arrays of strings, determine whether concatenating all strings in each array produces the same final string. 
import java.util.*;
public class ArrayEqvivalent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] word1 = new String[n];
        for (int i = 0; i < n; i++) {
            word1[i] = sc.next();
        }
        int m = sc.nextInt();
        String[] word2 = new String[m];

        for (int i = 0; i < m; i++) {
            word2[i] = sc.next();
        }
        StringBuilder a = new StringBuilder();
        StringBuilder b = new StringBuilder();
        for (String s : word1) {
            a.append(s);
        }
        for (String s : word2) {
            b.append(s);
        }
        System.out.println(a.toString().equals(b.toString()));
    }
}
