//Q15. Write a java program swap two number without using third variable.
public class PR15{
	public static void main(String x[]){
		int num1 = 9 , num2 = 8;  
		System.out.println("Before Swaping num1 = "+num1+" num2 = "+num2);	
		num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;	
		System.out.println("After Swaping num1 = "+num1+" num2 = "+num2);	
	}
}