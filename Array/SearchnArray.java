public class SearchnArray {
    public static void main(String[] args) {
        int[] arr = {2,34,67,21,6,7,8,90,67,23,39};
        int a = 67;
        boolean found= false ;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i]==  a) {
                System.out.println("Element "+a+" is present in Array at index "+i);
                found = true;
            }
        }
        if (found == false) {
            System.out.println("Element is not present in Array");
        }
    }
}