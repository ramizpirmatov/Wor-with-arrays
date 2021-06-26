package Two_dimensional_Arrays;

import java.util.Scanner;

public class CreateMagicSquare
{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n;

        System.out.print("N: ");
        n = input.nextInt();

        int[][] arr = new int[n][n];

        int i = n / 2;
        int j = n - 1;

        for (int nr = 1; nr <= n * n; nr++) {

            if (j == n && i == -1) {
                i = 0;
                j = n - 2;
            }
            else {

                if (j == n) j = 0;

                if (i < 0) i = n - 1;
            }

            if (arr[i][j] == 0) arr[i][j] = nr;
            else {
                j -= 2;
                i++;
                nr--;
                continue;
            }

            i--;
            j++;
        }

        for (int k = 0; k < n; k++) {
            for (int l = 0; l < n; l++) {
                System.out.print(arr[k][l] + " ");
            }
            System.out.println();
        }
    }
}
