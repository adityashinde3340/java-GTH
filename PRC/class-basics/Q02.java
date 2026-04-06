/*2. Implement a Calculator
Create a class Calculator with methods add, subtract, multiply, and divide for two numbers. Call them from the main method and print results.
Explanation: Teaches basic arithmetic operations using methods.
*/
class Calculator{
   void add(int n1 , int n2){
      System.out.println("result = "+(n1 + n2));
   }
}
public class Q02{
   public static void main(String x[]){
    Calculator obj = new Calculator();
    //System.out.println(-----------------);
    obj.add(45 , 78);
   }
}
