public class Arrays {
    public static void main(String[] args) {
        // We use array to store same type of data together in a continous way.
        // we use new keyword to create a object  
        int marks[] = new int[5] ;
        marks[0] = 23;
        marks[1] = 78;
        marks[2] = 35;
        marks[3] = 12;
        marks[4] = 70;
        for(int i = 0 ; i<marks.length;i++){
            System.out.println(marks[i]);
        }

    }
}
