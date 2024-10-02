public class Cyclerotatebyone {
    public static void main(String[] args) {
        int[] arr = {2,34,21,6,7,8,90,67,23,39};
        int lastEle = arr[arr.length - 1];

        for (int i = arr.length-1; i >0 ; i--) {
            arr[i]=arr[i-1];
        }
        arr[0]=lastEle;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" , ");
        }
    }
}
