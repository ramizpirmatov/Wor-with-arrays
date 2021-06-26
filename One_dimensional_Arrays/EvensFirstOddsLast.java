package One_dimensional_Arrays;

import java.util.Scanner;


public class EvensFirstOddsLast
{
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);

        System.out.print("Massivin elementelrinin sayini daxil edin: ");
        n = input.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = (int)(Math.random() * 23);
        }

        System.out.println("Evvel:");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        int temp;

        for (int i = n - 2; i >= 0; i--) {
            if(arr[i] % 2 != 0 && arr[i + 1] % 2 == 0) {
                temp = arr[i];
                for (int j = i; ; j++) {
                    if (j == n - 1 || arr[j + 1] % 2 != 0) {
                        arr[j] = temp;
                        break;
                    }
                    else arr[j] = arr[j + 1];
                }
            }
        }

        System.out.println("\nSonra:");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
