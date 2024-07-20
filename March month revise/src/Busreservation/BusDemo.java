package Busreservation;
import java.util.Scanner;
import java.util.ArrayList;
public class BusDemo {
    public static void main(String[] args) {
        ArrayList<Bus> buses = new ArrayList<Bus>();
        ArrayList<Booking> bookings= new ArrayList<Booking>();
        buses.add(new Bus(1,true,20));
        buses.add(new Bus(2,false,15));
        buses.add(new Bus(3,false,3));

        int useropt=1;
        Scanner in = new Scanner(System.in);
        for(Bus b : buses){
            b.displayBusInfo();

        }
        while(useropt==1) {
            System.out.println("enter 1 to book and 2 to exit");
           useropt= in.nextInt();
           if(useropt==1){
              Booking booking=new Booking();
              if(booking.isAvailable(bookings,buses)){
                  bookings.add(booking);
                  System.out.println("your booking is confirmed");
              }
              else{
                  System.out.println("sorry bus is full.try another bus or date.");
              }
           }
        }
    }
}
