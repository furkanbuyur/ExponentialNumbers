import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("x^n");
        System.out.print("x : ");
        int x = sc.nextInt();
        System.out.print("n : ");
        int n = sc.nextInt();
        int result = 1;


        for (int i = 1; i <= n; i++){
            result *= x;
        }
        System.out.println("Result : "+result);
    }
}