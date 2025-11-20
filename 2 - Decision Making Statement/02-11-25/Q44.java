//Q44. Write a java program to input basic salary of an employee and calculate its Gross salary according to following.
//Basic Salary <= 10000 : HRA = 20%, DA = 80% Basic Salary <= 20000 : HRA = 25%, DA = 90% Basic Salary > 20000 : HRA = 30%, DA = 95%
// Q44. Write a Java program to input basic salary of an employee and calculate its Gross salary according to following.
// Basic Salary <= 10000 : HRA = 20%, DA = 80%
// Basic Salary <= 20000 : HRA = 25%, DA = 90%
// Basic Salary > 20000  : HRA = 30%, DA = 95%

import java.util.Scanner;

public class Q44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Basic Salary: ");
        float basicSal = sc.nextFloat();
        float HRA, DA, grossSal;

        if (basicSal <= 10000) {
            HRA = basicSal * 20f / 100f;
            DA = basicSal * 80f / 100f;
        } else if (basicSal > 10000&& basicSal <= 20000) {
            HRA = basicSal * 25f / 100f;
            DA = basicSal * 90f / 100f;
        } else {
            HRA = basicSal * 30f / 100f;
            DA = basicSal * 95f / 100f;
        }

        grossSal = basicSal + HRA + DA;
        System.out.println("Gross Salary = " + grossSal);
    }
}
