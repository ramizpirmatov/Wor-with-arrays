package One_dimensional_Arrays;
import java.util.Scanner;

public class DeleteNumberAtXthIndex
{
    public static void main(String[] args) {
        int x, n, j = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter count of the array: ");

        n = input.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = 1 + (int)(Math.random() * 99);
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }



        System.out.print("\nEnter any index: ");
        
        x = input.nextInt();
        x -= 1;

        int[] temp = new int[n - 1];
        
        for (int i = 0; i < n - 1; i++, j++) {
            if(j == x) {
                j++;
                break;
            }
            temp[i] = arr[j];
        }

        for (int i = j - 1; i < n - 1; i++, j++) {
            temp[i] = arr[j];
        }

        for (int i = 0; i < temp.length; i++) {
            System.out.print(temp[i] + " ");
        }
    }
}
