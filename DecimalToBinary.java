
public class DecimalToBinary {
    public static void main(String[] args) {
        int num = 25;
        int original = num;
        String binary = "";

        if (num == 0) {
            binary = "0";
        } else {
            while (num > 0) {
                int remainder = num % 2;
                binary = remainder + binary;
                num = num / 2;
            }
        }

        System.out.println("Binary: " + binary);
    }
}
