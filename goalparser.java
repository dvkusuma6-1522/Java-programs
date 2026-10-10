//18.   Goal Parser Interpretation — Interpret a command string according to the specified G, (), and (al) patterns and return the resulting interpreted string. 
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String command = sc.nextLine();

        String result = command.replace("()", "o").replace("(al)", "al");
        System.out.println(result);
    }
}
