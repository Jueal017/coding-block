import java.util.Scanner;
 
class findingelement {
    public static void findElement(int[]arr,int k){
        for(int i = 0; i<arr.length;i++){
            if(arr[i] == k){
                System.out.println("Element found at index: " + i);
                return;
            }

            
            
        }
        System.out.println("Element not found in the array.");
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("the array is: ");
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    System.out.println("\nEnter the element to search: ");
    int k = sc.nextInt();
    findElement(arr,k);
}
}
