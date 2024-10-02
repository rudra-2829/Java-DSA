public class InsertionArray {
    public static void main(String[] args) {

        int[] arr= {2,34,21,6,7,8,90,67,23,39};
        int x = 12; int y =6;
        int[] arr2 = new int[11];

        for (int i = 0; i < 10; i++) {
            if (i==y) {
                arr2[i] = x;
                arr2[i+1]=arr[i];
            }
            else if (i<y) {
                arr2[i] = arr[i];
            }
            else{
                arr2[i+1]=arr[i];
            }
        }
        for (int i = 0; i < 11; i++) {
            System.out.print(arr2[i]+" , ");
        }
    }
}