/*
Write a java to Create class name as Food with using data memberfid,fname,fprice, 
fcategory using do while and switch case.
create array of object of size 5 ,store the food details in it and perform following operations.
	
	1 : Add All Food details.
	2 : Display All Food details.
	3 : Display Bill Details :
		1 :  Bill Without Gst.
		2 : Bill With 18% Gst.

*/

class Food{
    private int memberfid;
    private String fname;
    private double fprice;
   private String fcategory;
   
   public Food(int memberfid , String fname , double fprice ,String fcategory){
	   this.memberfid = memberfid;
	   this.fname = fname;
	   this.fprice = fprice;
	   this.fcategory = fcategory;
   }	   
   
   public int getMemberfid(){
	   return memberfid;
   }
   
   public String getFname(){
	   return fname;
   }
   
   public double getPrice(){
	   return fprice; 
   }
   public String getFcategory(){
	   return fcategory;
   }
}

public class Q05{
	public static void main(String x[]){
	Food[] fl =  new Food[5];
	
           fl[0] =  new Food(101, "Pizza", 250.50, "FastFood");
           fl[1] =  new Food(102, "Burger", 120.00, "FastFood");
           fl[2] = new Food(103, "Biryani", 180.75, "MainCourse");
           fl[3] =  new Food(104, "Pasta", 200.25, "Italian");
           fl[4]= new Food(105, "IceCream", 90.00, "Dessert");
		   
		   
		   
		for(int i = 0 ; i < fl.length ; i++){
			System.out.println("food Name is"+fl[i].getFname());
			System.out.println("food category is "+fl[i].getFcategory());
			System.out.println("food Number is "+fl[i].getMemberfid());
			System.out.println("food price is "+fl[i].getPrice());
			System.out.println();
			
			
		} 
		
	}
}