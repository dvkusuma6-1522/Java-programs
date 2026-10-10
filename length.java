//12. Length of Last Word — Given a string containing words separated by spaces, return the length of the last word.
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();
        int count = 0;
        for (int i = s.length() - 1; i >= 0 && s.charAt(i) != ' '; i--) {
            count++;
        }
        System.out.println(count);
    }
}
