public class Q10 {
    public static void main(String[] args) {

        /* 
		*  *  *  *  *  *  *  *  *
		   *  *  *  *  *  *  *
		      *  *  *  *  *
			     *  *  *
			        *
		*/
  
        int rows = 5;     // rows
        int stars = 9;    
        for(int i = 1 ; i <= 5;i++){
			for(int j = 1 ; j<= 9 ; j++){
				if(j<=9-i && j>=2+1){
					System.out.print("* ");
				}
				else{
					System.out.print("  ");
				}
				
			}
			System.out.println();
		}
        
       
    }
}
