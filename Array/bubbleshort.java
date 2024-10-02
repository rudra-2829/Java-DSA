import java.util.*;
public class bubbleshort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total number of Numbers");
        int n = sc.nextInt();
        int[] number = new int [n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter "+i+" Numbers");
            number[i]=sc.nextInt();
        }

        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (number[j]>number[j+1]) {
                     int temp = number[j+1];
                     number[j+1] = number[j];
                     number[j] = temp;                
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(number[i]+" ");
        }
        sc.close();
    }
}