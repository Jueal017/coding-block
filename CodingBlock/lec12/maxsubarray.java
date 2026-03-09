import java.util.Scanner;
public class maxsubarray{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int maxsum = Integer.MIN_VALUE;
        for(int i = 0; i<n; i++){
            for(int j = i; j<n; j++){
                int sum = 0;
                for(int k = i; k<=j; k++){
                    sum += arr[k];
                }
                maxsum = Math.max(maxsum, sum);
            }
        }
        System.out.println("Maximum subarray sum: "+maxsum);
    } 
}