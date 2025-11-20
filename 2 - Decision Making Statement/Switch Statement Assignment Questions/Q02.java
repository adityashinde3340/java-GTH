import java.util.Scanner;

public class Q02{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter two numbers : ");
	int num1 = sc.nextInt();
	int num2 = sc.nextInt();
    System.out.println(" --> / , * , + , - ");
	char ch = sc.next().charAt(0);
	switch(ch){
		case '+':System.out.println(num1 + num2);
		break;
		case '-':System.out.println(num1-num2);
		break;
		case '*':System.out.println(num1*num2);
		break;
		case '/':System.out.println(num1 / num2);
		break;
	}
	}
}