public class Findmax {
    public static void main(String[] args) {
        int[] arr = {2,34,21,6,7,8,90,67,23,39};
        int big = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i]>big) {
                big = arr[i];             
            }
        }
        System.err.println("Maximum element in array is : "+big);
    }
}
