public class Q10 {
    public static void main(String x[]){
      /* Q10. Write a java program to print this pattern.
		
        *  *  *  *  *  *  *  *  *
		   *  *  *  *  *  *  *
		      *  *  *  *  *
			     *  *  *
			        * 

       */  
    int n = 5;
    int stars = 9;
    for(int i = 1 ; i <= n ; i++){
    
        for(int s = 1 ; s <= i ; s++){
            System.out.print("  ");
        }
        
        for(int j = 1 ; j <= stars ; j++){
            System.out.print("* ");
        }
        System.out.println();
        stars -= 2; 
    }
                  
    }
}
