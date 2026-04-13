
import java.util.Scanner;

public class PayrollAssignment {

    // Method to calculate net salary
    public static double calculateNetSalary(double basicSalary) {
        double HRA = 0.15;
        double DA = 0.10;
        double Tax = 0.08;
    
        double HraOut = (basicSalary * HRA);
        double DaOut = (basicSalary * DA);
        double TaxOut = (basicSalary * Tax);
        
        double netSalary = ((basicSalary + HraOut + DaOut) - TaxOut);
        return netSalary; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Basic Salary: ");
        double basicSalary = sc.nextDouble();

        double netSalary = calculateNetSalary(basicSalary);

        System.out.println("Net Salary = " + netSalary);

        sc.close();
    }
}