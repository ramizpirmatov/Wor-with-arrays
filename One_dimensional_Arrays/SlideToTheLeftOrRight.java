package One_dimensional_Arrays;

import java.util.Scanner;


public class SlideToTheLeftOrRight
{
    public static void main(String[] args) {
        int n, k, temp, chance = 1;
        String dir;
        Scanner input = new Scanner(System.in);

        System.out.print("Massivin elementelrinin sayini daxil edin: ");
        n = input.nextInt();


        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = (int)(Math.random() * 23);
        }

        System.out.println("Massiv:");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\n");

        System.out.print("Massivin neche element surushduruleceyini gosterin: ");
        k = input.nextInt();

        while (chance == 1) {
            System.out.print("Massivin surushme istiqametini secin(\"<\" ve ya \">\"): ");
            dir = input.next();

            if (dir.equals("<")) {
                for (int i = 0; i < k; i++) {
                    temp = arr[0];
                    for (int j = 0; j < n - 1; j++) {
                        arr[j] = arr[j + 1];
                    }
                    arr[n - 1] = temp;
                }
                chance = 2;
            }
            else if (dir.equals(">")) {
                for (int i = 0; i < k; i++) {
                    temp = arr[n - 1];
                    for (int j = n - 1; j > 0; j--) {
                        arr[j] = arr[j - 1];
                    }
                    arr[0] = temp;
                }
                chance = 2;
            }
            else {
                do {
                    System.out.println("\nDaxil etdiyiniz simvol(lar) qeyd olunmush shertlere uygun deyil!\n" +
                            "Shansinizi bir daha yoxlamaq isteyirsinizse \"1\", bitirmwk isteyirsinizse \"0\" daxil edin");
                    chance = input.nextInt();

                } while (chance != 0 && chance != 1);

                if(chance == 0) break;
            }
        }




        if (chance == 2) {

            System.out.println("\nSonra:");

            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
        }
        
        // Elave massiv yolu bundan daha sade oldugu ucun tekce bu usulla eledim

    }
}
