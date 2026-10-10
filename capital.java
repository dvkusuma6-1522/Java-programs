//15.   Detect Capital — Determine whether capitalization in a word is used correctly. A word is valid when all letters are uppercase, all letters are lowercase, or only its first letter is uppercase. 
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        int upper = 0;
        for (int i = 0; i < word.length(); i++) {
            if (Character.isUpperCase(word.charAt(i))) {
                upper++;
            }
        }
        boolean result = upper == 0 || upper == word.length() ||
                         (upper == 1 && Character.isUpperCase(word.charAt(0)));
        System.out.println(result);
    }
}
