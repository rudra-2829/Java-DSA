import java.util.Arrays;

public class Duplicate {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 1, 4, 5, 3, 6, 2, 7, 8, 8 };
        Arrays.sort(arr);

        boolean found = false;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                System.out.println("Duplicate found : " + arr[i]);
                found = true;
            }
        }
        if (found == false) {
            System.out.println("No found any duplicate");
        }
    }
}
