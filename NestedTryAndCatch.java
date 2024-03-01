public class NestedTryAndCatch {
    public static void main(String[] args) {
        try{
            int a[]=new int[5];
            try{
                
            int i=100/0;
            }catch(ArithmeticException e){
                System.out.println("Arithmetic exception");
                System.out.println(e);
            }

            try{

                a[5]=4;
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Array out of bound");
                System.out.println(e);
            }
        }catch(NullPointerException e){
            System.out.println(e);
         }finally{
            System.out.println("nested try and catch completed");
         }
    }
    
}
