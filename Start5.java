public class Start5 { 
    // Added 'static' and changed 'return 0' to proper boolean logic
    public static boolean IsPrime(int n) { 
        if (n <= 1) {
            return false; 
        }
        for (int i = 2; i * i <= n; i++) { 
            if (n % i == 0) {
                return false; 
            }
        }
        return true; 
    } 

    public static void main(String[] args) { 
        for (int i = 1; i <= 10; i++) { 
            // Correctly using the boolean result
            if (IsPrime(i)) { 
                System.out.println(i + " is a prime number.");
            } 
        } 
    } 
}
