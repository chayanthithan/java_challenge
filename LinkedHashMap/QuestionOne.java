import java.util.LinkedHashMap;
import java.util.Map;

class QuestionOne{
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> lhm=new LinkedHashMap<>(5){
            protected boolean removeEldestEntry(Map.Entry e){
                return size()>5;
            }
        };

        lhm.put(1, "A");
        lhm.put(2, "B");
        lhm.put(4, "D");
        lhm.put(3, "C");
        
        lhm.put(5, "E");

        // for(Map.Entry m:lhm.entrySet()){
        //     System.out.println(m.getKey()+" "+m.getValue());
        // }

        // System.out.println(lhm.get(1));
        // System.out.println(lhm.get(2));
        lhm.get(1);
        lhm.get(2);
        lhm.get(3);
        lhm.get(4);
        
        lhm.put(6, "F");
        for(Map.Entry m:lhm.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }


    }
}