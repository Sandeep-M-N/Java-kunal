package Taxi_application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Booking {
    public static void booktaxi(int id,char pickup,char droppoint,int pickuptime,Taxi obj){
       Taxi bookedtaxi=obj;
        int distancebetweenpickupanddrop=Math.abs((pickup-'0')-(droppoint-'0'))*15;
        int earnings=(distancebetweenpickupanddrop-5)*10+100;
        int droptime=Math.abs((pickup-'0')-(droppoint-'0'))+ pickuptime;
        int nextfreetime=droptime;
        char nextspot=droppoint;
        String tripdetail=id+"          "+id+"          "+pickup+"          "+droppoint+"           "+pickuptime+"          "+droptime+"            "+earnings;
        bookedtaxi.setdetails(true,nextspot,nextfreetime,bookedtaxi.totalearnings+earnings,tripdetail);
        System.out.println("taxi"+bookedtaxi.id+"booked");
    }

    public static List<Taxi> createtaxis(int n){
        List<Taxi> taxis = new ArrayList<Taxi>();
        for (int i = 1; i <=n ; i++) {
            Taxi t = new Taxi();
            taxis.add(t);

        }
        return taxis;
    }
    public static List<Taxi> getfreetaxis(List<Taxi> taxis, int pickuptime, char pickup) {
        List<Taxi> freetaxis = new ArrayList<Taxi>();
        for(Taxi t:taxis){
            if(t.freetime<=pickuptime &&(Math.abs(t.currentspot-'0')-(pickup-'0')<=pickuptime-t.freetime)){
                freetaxis.add(t);
            }
        }
        return freetaxis;

    }



    public static void main(String[] args) {

        int min=999;
        List<Taxi> taxis = createtaxis(4);
        int id=1;
        Taxi obj =null;
        Scanner in = new Scanner(System.in);
        while(true){
            System.out.println("0-> to book taxi");
            System.out.println("1-> to print taxi details");
            int choice= in.nextInt();
            switch(choice){
                case 0:
                    System.out.println("call taxi booking");
                    System.out.println("customer id");
                    System.out.println(id);
                    System.out.println("enter pick up point");
                    char pickup=in.next().charAt(0);
                    System.out.println("enter drop point");
                    char droppoint=in.next().charAt(0);
                    System.out.println("enter pickup time");
                    int pickuptime=in.nextInt();


                    if(pickup<'A'|| droppoint>'F'|| pickup>'F'|| droppoint<'A'){
                        System.out.println("enter the pickup & drop points between A-F");
                        return;
                    }
                    // get all free taxis  that can reach customer on or before pickup time
                    List<Taxi> freetaxis = getfreetaxis(taxis,pickuptime,pickup);
                    if(freetaxis.size()==0){
                        System.out.println("no taxi can be alloted");
                        return;
                    }
                    // closest taxis based on earnings.
                    List<Taxi> closesttaxi=new ArrayList<Taxi>();
                    for(Taxi s:freetaxis){
                        if(min>=Math.abs((pickup-'0')-(s.currentspot-'0'))){
                            min=Math.abs((pickup-'0')-(s.currentspot-'0'));
                            closesttaxi.add(s);
                        }
                    }
                    int earning=Integer.MAX_VALUE;
                    for(Taxi m:closesttaxi){
                        if(m.totalearnings<earning){
                            earning=m.totalearnings;
                            obj=m;
                        }
                    }
                    booktaxi(id,pickup,droppoint,pickuptime,obj);
                    id++;
                    break;

                case 1:
                    for(Taxi t :taxis){
                        t.printtaxidetails();

                    }
                    break;

                default:
                    return;
            }
        }
    }


}
