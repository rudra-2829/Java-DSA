public class FindMin {
    public static void main(String[] args) {
        int[] arr = { 12, 34, 21, 6, 7, 8,2, 90, 67, 23, 39, 1};
        int small = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < small) {
                small = arr[i];
            }
        }
        System.out.println("Smallest element in Array is " + small);
    }
}
