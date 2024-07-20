package RailwayReservation;
import java.util.*;
import java.lang.Iterable;
public class TicketBook {
    static  int LB =21;
    static int MB=21;
    static int UB=21;
    static int RAC=9;
    static int WL=10;
    static List<Integer> Lbp= new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21));
    static List<Integer> Mbp= new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21));
    static List<Integer> Ubp= new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21));
    static List<Integer> racp = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9));
    static List<Integer> wlp = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
    static Queue<Integer> wlist= new LinkedList<Integer>();
    static Queue<Integer> raclist = new LinkedList<Integer>();
    static List<Integer> bookedticketlist=new ArrayList<Integer>(); // to delete or cancel the tickets using passenger id.
    static Map<Integer,Passenger> passenger_stored_data=new HashMap<Integer,Passenger>();

    public void bookTicket(Passenger p,int snumber,String allotedberth){
        p.number=snumber;
        p.alloted=allotedberth;
        passenger_stored_data.put(p.passengerid,p);
        bookedticketlist.add(p.passengerid);
        System.out.println("passenger id:" + p.passengerid);
        System.out.println("passenger name:" + p.name);
        System.out.println("passenger age:" + p.age);
        System.out.println("passenger gender:"+ p.gender);
        System.out.println("berth alloted:" +snumber + allotedberth );
        System.out.println("---------------------booked sucessfully");
    }
    public void RacTicket(Passenger p,int snumber,String RacBerth){
        p.number=snumber;
        p.alloted=RacBerth;
        passenger_stored_data.put(p.passengerid,p);
        raclist.add(p.passengerid);

        System.out.println("passenger id:" + p.passengerid);
        System.out.println("passenger name:" + p.name);
        System.out.println("passenger age:" + p.age);
        System.out.println("passenger gender:"+ p.gender);
        System.out.println("berth alloted:" +snumber + RacBerth );
        System.out.println("---------------------rac birth given");

    }
    public void wlTicket(Passenger p,int snumber,String WlBerth){
        p.number=snumber;
        p.alloted=WlBerth;
        passenger_stored_data.put(p.passengerid,p);
        wlist.add(p.passengerid);
        System.out.println("passenger id:" + p.passengerid);
        System.out.println("passenger name:" + p.name);
        System.out.println("passenger age:" + p.age);
        System.out.println("passenger gender:"+ p.gender);
        System.out.println("berth alloted:" +snumber + WlBerth );
        System.out.println("---------------------waited list given");


    }
    public void passengerdetails(){
        if(passenger_stored_data.isEmpty()){
            System.out.println("no passenger detail found");
            return;
        }
        else{
            for(Passenger p: passenger_stored_data.values()){
                System.out.println("passenger id:"+p.passengerid);
                System.out.println("passenger name:"+p.name);
                System.out.println("passenger age:"+p.age);
                System.out.println("passenger gender:"+p.gender);
                System.out.println("alloted berth:"+p.number+p.alloted);
            }
        }
    }
    public void CancelTicket(int passengerId){
        Passenger p = passenger_stored_data.get(passengerId);
        passenger_stored_data.remove(passengerId);
        bookedticketlist.remove(passengerId);
        int psnumber=p.number;
        System.out.println("------------cancelled sucessfully");
        if(p.alloted.equals("L")){
            Lbp.add(psnumber);
            LB++;
        }
        else if(p.alloted.equals("M")){
            Mbp.add(psnumber);
            MB++;
        }
        else if(p.alloted.equals("U")){
            Ubp.add(psnumber);
            UB++;
        }
        if(raclist.size()>0){
            Passenger passengerfromRAC=passenger_stored_data.get(raclist.poll());
            int pracsnumber=passengerfromRAC.number;
            racp.add(pracsnumber);
            raclist.remove(passengerfromRAC.passengerid);
            RAC++;
        }
        if(wlist.size()>0){
            Passenger pfwl=passenger_stored_data.get(wlist.poll());
            int pwlnumber = pfwl.number;
            wlp.add(pwlnumber);
            wlist.remove(pfwl.passengerid);

            pfwl.number=racp.get(0);
            pfwl.alloted="RAC";
            racp.remove(0);
            raclist.add(pfwl.passengerid);
            WL++;
            RAC--;


        }

    }


}
