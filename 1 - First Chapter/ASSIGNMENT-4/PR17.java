//Q17. Write a Java program to convert seconds to hours, minutes and seconds. 



public class PR17{
	public static void main(String args[])
	{
		int seconds = 20000;
		float minutes = seconds / 60f;
		float hours = seconds / 3600f;
		System.out.println(seconds+" seconds in minutes are "+minutes);
		System.out.println(seconds+" seconds in hours are "+hours);
	}
}