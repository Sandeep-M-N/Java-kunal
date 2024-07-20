package Flight_booking_with_cancel;

import java.util.ArrayList;

public class Flight {
    static int id=0;
    int flightid;
    int seats;
    int price;
    ArrayList<String> passengerdetails;
    ArrayList<Integer> passengerid;
    ArrayList<Integer> bookedseats;
    ArrayList<Integer> bookedseatspercost;


    public Flight(){
        id=id+1;
        flightid=id;
        seats=50;
        price=5000;
        passengerdetails=new ArrayList<String>();
        passengerid=new ArrayList<Integer>();
        bookedseats=new ArrayList<Integer>();
        bookedseatspercost=new ArrayList<Integer>();
    }
    public void setdetails(int new_seats,int new_price){
        this.seats=new_seats;
        this.price=new_price;
    }
    public void summary(){
        System.out.println("Available seats "+seats);
        System.out.println("Price "+price);
    }
    public void printdetails(){
        System.out.println("passenger id    flight id     no of seats booked  total cost");
        for(String s :passengerdetails){
            System.out.println(s);
        }
        System.out.println("---------------------------------------------------------------------------");

    }

}
