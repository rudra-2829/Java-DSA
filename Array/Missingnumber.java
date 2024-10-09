public class Missingnumber {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,10,11,12,13,14,15};
        int n = arr.length;
        int sumB = 0;
        for (int i = 0; i < arr.length; i++) {
            sumB+=arr[i];
        }
        int sumA = ((n+1)*(n+2))/2;

        int missingNum = sumA-sumB;

        if (missingNum==(arr.length+1)) {
            System.out.println("No missing number found.");
            return;
        }
        System.out.println("Missing number in the Array is : "+missingNum);
    }
}
