import java.util.Scanner;
public class PR24{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter one Number : ");
	int num = sc.nextInt();
	int square = num*num;
	if (num == ((square / 100) + (square % 10))){
		System.out.println(num+" is a neon number");
	}
	else{
		System.out.println(num +" is not a neon number");
	}
	}
}