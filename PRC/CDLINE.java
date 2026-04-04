public class CDLINE{
	public static void main(String x[]){
		int num1 , num2;
		num1 = Integer.parseInt(x[0]);
		num2 = Integer.parseInt(x[1]);
	
		String result = num1 > num2 ? " num1 is greater" : " num2 is greater";
		System.out.println(result);
	}
}