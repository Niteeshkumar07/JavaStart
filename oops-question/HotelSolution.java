import java.util.*;

class Hotel {
    private int hotelId;
    private String hotelName;
    private String dateOfBooking;
    private int noOfRoomsBooked;
    private String wifiFacility;
    private double totalBill;

    public Hotel(int hotelId, String hotelName, String dateOfBooking, int noOfRoomsBooked, String wifiFacility, double totalBill) {
        this.hotelId = hotelId;
        this.hotelName = hotelName;
        this.dateOfBooking = dateOfBooking;
        this.noOfRoomsBooked = noOfRoomsBooked;
        this.wifiFacility = wifiFacility;
        this.totalBill = totalBill;
    }

    public int gethotelId() { return hotelId; }
    public String gethotelName() { return hotelName; }
    public String getdateOfBooking() { return dateOfBooking; }
    public int getnoOfRoomsBooked() { return noOfRoomsBooked; }
    public String getwifiFacility() { return wifiFacility; }
    public double gettotalBill() { return totalBill; }
}

public class HotelSolution {
    public static int noOfRoomsBookedInGivenMonth(Hotel[] hotels, String month) {
        int count = 0;
        for (Hotel h : hotels) {
            String date = h.getdateOfBooking();
            // Splitting string assuming format like "dd-MMM-yyyy" or "dd-MM-yyyy"
            String[] dateParts = date.split("-");
            if (dateParts.length > 1) {
                String extractmonth = dateParts[1];
                if (extractmonth.equalsIgnoreCase(month)) {
                    count += h.getnoOfRoomsBooked();
                }
            }
        }
        return count;
    }

    public static Hotel searchHotelByWifiOption(Hotel[] hotels, String wifi) {
        Hotel first = null;
        Hotel sec = null;
        
        for (Hotel h : hotels) {
            if (h.getwifiFacility().equalsIgnoreCase(wifi)) {
                if (first == null) {
                    first = h;
                } else if (h.gettotalBill() > first.gettotalBill()) {
                    // FIX: Demote current first to second, then update first
                    sec = first;
                    first = h;
                } else if (sec == null || h.gettotalBill() > sec.gettotalBill()) {
                    // FIX: Update second if it's smaller than current bill but less than first
                    sec = h;
                }
            }
        }
        return sec;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Hotel[] hotels = new Hotel[4];
        
        // FIX: Completed the missing loop and proper scanner buffer clearing
        for (int i = 0; i < 4; i++) {
            int hotelId = sc.nextInt(); sc.nextLine();
            String hotelName = sc.nextLine();
            String dateOfBooking = sc.nextLine();
            int noOfRoomsBooked = sc.nextInt(); sc.nextLine();
            String wifiFacility = sc.nextLine();
            double totalBill = sc.nextDouble(); sc.nextLine();
            
            hotels[i] = new Hotel(hotelId, hotelName, dateOfBooking, noOfRoomsBooked, wifiFacility, totalBill);
        }

        String month = sc.nextLine();
        String wifi = sc.nextLine();

        // Task 1: Total rooms booked in a given month
        int ans = noOfRoomsBookedInGivenMonth(hotels, month);
        if (ans > 0) {
            System.out.println(ans);
        } else {
            System.out.println("No rooms booked in the given month");
        }

        // Task 2: Find hotel with second-highest bill matching wifi option
        Hotel res = searchHotelByWifiOption(hotels, wifi);
        if (res == null) {
            System.out.println("No such option available");
        } else {
            System.out.println(res.gethotelId());
        }
        
        sc.close();
    }
}
