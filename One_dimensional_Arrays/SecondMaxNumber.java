package One_dimensional_Arrays;

public class SecondMaxNumber
{
    public static void main(String[] args) {
        int[] arr = new int[20];
        int max_1 = 0, max_2 = 0, id_1 = 0, id_2 = 0;

        for (int i = 0; i < 20; i++) {
            arr[i] = 1 + (int)(Math.random() * 99);
            if(arr[i] > max_1){
                max_1 = arr[i];
                id_1 = i;
            }
        }

        for (int i = 0; i < 20; i++) {
            System.out.print(arr[i] + " ");
        }

        for (int i = 0; i < 20; i++) {
            if(arr[i] > max_2 && i != id_1){
                max_2 = arr[i];
                id_2 = i;
            }
        }
        
        id_2++;

        System.out.print("\nSecond maximum value: " + max_2 + "\nIndex of element: " + id_2);


    }
}
