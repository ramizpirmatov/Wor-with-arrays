package Two_dimensional_Arrays;

import java.util.Scanner;


public class PrintEvenNumbers
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, m;

        System.out.print("Massivin setirlerinin sayini daxil edin: ");
        n = input.nextInt();
        System.out.print("Massivin sutunlarinin sayini daxil edin: ");
        m = input.nextInt();

        int[][] arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = (int)(Math.random() * 100);
            }
        }

        System.out.println("Massiv:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nYalniz cut elementler:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] % 2 == 0) System.out.print(arr[i][j] + " ");
            }
        }

    }
}
