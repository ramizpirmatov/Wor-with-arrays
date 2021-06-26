package One_dimensional_Arrays;

import java.util.Scanner;

public class SumIsKPairs
{
    public static void main(String[] args) {
        int n, k;
        boolean isThere = false;
        Scanner input = new Scanner(System.in);

        System.out.print("Massivde elementlerin sayi: ");
        n = input.nextInt();

        int[] arr = new int[n];

        System.out.println("Massivin elemetlerini daxil edin:");

        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        System.out.print("Cemi ifade eden K ededini daxil edin: ");
        k = input.nextInt();

        for (int i = 0; i < n - 1; i++){
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == k){
                    System.out.println(arr[i] + " ve " + arr[j]);
                    isThere = true;
                }
            }
        }

        if(!isThere) System.out.println("Massivde K cemine beraber olan cutluk yoxdur!");




    }
}
