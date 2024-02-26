import java.util.*;

public class TreeMapQuestion2 {
    public static void main(String[] args) {
        TreeMap<String,String> tmap=new TreeMap<>();
        tmap.put("A", "Apple");
        tmap.put("B", "Ball");
        tmap.put("D", "Dog");
        tmap.put("C", "Cat");
        tmap.put("E", "Eliphant");
        System.out.println("decensing order\n"+tmap.descendingMap());
        System.out.println("before invoking remove() method");
        for(Map.Entry m:tmap.entrySet()){
            System.out.println(m.getKey()+" for "+m.getValue());
        }
        System.out.println("after remove method calling");
        tmap.remove("A");
        for(Map.Entry m:tmap.entrySet()){
            System.out.println(m.getKey()+" for "+m.getValue());
        }
    }
}
