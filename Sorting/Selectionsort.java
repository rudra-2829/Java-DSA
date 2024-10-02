import java.util.*;
public class Selectionsort {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter total number of Numbers");
        int n = sc.nextInt();
        int[] number = new int [n];


        // take input of array 
        for (int i = 0; i < n; i++) {
            System.out.println("Enter "+i+" number");
            number[i] = sc.nextInt();
        }

        // sorting 
        for (int i = 0; i < n-1; i++) {
            int small = i;
            for (int j = i+1; j < n; j++) {
                if (number[small]>number[j]) {
                    small = j;
                }
            }
            int temp = number[small];
            number[small] = number[i];
            number[i]= temp;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(number[i]+" ");
        }
        sc.close();
    }
}