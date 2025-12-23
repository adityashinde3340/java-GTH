import java.util.Scanner;
	public class PR14{
		public static void main(String x[]){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size : ");
		int size = sc.nextInt();
	
		System.out.println("Input 5 elements in the array : ");
		int arr[] = new int[size];
		for(int i = 0 ; i < arr.length ; i++){
			arr[i] = sc.nextInt();
		}
		System.out.println();
		
		for(int i = 0 ; i < arr.length ; i++){
			for(int j = i+1 ; j < arr.length ; j++){
				if(arr[i] == arr[j]){
					arr[i] = -1;
				}
			}
		}
		
		System.out.print("Unique elements = ");
		for(int i = 0 ; i < arr.length ; i++){
			//if(arr[i] != -1){
			//    System.out.print(arr[i]+" ");
			//} 
			if(arr[i] == -1){
				continue;
			}
			else{
				System.out.print(arr[i]+" ");
			}
		}
	
		}
	}