//Q8. WAP to input number from keyboard and search digit present in number or 
//    not.


import java.util.Scanner;

public class Q08{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("enter a number : ");
	int num = sc.nextInt();
	int tt = num;
	System.out.println("enter searching number : ");
	int search_num = sc.nextInt();
	
	int a = 0, count = 1;
	while(num > 0){
	a = num % 10;
    num = num / 10;
	count += 1;
      if(a == search_num || a == num)
	  {
		System.out.println(search_num+" is at "+count+" position in "+tt);
		break;
	  }	
	  else{
		System.out.println("false");  
		break;
	  }
	  
	}
	}
}