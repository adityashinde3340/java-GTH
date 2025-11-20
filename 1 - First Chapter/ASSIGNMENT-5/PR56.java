public class PR56 {
    public static void main(String[] args) {
        double basicSalary = 35000;
        double taxRate = 12;
        double netSalary = basicSalary - (basicSalary * taxRate / 100);
        System.out.println("Net Salary: " + netSalary);
    }
}
