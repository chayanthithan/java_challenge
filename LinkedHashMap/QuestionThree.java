import java.util.*;

public class QuestionThree {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> lhm=new LinkedHashMap<>();
        lhm.put(100,"Amit");
        lhm.put(101,"chayan");
        lhm.put(102,"kumar");
        lhm.put(103,"rahul");
        //for fetching keys only
        System.out.println("keys "+lhm.keySet());
        //for fetching values and key pairs
        System.out.println(lhm.entrySet());
        //for fetching values only
        System.out.println(lhm.values());
    }
    
}
