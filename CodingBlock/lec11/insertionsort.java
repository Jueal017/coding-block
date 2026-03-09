import java.util.Scanner;
public class insertionsort{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the length:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("enter the elements:");
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 1; i<n; i++){

            for(int j = i-1; j>=0; j--){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }else{
                    break;
                }
                

            }
            System.out.println();
        }
        for(int i = 0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
    

