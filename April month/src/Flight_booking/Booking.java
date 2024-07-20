package Flight_booking;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Booking {
    public static void bookflight(int id,int seats,Flight obj){
        int passengerid=id;
        int newseats;
        int totalprice=obj.price*seats;
        int newprice=obj.price+(seats*200);
        String trips=passengerid+"                   "+obj.id+"                   "+seats+"                   "+totalprice;
        newseats=obj.seats-seats;
        obj.setdetails(passengerid,newseats,newprice,trips);
        System.out.println("Flight id "+obj.id+" booked successfully");

    }

    public static  List<Flight> createflights(int n){
        List<Flight> flights=new ArrayList<Flight>();
        for (int i =1 ; i <=n ; i++) {
            Flight f =new Flight();
            flights.add(f);

        }
        return flights;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Integer> passengerlist = new ArrayList<>();
        int id=1;
        List<Flight> flights= createflights(2);
        Flight obj=null;
        while(true){
            System.out.println("1 ->Book ticket");
            System.out.println("2 ->Cancel ticket");
            System.out.println("3 ->Print details");
            int choice=in.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Passenger id");
                    System.out.println(id);
                    System.out.println("enter the flight id");
                    int flightchoice= in.nextInt();
                    if(flightchoice<1 || flightchoice>2){
                        System.out.println("enter the flight choice between 1-2 ");
                    }
                    System.out.println("enter the no of seats");
                    int seats= in.nextInt();
                   for(Flight f : flights){
                       if(flightchoice==f.id){
                           obj=f;
                           bookflight(id,seats,obj);
                       }
                   }
                   passengerlist.add(id);
                   id++;
                   break;

                case 2:
                    System.out.println("enter the pasenger id");;
                    int inputid= in.nextInt();

//                    System.out.println("Enter the flight id");
//                    int flightidinput=in.nextInt();
//                    for(Flight f:flights) {
//                       if(inputid==f.passengerid){
//                           obj=f;
//                           cancelflight(obj);
//
//                       }
//                    }


                case 3:
                    for(Flight f:flights){
                        f.printdetails();
                    }
                    break;

                default:
                    return;
            }
        }
    }
}
