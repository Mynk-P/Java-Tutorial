public class LogicalOperators {
    public static void main(String[] args) {
        // Logical Operators :- && , || , !
        // Logical &&
        int age = 12;
        if(age>18 && age<50){
            System.out.println("you can vote");
        }
        else{
            System.out.println("You can not vote");
        }   
        // Logical ||     
        if(age>18 || age<155){
            System.out.println("vote de");
        }
        else{
            System.out.println("abe vote mat de");
        }        
    }
}
