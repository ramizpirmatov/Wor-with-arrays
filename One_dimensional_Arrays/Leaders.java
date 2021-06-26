package One_dimensional_Arrays;

import java.util.Scanner;


public class Leaders {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);

        System.out.print("Massivin elementlerinin sayini daxil edin: ");
        n = input.nextInt();
        
        int[] arr = new int[n];

        System.out.println("Massivin elementlerini daxil edin:");

        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nLider ededler:");

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] <= arr[j]) break;
                if (j == n - 1) System.out.print(arr[i] + " ");
            }
        }

        System.out.print(arr[n - 1]);



    }
}
