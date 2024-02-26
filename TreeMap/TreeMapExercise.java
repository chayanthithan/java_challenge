import java.util.*;
import java.util.Map.*;

public class TreeMapExercise{
    public static void main(String[] args) {
        TreeMap<Integer,String> tMap=new TreeMap<>();//default
        TreeMap<Integer,String> TMap=new TreeMap<>(Map.of(0,"chayan",1,"dilax",2,"kisho",3,"kumar"));
      //  System.out.println(TMap.size());///it is reruen the size of the treeMap
        TMap.put(5, "tino");
        TMap.put(6, "chajen");
        // System.out.println(TMap);
        // System.out.println(TMap.lastEntry());
        // Entry<Integer,String> e=TMap.ceilingEntry(0);
        // System.out.println(e);

        for(Map.Entry m:TMap.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }

    }
}