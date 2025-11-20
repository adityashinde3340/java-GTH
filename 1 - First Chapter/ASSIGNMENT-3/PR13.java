//Q13. Write a java program to calculate the compound intrest.

public class PR13{
	public static void main(String x[]){
    int amount = 10000;
    int years = 3;
    int rateOfIntrest = 2;
    double compoundIntrest = amount * Math.pow((1 + rateOfIntrest / 100), years);
	System.out.println("compound interst = "+compoundIntrest);
    }
}