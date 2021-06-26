package Two_dimensional_Arrays;

import java.util.Scanner;


public class OneToNPowtwoSpiral
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, num = 1;

        System.out.print("arr[n][n] massivi ucun n: ");
        n = input.nextInt();

        int[][] arr = new int[n][n];

        for (int i = 0; i < (n / 2) + (n % 2); i++) {
            for (int j = i; j < n - i; j++) {
                arr[i][j] = num++;
            }

            for (int j = i + 1; j < n - i; j++) {
                arr[j][n - 1 - i] = num++;
            }

            for (int j = n - 2 - i; j >= i; j--) {
                arr[n - 1 - i][j] = num++;
            }

            for (int j = n - 2 - i; j > i; j--) {
                arr[j][i] = num++;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%3d ", arr[i][j]);
            }
            System.out.println();
        }
    }
}
