package Taxi_onceagain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Booking {
    public  static void booktaxi(int id,char pickupoint,char droppoint,Taxi obj,int pickuptime){
        char nextspot= droppoint;
        int nextfreetime;
        int distancebetweenpickupanddrop=Math.abs((droppoint-'0')-(pickupoint-'0'))*15;
        int earnings=(distancebetweenpickupanddrop-5)*10+100;
        int droptime=Math.abs((droppoint-'0')-(pickupoint-'0'))+ pickuptime;
        nextfreetime=droptime;
        String tripdetail=id+"              "+id+"              "+pickupoint+"              "+droppoint+"               "+pickuptime+"              "+droptime+"            "+earnings;
        obj.setdetails(true,nextspot,obj.totalearnings+earnings,nextfreetime,tripdetail);
        System.out.println("Taxi"+obj.id+"booked");
    }
    public static List<Taxi> createtaxis(int n){
        List<Taxi> taxis=new ArrayList<Taxi>();
        for (int i = 1; i <=n ; i++) {
            Taxi t=new Taxi();
            taxis.add(t);


        }
        return taxis;
    }
    public static List<Taxi> getfreetaxis(List<Taxi> taxis,char pickupoint,int pickuptime){
        List<Taxi> freetaxis=new ArrayList<Taxi>();
        for(Taxi t :taxis){
            if(t.freetime<=pickuptime && Math.abs((t.currentspot-'0')-(pickupoint-'0'))<=pickuptime-t.freetime){
                freetaxis.add(t);
            }
        }
        return freetaxis;
    }
    public static List<Taxi> getclosesttaxi(List<Taxi> freetaxis,char pickuppoint){
        int min=999;
        List<Taxi> closesttaxi=new ArrayList<Taxi>();
        for(Taxi s:freetaxis){
            if(min>Math.abs((s.currentspot-'0')-(pickuppoint-'0'))){
                min=Math.abs((s.currentspot-'0')-(pickuppoint-'0'));
                closesttaxi.add(s);
            }
        }
        return closesttaxi;
    }
    public static void main(String[] args) {
        List<Taxi> taxis=createtaxis(4);
       Scanner in= new Scanner(System.in);
       int id=1;
       while(true){
           System.out.println("0-> Book Taxi");
           System.out.println("1-> Print Taxi Details");
           int choice = in.nextInt();
           switch (choice){
               case 0:
                   System.out.println("Customer id");
                   System.out.println(id);
                   System.out.println("Enter Pickup Point");
                   char pickupPoint=in.next().charAt(0);
                   System.out.println("Enter Drop Point");
                   char dropPoint=in.next().charAt(0);
                   System.out.println("Enter pickup time");
                   int pickuptime=in.nextInt();



                   if(pickupPoint<'A'||dropPoint>'F'||pickupPoint>'F'|| dropPoint<'A'){
                       System.out.println("you have to enter bettween A-F");
                   }
                   List<Taxi> freetaxis=getfreetaxis(taxis,pickupPoint,pickuptime);
                   if(freetaxis.size()==0){
                       System.out.println("no taxi can be alloted");
                       return;
                   }
                   // to find closest taxi
                   List<Taxi> closesttaxi=getclosesttaxi(freetaxis,pickupPoint);
                   Taxi obj =null;
                   int earning=Integer.MAX_VALUE;
                   for(Taxi t : closesttaxi){
                        if(t.totalearnings<earning){
                            earning=t.totalearnings;
                            obj=t;
                        }
                   }
                   booktaxi(id,pickupPoint,dropPoint,obj,pickuptime);
                   id++;
                   break;

               case 1:
                   for(Taxi s:taxis){
                       s.printtaxidetails();
                   }
                   break;

               default:
                   return;
           }
       }
    }
}
