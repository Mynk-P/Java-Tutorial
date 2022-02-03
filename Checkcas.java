public class Checkcas {
    public static void main(String[] args){
        char grade = 'D';
        switch(grade){
            case 'A':
            System.out.println("gazab");
            // break keyword we use not to check other cases if one condition already matched. 
            break;
            case 'B':
            System.out.println("thik hai");
            break;
            case 'C':
            System.out.println("abe chirand hai");
            break;
            default:
            System.out.println("Kuch bhi");

        }
        
    }
}
