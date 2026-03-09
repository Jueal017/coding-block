import java.util.Scanner;
public class productaofall {

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];

        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        display(arr,n);
    }
    static void display(int[]arr,int n){
        int res = 1;

        for(int i = 0 ; i<n;i++){
            res = res *arr[i];
        }
        System.out.println(res);
    
     for(int i = 0; i<n; i++){
            int temp = res/arr[i];
            System.out.print(temp+" ");
    }
    
}
}
