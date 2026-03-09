import java.util.Scanner;
public class findmissingarray {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        findmissing(arr,n);
        sc.close();
    }
    static void findmissing(int[] arr, int n){
        int sum = 0;
        for(int i = 0; i<n; i++){
            sum = sum + arr[i];
        }
        int total = (n* (n+1))/2;
        int res = total - sum;
        System.out.println(" the missing number:"+ res);
    }

}
