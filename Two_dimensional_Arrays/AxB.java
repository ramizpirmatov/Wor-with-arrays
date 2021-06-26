package Two_dimensional_Arrays;

import java.util.Scanner;


public class AxB
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int n, k, m, sum = 0;

        System.out.print("A[n][k] massivi ucun n: ");
        n = input.nextInt();
        System.out.print("A[n][k] ve B[k][m] massivleri ucun k: ");
        k = input.nextInt();
        System.out.print("B[k][m] massivi ucun m: ");
        m = input.nextInt();

        int[][] A = new int[n][k], B = new int[k][m], C = new int[n][m];

        System.out.println("\nA:");
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < k; j++)
            {
                A[i][j] = (int) (Math.random() * 10);
            }
        }

        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < k; j++)
            {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nB:");
        for (int i = 0; i < k; i++)
        {
            for (int j = 0; j < m; j++)
            {
                B[i][j] = (int) (Math.random() * 10);
            }
        }

        for (int i = 0; i < k; i++)
        {
            for (int j = 0; j < m; j++)
            {
                System.out.print(B[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nC  (A * B):");
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < m; j++)
            {
                for (int r = 0; r < k; r++)
                {
                    C[i][j] += A[i][r] * B[r][j];
                }
            }
        }

        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < m; j++)
            {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }
}
