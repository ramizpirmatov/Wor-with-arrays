package One_dimensional_Arrays;

import java.util.Scanner;


public class ZerosLast
{
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);

        System.out.print("Massivin elementelrinin sayini daxil edin: ");
        n = input.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            //arr[i] = (int)(Math.random() * 23);
            arr[i] = input.nextInt();
        }

        System.out.println("Evvel:");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        for (int i = n - 2; i >= 0; i--) {
            if(arr[i] == 0 && arr[i + 1] != 0) {
                for (int j = i; ; j++) {
                    if (j == n - 1 || arr[j + 1] == 0) {
                        arr[j] = 0;
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
