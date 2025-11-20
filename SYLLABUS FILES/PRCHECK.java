import java.util.Scanner;

public class PRCHECK{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter MArks Of Four Subs : ");
		int s1 , s2 , s3 , s4 ,s5 , s6;
		s1 = sc.nextInt();
		s2 = sc.nextInt();
		s3 = sc.nextInt();
		s4 = sc.nextInt();
		s5 = sc.nextInt();
		s6 = sc.nextInt();
		float pc = s1+s2+s3+s4+s5+s6 / 5;
		String result = (pc > 40) ? "Pass "+pc : "fail "+pc;
		System.out.println(result);
	}
}