package One_dimensional_Arrays;

import java.util.Scanner;

public class CountOfX
{
    public static void main(String[] args) {
        int x, n, count = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter n of the array: ");

        n = input.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = 1 + (int)(Math.random() * 99);
        }

        System.out.print("Enter any X number: ");
        
        x = input.nextInt();

        for (int i = 0; i < n; i++) {
            if(arr[i] == x) count++;
        }

        if(count == 0) System.out.println("Not found!");
        else System.out.println("Count of " + x + " in the array: " + count);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
