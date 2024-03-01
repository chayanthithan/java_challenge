public class JavaExceptionExample2 {
    public static void main(String[] args) {
        try{
            int a[]=new int[5];
            try{
                
            a[5]=30/0;
            }catch(ArithmeticException e){
                System.out.println(e);
            }

            try{

                a[5]=4;
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println(e);
            }
        }catch(Exception e){
            System.out.println(e);
         }
         //catch(ArithmeticException e){
        //     System.out.println(e);
        // }
        //Exception should be at the last 
        
    }
}
