public class NestedTryExample {
    public static void main(String[] args) {
        int a=100/0;
        int array[]=new int[5];
        try{
            try{
            System.out.println(a);
        }catch(ArithmeticException e){
            System.out.println(e);
        }
        try{
            array[5]=4;
        }catch(NullPointerException e){
            System.out.println(e);
        }
     }catch(Exception e){
        System.out.println(e);
     }
    }
}
