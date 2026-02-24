import java.util.Scanner;

public class thricerightshift {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

    

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k =3;
        for(int j = 0; j < k; j++){
        
         int lastElement = arr[n - 1];

         for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
         }
         arr[0] = lastElement;
        }
        System.out.print("Right Shifted Array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}