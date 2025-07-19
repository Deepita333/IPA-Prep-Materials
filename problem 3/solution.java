import java.util.*;
 class Motel{
        private int motelId; 
        private String motelName;
        private String dateOfBooking; 
        private int noOfRoomsBooked;
        private String cabFacility;
        private double totalBill;
    public Motel(int motelId, String motelName, String dateOfBooking, int noOfRoomsBooked , String cabFacility,double totalBill)
        {
            this.motelId=motelId;
            this.motelName=motelName;
            this.dateOfBooking=dateOfBooking;
            this.noOfRoomsBooked= noOfRoomsBooked;
            this.cabFacility=cabFacility;
            this.totalBill=totalBill;
        }
        public int getmotelId() {
            return motelId; }
        public String getmotelName() {
            return motelName;
        }
          public String getdateOfBooking() {
            return dateOfBooking;
        }
        public String getnoOfRoomsBooked(){
            return noOfRoomsBooked;
        }
          public String getcabFacility() {
            return cabFacility;
        }
          public double gettotalBill() {
            return totalBill;
        }
        public void setmotelId(int motelId){
              this motelId=motelId;
        }
          public void setmotelName(String motelName){
              this motelName=motelName;
        }
          public void setdateOfBooking(String dateOfBooking ){
              this dateOfBooking=dateOfBooking;
        }
        public void setnoOfRoomsBooked(int noOfRoomsBooked){this noOfRoomsBooked= noOfRoomsBooked;}
          public void setcabFacility(String cabFacility){
               this cabFacility=cabFacility;
        }
          public void settotalBill(double totalBill){
              this totalBill=totalBill;
        }
    }
    public class Main
    {
        public static void main (String args[]) 
        {
            Scanner sc = new Scanner(System.in);
            Motel arr[] = new Motel[4];
            for(int i = 0 ; i < 4 ; i++)
            {
                int a = sc.nextInt();sc.nextLine();
                String b = sc.nextLine();
                String c = sc.nextLine();
                int n = sc.nextInt();sc.nextLine();
                String d = sc.nextLine();
                double e = sc.nextDouble();sc.nextLine();
                Motel arr[i]=[a,b,c,n,d,e];
            }
            String s = sc.nextLine();
            int r = totalNoOfRoomsBooked(arr,s);
            if(r!=0)
            {
                System.out.println(r);
            }
            else {
                 System.out.println("No such rooms booked");
            }
        }
        public int totalNoOfRoomsBooked(int arr[],String s)
        {
            for(Motel m :arr )
            {
                if(m.getcabFacility().equals(s) && m.getnoOfRoomsBooked()>5)
                {
                    return m.getnoOfRoomsBooked();
                }
            }
        }
    }

