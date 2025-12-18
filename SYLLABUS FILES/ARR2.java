import java.util.Scanner;
public class ARR2{
	public static void main(String x[]){
    Scanner sc = new Scanner(System.in);
	int arr[] = {122,45,784,45,54};
	System.out.println(" size :"+arr.length);
	int max = arr[0];
	for(int i = 1; i <= arr.length -1; i++){
		if(max<arr[i]){
			max = arr[i];
		}
	}
	System.out.println("max = "+max);
	}
}