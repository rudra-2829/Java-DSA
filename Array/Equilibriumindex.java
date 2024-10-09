public class Equilibriumindex {
    public static void main(String[] args) {
        int[] arr = {1,3,5,4,2,5,6,2};
        int totalSum = 0;
        int leftSum = 0;
        for (int num : arr) {
            totalSum += num;
        }
        for (int i = 0; i < arr.length; i++) {
            int rightSum = totalSum-leftSum-arr[i];

            if (leftSum==rightSum) {
                System.out.println("Equilibrium index is : " +i);
            }
            leftSum += arr[i];
        }
    }
}
