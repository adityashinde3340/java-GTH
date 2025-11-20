import java.util.*;
class Q57{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int level=sc.nextInt();
    switch(level){
      case 1: System.out.println("Junior (20,000 - 30,000)"); break;
      case 2: System.out.println("Mid (31,000 - 50,000)"); break;
      case 3: System.out.println("Senior (51,000 - 80,000)"); break;
      default: System.out.println("Invalid");
    }
  }
}
