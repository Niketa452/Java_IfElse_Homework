import java.util.Scanner;
//when employee's sales target amount and ID are provided, the system would calculate commission on percentage basis
public class SalesCommission {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Sales ID : ");
        int ID = scanner.nextInt();
        System.out.println("Enter Seller's Name : ");
        String name = scanner.next();
        System.out.println("Enter Employee's Sales Amount: ");
        double salesamount = scanner.nextDouble();
        System.out.println("Enter Employee's Basic Salary: ");
        double basicsalary = scanner.nextDouble();

        if (salesamount >= 50000) {
            System.out.println("Commission =" + (35 * 50000 / 100));
        }
        else if (salesamount >= 30000) {
        System.out.println("Commission =" + (20 * 30000 / 100));
    }
        else if(salesamount >=20000) {
            System.out.println("Comission = " + (10 * 20000 / 100));
        }

        else if (salesamount >= 10000){
            System.out.println("Commission = " + (5 * 10000 / 100));
        }

        else if (salesamount <= 10000) {
            System.out.println(" Sales Commission = " + (2 * 10000 / 100));
        }

    }


}






















