package Taxi_onceagain;

import java.util.ArrayList;
import java.util.List;

public class Taxi {
    int id;
    static  int taxicount=0;

    boolean booked;
    char currentspot;
    int freetime;
    int totalearnings;
    List<String> trips;


    public Taxi(){
        taxicount=taxicount+1;
        id=taxicount;
        booked=false;
        currentspot='A';
        freetime=6;
        totalearnings=0;
        trips=new ArrayList<>();
    }
    public void setdetails(boolean booked,char nextspot,int earnings,int nextfreetime,String tripdetail){
        this.booked=booked;
        this.currentspot=nextspot;
        this.totalearnings=earnings;
        this.freetime=nextfreetime;
        this.trips.add(tripdetail);
    }
    public void  printtaxidetails(){
        System.out.println("Taxi"+this.id+"toatal earnings"+this.totalearnings);
        System.out.println("TaxiID    BookingID    CustomerID    From    To    PickupTime    DropTime    Amount");
        for(String trip : trips)
        {
            System.out.println(id + "          " + trip);
        }
        System.out.println("--------------------------------------------------------------------------------------");
    }
    }

