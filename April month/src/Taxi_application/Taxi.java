package Taxi_application;

import java.util.ArrayList;
import java.util.List;

public class Taxi {
    int id;
     static int taxicount=0; // taxi number;
    char currentspot; // currentspot where the taxi is
    boolean booked; // taxi booked or not
    int freetime; // when taxi becomes free
    int totalearnings;
    List<String> trips; // all details of trip of the taxi


    public Taxi(){
        taxicount = taxicount+1;
        id=taxicount;
        currentspot='A';
        freetime=6;
        booked=false;
        totalearnings=0;
        trips=new ArrayList<>();
    }

    public  void setdetails(boolean booked, char currentspot, int freetime, int totalearnings,String tripdetails){
        this.booked=booked;
        this.currentspot=currentspot;
        this.freetime=freetime;
        this.totalearnings=totalearnings;
        this.trips.add(tripdetails);
    }
    public void printtaxidetails(){
        System.out.println("Taxi"+this.id+"toatal earnings"+this.totalearnings);
        System.out.println("TaxiID    BookingID    CustomerID    From    To    PickupTime    DropTime    Amount");
        for(String trip : trips)
        {
            System.out.println(id + "          " + trip);
        }
        System.out.println("--------------------------------------------------------------------------------------");
    }



}
