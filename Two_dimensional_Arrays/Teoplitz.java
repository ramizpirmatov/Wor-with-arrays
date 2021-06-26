package Two_dimensional_Arrays;

import java.util.Scanner;


public class Teoplitz
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, m, opt, sum = 0, temp = 0;
        boolean isRight = true, isTeop = true;

        System.out.print("A[n][m] massivi ucun n: ");
        n = input.nextInt();
        System.out.print("A[n][m] massivi ucun m: ");
        m = input.nextInt();

        System.out.println("Massivi manual doldurmaq ucun 1, random doldurulmasi ucun 0 daxil edin: ");
        opt = input.nextInt();

        int[][] arr = new int[n][m];

        if (opt == 1) {
            System.out.println("Massivin elementlerini daxil edin:");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    arr[i][j] = input.nextInt();
                }
            }
        }
        else if (opt == 0) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    arr[i][j] = (int) (Math.random() * 100);
                }
            }
        }
        else {
            isRight = false;
            System.out.println("Emeliyyad ucun duzgun eded daxil edilmedi!");
        }

        if (isRight) {
            System.out.println("Massiv:");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }

        if (isRight){

            for (int k = 0; k < n + m - 3; k++) {
                if (k <= m - 2){
                    for (int i = k + 1, j = 1; i > 0 && i < n; i--, j++) {
                        if (arr[0][m - k - 2] != arr[i][m - j]) {
                            isTeop = false;
                            break;
                        }
                    }
                }
                else {
                    for (int i = n + m - 3 - k, j = 1; i > 0; i--, j++) {
                        if (arr[k - m + 2][0] != arr[n - j][i]) {
                            isTeop = false;
                            break;
                        }
                    }
                }
                if (!isTeop) break;
            }

            if (isTeop) {
                System.out.println("YES!");
            }
            else System.out.println("NO!");
        }
    }
}
