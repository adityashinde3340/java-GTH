public class Q02{
	public static void main(String x[]){
	// Hollow Rectangle
    for(int i = 1; i<=5;i++){
		for(int j = 1; j <= 5;j++){
			//System.out.print("*");
			if(i == 2 || i == 3 || i == 4){
			  if(j == 1 || j ==5){
				 System.out.print(" * ");
			  }	
			  else{
				 System.out.print("   ");
			  }
			}
            else{
				System.out.print(" * ");
			}			
		}
		System.out.println();
	}	
	}
}