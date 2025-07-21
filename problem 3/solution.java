import java.util.*;

class Motel {
    private int motelId;
    private String motelName;
    private String dateOfBooking;
    private int noOfRoomsBooked;
    private String cabFacility;
    private double totalBill;

    // Parameterized constructor
    public Motel(int motelId, String motelName, String dateOfBooking, int noOfRoomsBooked, String cabFacility, double totalBill) {
        this.motelId = motelId;
        this.motelName = motelName;
        this.dateOfBooking = dateOfBooking;
        this.noOfRoomsBooked = noOfRoomsBooked;
        this.cabFacility = cabFacility;
        this.totalBill = totalBill;
    }

    // Getters
    public int getMotelId() {
        return motelId;
    }

    public String getMotelName() {
        return motelName;
    }

    public String getDateOfBooking() {
        return dateOfBooking;
    }

    public int getNoOfRoomsBooked() {
        return noOfRoomsBooked;
    }

    public String getCabFacility() {
        return cabFacility;
    }

    public double getTotalBill() {
        return totalBill;
    }

    // Setters
    public void setMotelId(int motelId) {
        this.motelId = motelId;
    }

    public void setMotelName(String motelName) {
        this.motelName = motelName;
    }

    public void setDateOfBooking(String dateOfBooking) {
        this.dateOfBooking = dateOfBooking;
    }

    public void setNoOfRoomsBooked(int noOfRoomsBooked) {
        this.noOfRoomsBooked = noOfRoomsBooked;
    }

    public void setCabFacility(String cabFacility) {
        this.cabFacility = cabFacility;
    }

    public void setTotalBill(double totalBill) {
        this.totalBill = totalBill;
    }
}

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Motel arr[] = new Motel[4];

        for (int i = 0; i < 4; i++) {
            int a = sc.nextInt(); sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int n = sc.nextInt(); sc.nextLine();
            String d = sc.nextLine();
            double e = sc.nextDouble(); sc.nextLine();

            arr[i] = new Motel(a, b, c, n, d, e);
        }

        String s = sc.nextLine();

        int r = totalNoOfRoomsBooked(arr, s);
        if (r != 0) {
            System.out.println(r);
        } else {
            System.out.println("No such rooms booked");
        }
    }

    public static int totalNoOfRoomsBooked(Motel[] arr, String s) {
        int total = 0;
        for (Motel m : arr) {
            if (m.getCabFacility().equalsIgnoreCase(s) && m.getNoOfRoomsBooked() > 5) {
                total += m.getNoOfRoomsBooked();
            }
        }
        return total;
    }
}
