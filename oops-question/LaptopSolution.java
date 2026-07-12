import java.util.*;

class Laptop {
    private int laptopId;
    private String brand;
    private String osType;
    private double price;
    private int rating;

    public Laptop(int laptopId, String brand, String osType, double price, int rating) {
        this.laptopId = laptopId;
        this.brand = brand;
        this.osType = osType;
        this.price = price;
        this.rating = rating;
    }

    public int getlaptopId() { return laptopId; }
    public String getbrand() { return brand; }
    public String getosType() { return osType; }
    public double getprice() { return price; }
    public int getrating() { return rating; }
}

public class LaptopSolution {
    public static int countOfLaptopsByBrand(Laptop[] laptop, String brandName) {
        int count = 0;
        for (Laptop l : laptop) {
            // Checks if brand matches (case-insensitive) AND rating is greater than 3
            if (l.getbrand().equalsIgnoreCase(brandName) && l.getrating() > 3) {
                count++;
            }
        }
        return count;
    }

    public static Laptop[] searchLaptopByOsType(Laptop[] laptop, String os) {
        Laptop[] temp = new Laptop[laptop.length];
        int count = 0;

        // Filter laptops by OS Type
        for (Laptop l : laptop) {
            if (l.getosType().equalsIgnoreCase(os)) {
                temp[count] = l;
                count++;
            }
        }

        // Return null if no matching OS found
        if (count == 0) {
            return null;
        }

        // FIX: Sort the filtered laptops by laptopId in descending order
        for (int i = 0; i < count - 1; i++) {
            for (int j = i + 1; j < count; j++) {
                if (temp[i].getlaptopId() < temp[j].getlaptopId()) {
                    Laptop t = temp[i];
                    temp[i] = temp[j];
                    temp[j] = t;
                }
            }
        }

        // FIX: Copy elements into a precisely sized result array to remove trailing nulls
        Laptop[] result = new Laptop[count];
        for (int i = 0; i < count; i++) {
            result[i] = temp[i];
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Take input for 4 laptops
        Laptop[] laptop = new Laptop[4];
        for (int i = 0; i < 4; i++) {
            int id = sc.nextInt(); sc.nextLine();
            String brand = sc.nextLine();
            String os = sc.nextLine();
            double price = sc.nextDouble();
            int rating = sc.nextInt(); sc.nextLine();
            laptop[i] = new Laptop(id, brand, os, price, rating);
        }

        String brandTarget = sc.nextLine();
        String osTarget = sc.nextLine();

        // Task 1: Count of laptops by brand
        int ans = countOfLaptopsByBrand(laptop, brandTarget);
        if (ans > 0) {
            System.out.println(ans);
        } else {
            System.out.println("The given brand is not available");
        }

        // Task 2: Search laptops by OS Type
        Laptop[] res = searchLaptopByOsType(laptop, osTarget);
        if (res == null) {
            System.out.println("The given os is not available");
        } else {
            for (Laptop l : res) {
                System.out.println(l.getlaptopId());
                System.out.println(l.getrating());
            }
        }
        sc.close();
    }
}
