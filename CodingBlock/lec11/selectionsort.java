import java.util.Scanner;
public class selectionsort{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the length:");
        int n = sc.nextInt();

        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i<n-1; i++){
             int minindex = i;
            for(int j = i+1; j<n; j++){
                if(arr[j]<arr[minindex]){
                    minindex = j;
                    
                }

            }
            int temp = arr[i];
            arr[i] = arr[minindex];
            arr[minindex] = temp;
            
            for(int k = 0; k<n; k++){
                System.out.print(arr[k]+" ");
            }
            System.out.print(" ");
        }
    }
}
