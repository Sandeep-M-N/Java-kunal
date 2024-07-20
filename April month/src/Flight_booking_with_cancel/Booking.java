package Flight_booking_with_cancel;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Booking {
    public static void bookflight(int pid,int no_of_seats,Flight obj){
        obj.passengerid.add(pid);
        int total_price=no_of_seats*obj.price;
        obj.bookedseatspercost.add(total_price);
        int new_price=(no_of_seats*200)+obj.price;
        obj.bookedseats.add(no_of_seats);
        int new_seats= obj.seats-no_of_seats;
        String passengerdetails=pid+"               "+ obj.flightid+"               "+no_of_seats+"                 "+total_price;
        obj.passengerdetails.add(passengerdetails);
        obj.setdetails(new_seats,new_price);
        obj.summary();
    }
    public static void  cancel(int cancel_passenger_id,Flight cancelobj){
        int tickettocancel=cancelobj.passengerid.indexOf(cancel_passenger_id);
        if(tickettocancel<0){
            System.out.println("no passenger id found");
            return;
        }
        int seats=cancelobj.bookedseats.get(tickettocancel);
        int addseats= cancelobj.seats+seats;
        int newprice=cancelobj.price-(seats*200);
        cancelobj.setdetails(addseats,newprice);
        cancelobj.passengerdetails.remove(tickettocancel);
        cancelobj.passengerid.remove(tickettocancel);
        cancelobj.bookedseats.remove(tickettocancel);
        cancelobj.bookedseatspercost.remove(tickettocancel);
        cancelobj.summary();
    }
    public static List<Flight> createflights(int n){
        List<Flight> flights=new ArrayList<Flight>();
        for (int i = 1; i <=2 ; i++) {
            Flight f=new Flight();
            flights.add(f);

        }
        return flights;
    }

    public static void main(String[] args) {
        List<Flight> flights=createflights(2);
        int pid=1;
        Scanner in = new Scanner(System.in);
        while(true){
            System.out.println("1 -> Book ticket");
            System.out.println("2 -> cancel ticket");
            System.out.println("3 -> print details");
            int choice = in.nextInt();
            if(choice<1 || choice>3){
                System.out.println("you have entered wrong choice");
                return;
            }
            switch (choice){
                case 1:
                    System.out.println("passenger id");
                    System.out.println(pid);
                    System.out.println("enter the flight id");
                    int fid= in.nextInt();
                    Flight obj=null;
                    if(fid>flights.size()){
                        System.out.println("no such flights are available");
                        break;
                    }
                    for(Flight f:flights){
                        if(fid==f.flightid){
                            obj=f;
                            f.summary();
                        }
                    }
                    System.out.println("enter the no of seats");
                    int no_of_seats=in.nextInt();
                    for (Flight f:flights){
                        if(f.seats<no_of_seats){
                            System.out.println("no seats are available at this moment");
                        }
                    }
                   bookflight(pid,no_of_seats,obj);
                    pid=pid+1;
                    break;

                case 2:
                    System.out.println("enter the flight id");
                    int flightid=in.nextInt();
                    if(flightid>flights.size()){
                        System.out.println("invalid flight id");
                        break;
                    }
                    Flight canceobj=null;
                    for(Flight f:flights){
                        if(flightid==f.flightid){
                            canceobj=f;
                        }
                    }
                    System.out.println("enter the passenger id");
                    int cancel_passenger_id= in.nextInt();
                    cancel(cancel_passenger_id,canceobj);
                    break;
                case 3:
                    for(Flight f: flights){
                        f.printdetails();
                    }
                    break;


                default:
                    return;



            }

        }
    }
}
