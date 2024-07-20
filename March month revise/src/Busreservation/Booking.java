package Busreservation;
import java.text.ParseException;
import java.util.*;
import java.text.SimpleDateFormat;
public class Booking {
    String passengerName;
    int busNo;
    Date date;

    Booking() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the name of passenger:");
        passengerName = in.next();
        System.out.println("enter bus no:");
        busNo = in.nextInt();
        System.out.println("enter date dd-mm-yyyy");
        String dateinput = in.next();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-mm-yyyy");
        try {
            date = dateFormat.parse(dateinput);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }


    public boolean isAvailable(ArrayList<Booking> bookings, ArrayList<Bus> buses) {
        int capacity = 0;
        for (Bus bus : buses) {
            if (bus.getBusNo()==busNo) {
                capacity = bus.getCapacity();
            }
        }
        int booked = 0;
        for (Booking b : bookings) {
            if (b.busNo==busNo && b.date.equals(date)) {
                booked++;
            }
        }
        return booked < capacity?true:false;

    }
}


