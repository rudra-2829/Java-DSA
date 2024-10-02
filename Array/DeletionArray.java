public class DeletionArray {
    public static void main(String[] args) {
        int[] arr = {2,34,21,6,7,8,90,67,23,39};
        int[] arr2 = new int [9];
        int y =6;

        for (int i = 0; i < 9; i++) {
            if (i < y) {
                arr2[i]=arr[i];
            }
            else{
                arr2[i]=arr[i+1];
            }
        }
        for (int i = 0; i < 9; i++) {
            System.out.print(arr2[i]+" , ");
        }
    }
}