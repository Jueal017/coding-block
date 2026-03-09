import java.util.Scanner;
public class productindex{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size:");
        int n = sc.nextInt();
        int result[]  = new int[n];
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        peak(arr,n);
        sc.close();

    }    

        
    public static void peak(int arr[], int n){
        
        for(int i = 1; i<n; i++){
            int res = 1;
            for(int j = 0; j<n; j++){
                if(i != j){
                    res = res*arr[j];
                }
            }
            System.out.print(res+" ");

            
        }

    }
}      


            

                

            
        
        
    
    
   