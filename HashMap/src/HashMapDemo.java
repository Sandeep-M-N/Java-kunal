import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap hm = new HashMap<>();
        hm.put("nellai exp",1900);
        hm.put("kovai exp",2100);
        hm.put("mumbai exp",2000);
        hm.put("banglore exp",2100);
        System.out.println(hm);
        Set h = hm.entrySet();
        System.out.println(h);
        Iterator i =h.iterator();
        while(i.hasNext()){
            Object o = i.next();
            Map.Entry e =(Map.Entry) o;
            Object time= e.getValue();
            Object expname=e.getKey();
            if(time.equals(2100)){
                ;
            }
        }
    }
}

