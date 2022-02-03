public class Loops {
    public static void main(String[] args) {
        // Loops :- for , while , do-while
        // For Loop
        for(int i = 0 ; i<120;i++){
            System.out.println("Chal za loop" + " " + i);
        }
        
        // While Loop
        int x = 28;
        while(true){
              System.out.println(x);
              x++;
              if(x>40){
                  break;
              }
        }

        // Do-While Loop
        int a = 23;
        do{
            System.out.println(a);
            a++;
        }
        while(a<100);

    }
}
