package Two_dimensional_Arrays;

import java.util.Scanner;

public class Sequence4
{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n, numb = 1;

        System.out.println("N: ");  n = input.nextInt();

        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                arr[i][j] = numb++;
            }
        }

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                arr[i][j] = numb++;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
