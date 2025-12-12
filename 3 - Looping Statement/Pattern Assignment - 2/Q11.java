public class Q11 {
    public static void main(String x[]){
    /*
    Q11. Write a java program to print this pattern.

		*
        *	*
        * 		*
        *  			*
        *	*	*	*	*
    */  
    int n = 5; 
    for(int i = 1 ; i <= n; i++){
        for(int j = 1 ; j <= i ; j++){
            if(j == 1 || j == i || i == n){
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
