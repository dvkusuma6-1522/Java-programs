//14. Valid Palindrome — Given a string, determine whether it is a palindrome after considering only alphanumeric characters and ignoring case.
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                str.append(Character.toLowerCase(c));
            }
        }
        String original = str.toString();
        String reverse = str.reverse().toString();
        System.out.println(original.equals(reverse));
    }
}
