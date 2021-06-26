package Two_dimensional_Arrays;

import java.util.Scanner;


public class Sequence1
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;

        System.out.print("A[n][n] massivi ucun n: ");
        n = input.nextInt();

        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[j][i] = i;
            }
        }

        System.out.println("Massiv:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
