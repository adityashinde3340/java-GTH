import java.util.Scanner;
public class ARR3{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	int a[] = new int[5];
    System.out.println("Enter elements in array : ");
	for(int i = 0 ; i < a.length ; i++){
		a[i] = sc.nextInt();
	}
	
	
	System.out.println();
    for(int i = 0 ; i < a.length ; i++){
		System.out.println(a[i]);
	}	
	System.out.println();
	int max = a[0]; 
	int min = a[0];
	  for(int i = 0 ; i < a.length ; i++){
	        if(max < a[i])
			{
				max = a[i];
			}				
	  }
	  
	System.out.println();
    
	for(int i = 0 ; i < a.length ; i++){
		if(min > a[i]){
			max = a[i];
		}
	}
	
	
	System.out.println("min = "+min);
	System.out.println("max = "+max);
	
	System.out.println();
	
	System.out.println("Enter index elemenet : ");
	int search = sc.nextInt();
	for(int i = 0 ; i < a.length ; i++){
		if(search == a[i])
		{
			System.out.println("index pos = "+(i+1));
		}
	}
	}
}