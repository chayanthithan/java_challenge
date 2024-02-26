import java.util.*;
import java.util.Map.*;
class Book {
    int id,quality;
    String name,author,publisher;
    public Book(int id,int quality,String name,String author,String publisher){
        this.id=id;
        this.name=name;
        this.author=author;
        this.quality=quality;
        this.publisher=publisher;
    }
    
}
class MapExample{
    public static void main(String[] args) {
        Map<Integer,Book> map=new TreeMap<Integer,Book>(); 
         Book b1=new Book(101, 8, "HeadFirstJava", "chayankumar", "poobalasingam book shop");
         Book b2=new Book(102, 10, "HeadFirstC#", "chayankumar", "ramanan book shop");
         Book b3=new Book(103, 9, "HeadFirstC", "chayankumar", "karikanan book shop");
    
        map.put(1, b1);
        map.put(2, b2);
        map.put(3, b3);

        for(Map.Entry<Integer,Book> m:map.entrySet()){
            System.out.println("--------------------------");
            System.out.println(m.getKey()+" Details");
            System.out.println("------------------------");
            Book b=m.getValue();
            System.out.println("id "+b.id+"\nname "+b.name+"\nauthor "+b.author+"\npublisher "+b.publisher);
        }

    
    }
}
