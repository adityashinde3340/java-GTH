public class Q01{
	public static void main(String x[]){
		int[] arr = {5, 12, 7, 3, 19};
int max = arr[0];
for(int i = 1; i < arr.length; i++) {
    if(arr[i] > max) {
        max = arr[i];
    }
}
System.out.println(max);

	}
}