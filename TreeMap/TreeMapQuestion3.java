import java.util.TreeMap;

public class TreeMapQuestion3 {
    public static void main(String[] args) {
        TreeMap<Integer,String> tmap=new TreeMap<>();
        tmap.put(100, "Amit");
        tmap.put(101, "Ravi");
        tmap.put(102, "Vijay");
        tmap.put(103, "Rahul");

        System.out.println("desendingMap "+tmap.descendingMap());
       //value pairs whose keys are less than or equal to the specified key.  
        System.out.println("headMap :"+tmap.headMap(101,true));
       //value pairs whose keys are greater than or equal to the specified key.  
       System.out.println("tailMap :"+tmap.tailMap(102,true));
        //value pairs exists in between the specified key.  
        System.out.println("subMap: "+tmap.subMap(100, false, 102, true));   
   
    }
}
