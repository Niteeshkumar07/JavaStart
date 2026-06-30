import java.util.Scanner;

public class Day1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number");
        int a = sc.nextInt();
        System.out.println("Enter Second Number");
        int b= sc.nextInt();

        System.out.println("The Sum of two number is "+       (a+b));
        sc.close();
    }
    
}