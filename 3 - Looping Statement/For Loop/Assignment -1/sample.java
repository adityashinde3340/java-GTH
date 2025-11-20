/* Q2. WAP to print the fibonacci series up to n
	0 1 1 2 3 5 8 */
import java.util.Scanner;

class sample{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter number of cal :: ");
	int n = sc.nextInt();
    int a = 0;
	int b = 1;
	int sum = 0;
	System.out.print(a+" "+b+" ");
	for(int i = 3; i<=n ; i++){
		sum = a + b;
	    System.out.print(sum+" ");
		a = b;
		b = sum;
    }	
	}	
}