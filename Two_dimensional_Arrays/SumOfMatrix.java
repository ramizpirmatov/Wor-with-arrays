package Two_dimensional_Arrays;

import java.util.Scanner;


public class SumOfMatrix
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, k;

        System.out.print("Setir sayi: ");
        n = input.nextInt();
        System.out.print("Sutun sayi: ");
        k = input.nextInt();

        int[][] A = new int[n][k], B = new int[n][k], C = new int[n][k];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                A[i][j] = (int) (Math.random() * 100);
                B[i][j] = (int) (Math.random() * 100);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }

        System.out.println("\nA massivi:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                System.out.printf("%3d ", A[i][j]);
            }
            System.out.println();
        }

        System.out.println("\nB massivi:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                System.out.printf("%3d ", B[i][j]);
            }
            System.out.println();
        }

        System.out.println("\nC massivi(A + B):");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                System.out.printf("%3d ", C[i][j]);
            }
            System.out.println();
        }
    }
}
