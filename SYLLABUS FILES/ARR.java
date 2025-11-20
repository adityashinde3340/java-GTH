public class ARR{
	public static void main(String x[]){
		//dataType[] arrayName;
		int [] nums = {45,45,4,9,6,78};
		for (int i = 0 ; i <= nums.length -1; i++)
		{
			if (nums[i]%2 == 0){
				System.out.println("Even = "+nums[i]);
			}
		}
	}
}