public class Majorityele {
    public static void main(String[] args) {
        int[] arr = {5,2,5,3,5,6,5,7,5,8,5,9,5,10,5};
        for (int candidate = 0; candidate < arr.length; candidate++) {
            int count =0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[candidate] == arr[i]) {
                    count++;
                }
            }
            if (count>(arr.length/2)) {
                System.out.println("Majority Element is : "+arr[candidate]);
                return;
            }
        }
    }
}
