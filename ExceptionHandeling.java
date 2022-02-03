public class ExceptionHandeling{
    public static void main(String[] args) {
        System.out.println("Exception Handeling");
        int a[] = new int[5];
        try{
            System.out.println(2/0);
        }
        // Exception will catch any type of error 
        catch(Exception e){
          System.out.println("error le le");
          System.out.println(e.getLocalizedMessage());
        }
    }
}