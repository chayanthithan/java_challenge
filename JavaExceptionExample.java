class JavaExceptionExample{
    public static void main(String[] args) {
        
        try{
            int array[]={1,2,3};
            System.out.println(array[3]);
           int data=100/0;
            String s=null;
            System.out.println(s.length());
         }
         //catch(ArithmeticException e){
        //     System.out.println(e);
        // }
        catch(NullPointerException e){
            System.out.println(e);
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("checkout your array size");
        }
        System.out.println("remaining code");
    }
}