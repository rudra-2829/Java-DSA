public class Secondlarge {
    public static void main(String[] args) {
        int[] arr = {2,34,21,6,7,8,90,67,23,39};
        int first = 0;
        int second=0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>first) {
                second=first;
                first = arr[i];
            }
            else if (arr[i]>second && arr[i] != first) {
                second = arr[i];
            }
        }
        System.out.println("Second largest element is : "+second);
    }
}
