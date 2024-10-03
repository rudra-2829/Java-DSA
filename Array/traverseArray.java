public class traverseArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        for (int i = 4; i >=0; i--) {
            if (i==0) {
                System.out.println(arr[i]);
            }else{
                System.out.print(arr[i]+",");
            }
        }
    }
}
