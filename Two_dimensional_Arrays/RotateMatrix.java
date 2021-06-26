package Two_dimensional_Arrays;

import java.util.Scanner;


public class RotateMatrix
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, temp_1, temp_2, temp_3;
        boolean isRight = true;
        String direction = null;

        System.out.print("NxN ucun N: ");
        n = input.nextInt();
        System.out.print("Istiqameti daxil edin(\"<\" ve ya \">\"): ");
        direction = input.next();

        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = (int)(Math.random() * 100);
            }
        }

        System.out.println("\nMassiv:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%3d ", arr[i][j]);
            }
            System.out.println();
        }

        if (direction.equals("<")) {
            for (int i = 0; i < n / 2 + (n % 2); i++) {
                for (int j = i; j < n - 1 - i; j++) {
                    temp_1 = arr[n - 1 - j][i];
                    arr[n - 1 - j][i] = arr[i][j];
                    temp_2 = arr[n - 1 - i][n - 1 - j];
                    arr[n - 1 - i][n - 1 - j] = temp_1;
                    temp_3 = arr[j][n - 1 - i];
                    arr[j][n - 1 - i] = temp_2;
                    arr[i][j] = temp_3;
                }
            }
        }
        else if (direction.equals(">")) {
            for (int i = 0; i < n / 2 + (n % 2); i++) {
                for (int j = i; j < n - 1 - i; j++) {
                    temp_1 = arr[n - 1 - j][n - 1 - i];
                    arr[n - 1 - j][n - 1 - i] = arr[i][n - 1 - j];
                    temp_2 = arr[n - 1 - i][j];
                    arr[n - 1 - i][j] = temp_1;
                    temp_3 = arr[j][i];
                    arr[j][i] = temp_2;
                    arr[i][n - 1 - j] = temp_3;
                }
            }
        }
        else {
            System.out.println("Duzgun simvol daxil etmediniz!");
            isRight = false;
        }

        if (isRight) {
            System.out.println("\nSonra:");

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.printf("%3d ", arr[i][j]);
                }
                System.out.println();
            }
        }

    }
}
