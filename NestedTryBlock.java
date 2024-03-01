public class NestedTryBlock {
    public static void main(String[] args) {
        //outer--this is main try
        try{
            //inner try block 1
            try{
                //inner try block 2
                try{
                    int arr[]={1,2,3,4};
                    System.out.println(arr[10]);
                }catch(ArithmeticException e){
                    System.out.println("Arithmetic exception");
                    System.out.println("inner try block 2");
                }
            }catch(ArithmeticException e){
                System.out.println("Arithmetic exception");
                System.out.println("inner try block 1");
            }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array outof bound");
            System.out.println("inner try bllock 3");
        }catch(Exception e){
            System.out.println("Exception");
            System.out.println("handle by main try-block ");
        }
    }
}
