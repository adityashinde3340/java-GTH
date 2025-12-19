public class Q03{
	public static void main(String x[]){
	/*
	Q3. Write a Java program to display even & odd values from an array.
    Input:
    Array Size = 6
    Array Elements = 11 20 33 42 55 60
    Output:
    Even Values = 20 42 60
    Odd Values = 11 33 55

	*/	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter size : ");
	int size = sc.nextInt();
	
	System.out.println("Enter array elemenets : ");
	int arr[] = new int[size];
	
	for(int i = 0 ; i < arr.length ; i++){
		arr[i] = sc.nextInt();
	}
  
	System.out.println();
	System.out.println("Even Values = ");
	for(int i = 0 ; i < arr.length ; i++){	
		if(arr[i]%2==0){
		   System.out.print(+arr[i]);
		}
	}
	System.out.println();
	System.out.println("Odd Values = ");
	for(int i = 0 ; i < arr.length ; i++){	
		if(arr[i]%2!=0){
		   System.out.print(+arr[i]);
		}
	}
	}
}