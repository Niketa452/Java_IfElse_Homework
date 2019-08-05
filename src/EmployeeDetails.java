import java.util.Scanner;
//employee details with, HRA, DA, TA, PF and  gross salary calculation
public class EmployeeDetails {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
            System.out.println("Enter Employee ID : ");
            int ID = scanner.nextInt();
            System.out.println("Enter Employee Name : ");
            String name = scanner.next();
            System.out.println("Enter Employee's Basic Salary: ");
            double basicsalary = scanner.nextDouble();
        double HRA = 10*basicsalary/100;
        System.out.println("Employee's HRA = " + HRA);
        double DA = 8*basicsalary/100;
        System.out.println("Employee's DA = " + DA);
        double TA = 9*basicsalary/100;
        System.out.println("Employee's TA = " + TA);
        double PF = 20*basicsalary/100;
        System.out.println("Employee's PF =  " + PF);
        double grosssalary = basicsalary + HRA + DA + TA -PF;
        System.out.println ("Employee's Gross Salary = " + grosssalary);








    }

}

