
public class DuplicateElements {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 20, 40, 10, 50};

        System.out.println("Duplicate elements:");

        for (int i = 0; i < arr.length; i++) {
            boolean alreadyChecked = false;

            for (int k = 0; k < i; k++) {
                if (arr[k] == arr[i]) {
                    alreadyChecked = true;
                    break;
                }
            }

            if (alreadyChecked) {
                continue;
            }

            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == arr[i]) {
                    count++;
                }
            }

            if (count > 1) {
                System.out.println(arr[i]);
            }
        }
    }
}
