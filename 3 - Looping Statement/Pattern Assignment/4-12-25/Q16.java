public class Q16 {
    public static void main(String[] args) {
        int n = 5; // number of rows
        
        for (int i = 0; i < n; i++) {
 
            System.out.print("#");
            
         
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            
           
            System.out.print("#");
            
            
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            
           
            System.out.print("#");
            
          
            for (int j = 0; j < i; j++) {
                System.out.print("   ");
            }
         
            System.out.print("#");
            
          
            for (int j = 0; j < i; j++) {
                System.out.print("    ");
            }
            
           
            System.out.println("#");
        }
    }
}