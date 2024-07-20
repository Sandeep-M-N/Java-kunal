package Flight_booking;

import java.util.ArrayList;
import java.util.List;

public class Flight{
    static int flightcount=0;
    int passengerid;
     int id;
     int seats;
     int price;
    List<String> trips;


    public Flight() {
        flightcount=flightcount+1;
        passengerid=0;
        id=flightcount;
        seats=50;
        price=5000;
        trips=new ArrayList<>();
    }
    public void setdetails( int passengerid,int newseats,int newprice,String trips){
        this.passengerid=passengerid;
        this.seats=newseats;
        this.price=newprice;
        this.trips.add(trips);
    }
    public void printdetails(){
        System.out.println("Remaining seats "+this.seats+"price= "+this.price);
        System.out.println("passenger id        Flight id       total seats booked          total price "  );
        for(String s:trips){
            System.out.println(s);
        }
        System.out.println("----------------------------------------------------------------------------------------------------");
    }



}

