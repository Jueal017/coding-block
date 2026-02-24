import java.util.Scanner;
public class swapbitwise {
    public static void bitwise(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number");
        int a = sc.nextInt();
        System.out.println("enter second number");
        int b = sc.nextInt();

        a = a^b;
        b = a^b;
        a = a^b;

    
          System.out.println(a);
          System.out.println(b);
    }
}
