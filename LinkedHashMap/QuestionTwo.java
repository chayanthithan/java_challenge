import java.util.*;

class QuestionTwo {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> lhm=new LinkedHashMap<>();
        lhm.put(1, "A");
        lhm.put(2, "B");
        lhm.put(3, "C");
        lhm.put(4, "D");
        lhm.put(5, "E");

        for(Map.Entry m:lhm.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
