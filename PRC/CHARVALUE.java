//checking the size of char datatype
public class CHARVALUE{
	public static void main(String x[]){
		int charSize = Character.SIZE;
		System.out.println("Size of char = "+charSize+" bits / "+(charSize / 8)+" byte");
		int charMinValue = Character.MIN_VALUE;
		int charMaxValue = Character.MAX_VALUE;
		System.out.println("Min Value of char is "+charMinValue);
		System.out.println("Max Value of char is "+charMaxValue);
	}
}
