//Q14. Write a java program swap two number using third variable.
public class PR14{
	public static void main(String x[]){
	int firstNum = 10;
	int secondNum = 30;
	int temp;
	
	System.out.println("Before swaping firstNum = "+firstNum+" secondNum = "+secondNum);
	
	temp = firstNum;
	firstNum = secondNum;
	secondNum = temp;
	
	System.out.println("After swaping firstNum = "+firstNum+" secondNum = "+secondNum);
	}
}