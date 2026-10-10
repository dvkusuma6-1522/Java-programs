//16. Reverse Prefix of Word — Given a word and a character ch, reverse the part of the word from its beginning through the first occurrence of ch. If ch does not occur, leave the word unchanged
import java.util.*;
public class rprefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        char ch = sc.next().charAt(0);
        int index = word.indexOf(ch);
        if (index != -1) {
            String prefix = word.substring(0, index + 1);
            String suffix = word.substring(index + 1);
            String reverse = new StringBuilder(prefix).reverse().toString();
            word = reverse + suffix;
        }
        System.out.println(word);
    }
}
