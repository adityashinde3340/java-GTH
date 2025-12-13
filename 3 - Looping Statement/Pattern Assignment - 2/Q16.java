public class Q16 {
    public static void main(String[] args) {
        /*Q16. Write a java program to print this pattern.

		#	#	#	#	#
		#	#
		#		#
		#			#
		#				#
        */
        // for(int s = 1 ; s <= 5; s++){
        // System.out.print("# ");
        // }   
        for(int i = 1 ; i <= 5 ; i++){
            for(int j = 1 ; j <= 5 ; j++){
              //System.out.print("* ");
              if(i == 1 || j == 1 || j == i){
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
