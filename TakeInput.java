// Scanner class is inside java.util pacakge
import java.util.Scanner;

public class TakeInput {
    public static void main() {
        // To take a input from the user we have to use Scanner Class.
        // To create a class we have to create a object.
        // Here sc is name of object 
        // Scanner is non primitive datatype.
        /*
           Primitive Datatype :- Those whose value already defined by java.
           Non-Primmitive Datatype :- Those which we created by ourself and those are not defined by java.
        */ 
        Scanner User = new Scanner(System.in);
        int age = User.nextInt(); 
        System.out.println(age);
    }
}
