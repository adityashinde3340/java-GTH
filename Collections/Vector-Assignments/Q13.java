/*
Q13.Create Product class:
productId
productName
price
Store products in Vector and display products with price less than 500.
Description
Check condition:
price < 500
Input
P1 Mouse 450
P2 Keyboard 700
P3 PenDrive 350
P4 Monitor 9000
Output
Products below 500:
P1 Mouse 450
P3 PenDrive 350
*/
import  java.util.*;
class Product{
   private int productId;
   private String productName;
   private int Price;
   
   public Product(int productId , String productName ,int Price){
     this.productId = productId;
     this.productName = productName;
     this.Price = Price;
   }
   
   public int getPid(){
     return productId;
   }
   public String getPname(){
     return productName;
   }
   public int getPrice(){
     return Price;
   }
}
public class Q13{
   public static void main(String x[]){
   Vector<Object> v1 = new Vector<>();
   v1.add(new Product (1 ,  "Mouse" , 450));
   v1.add(new Product (2 , "Keyboard", 700));
   v1.add(new Product (3 , "PenDrive" ,  350));
   
   for(Object o:v1){
      Product e= (Product)o;
      if(e.getPrice() < 500){
         System.out.println(e.getPid()+" "+e.getPname()+" "+e.getPrice());
      }
   }
   
   }
}
