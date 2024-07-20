package RailwayReservation;
import java.util.*;
public class Main {
    public static void bookTicket(Passenger p){
        TicketBook tb= new TicketBook();
        //-------------------------------------------------
        if(TicketBook.WL==0){
            System.out.println("no tkts available");
            return;
        }
        //-------------------------------------------------


        if((p.bp.equals("L") && TicketBook.LB>0) || (p.bp.equals("M") && TicketBook.MB>0) || (p.bp.equals("U") && TicketBook.UB>0) ){
            if(p.bp.equals("L")){
                System.out.println("lower berth given");
                tb.bookTicket(p,(TicketBook.Lbp.get(0)),"L");
                TicketBook.Lbp.remove(0);
                TicketBook.LB--;
            }
            else if(p.bp.equals("M")){
                System.out.println("middle berth given");
                tb.bookTicket(p,(TicketBook.Mbp.get(0)),"M");
                TicketBook.Mbp.remove(0);
                TicketBook.MB--;
            }
            else if(p.bp.equals("U")){
                System.out.println("upper berth given");
                tb.bookTicket(p,(TicketBook.Lbp.get(0)),"U");
                TicketBook.Ubp.remove(0);
                TicketBook.UB--;
            }
            else if(TicketBook.LB>0){
                System.out.println("lower berth given");
                tb.bookTicket(p,(TicketBook.Lbp.get(0)),"L");
                TicketBook.Lbp.remove(0);
                TicketBook.LB--;
            }
            else if(TicketBook.MB>0){
                System.out.println("middle berth given");
                tb.bookTicket(p,(TicketBook.Mbp.get(0)),"M");
                TicketBook.Mbp.remove(0);
                TicketBook.MB--;
            }
            else if(TicketBook.UB>0){
                System.out.println("upper berth given");
                tb.bookTicket(p,(TicketBook.Lbp.get(0)),"U");
                TicketBook.Ubp.remove(0);
                TicketBook.UB--;
            }
            else if(TicketBook.RAC>0){
                System.out.println("RAC given");
                tb.RacTicket(p,(TicketBook.racp.get(0)),"RAC");
                TicketBook.racp.remove(0);
                TicketBook.RAC--;
            }
            else if(TicketBook.WL>0){
                System.out.println("you are in waiting list");
                tb.wlTicket(p,(TicketBook.wlp.get(0)),"WL");
                TicketBook.wlp.remove(0);
                TicketBook.WL--;
            }
        }
    }
    public static void cancelticket(int id){
        TicketBook tb=new TicketBook();
        if(!TicketBook.passenger_stored_data.containsKey(id)){
            System.out.println("passenger id is not found");
        }
        else{

        }
    }
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        boolean loop = true; // intialiazation.
        while(loop){
            System.out.println("1.Book \n2.Cancel \n3.Available Tickets \n4.Booked Tickets \n5.Exit");
            int choice= in.nextInt();
            switch(choice){
                case 1:
                {
                    System.out.println("enter the passenger name");
                    String name=in.next();
                    System.out.println("enter the passenger age");
                    int age=in.nextInt();
                    System.out.println("enter passenger gender: [M,F]");
                    String gender = in.next();
                    System.out.println("enter the passenger birth preference: [L,M,U]");
                    String bp= in.next();
                    Passenger p = new Passenger(name,age,gender,bp);
                    bookTicket(p);
                    break;

                }
                case 2:
                {
                    System.out.println("enter the passenger id:");
                    int id = in.nextInt();
                    cancelticket(id);
                    break;
                }
                case 4:
                {
                    TicketBook tb=new TicketBook();
                    tb.passengerdetails();
                    break;
                }
                case 5:
                {
                    loop=false;
                    break;
                }
            }
        }
    }
}
