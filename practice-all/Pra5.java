import java.util.Scanner;

public class Pra5 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String num = sc.nextLine();
        int n = Integer.parseInt(num);

        int rev = 0;

        while(n!=0){
            int digit = n%10;
            rev = rev * 10 + digit;
            n=n/10;

        }
        System.out.println(rev);
        sc.close();
    }
}
