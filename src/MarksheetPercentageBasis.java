import java.util.Scanner;
//user is asked to enter name, roll number, marks of englihs, maths and science, the system calculates total and percentage
public class MarksheetPercentageBasis {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student name: ");
        String name = scanner.next();
        System.out.println("Enter roll number: ");
        int rollnumber = scanner.nextInt();
        System.out.println("Enter Marks for English: ");
        double english = scanner.nextDouble();
        System.out.println("Enter Marks for Maths: ");
        double maths = scanner.nextDouble();
        System.out.println("Enter Marks for Science: ");
        double science = scanner.nextDouble();
        double total = english + maths + science;
        System.out.println("Total Marks = " + total);
        double percentage = total / 300 * 100;
        System.out.println("Percentage = " + percentage);

        if (percentage >= 80) {
            System.out.println("Grade is A+");
        } else if (percentage >= 60) {
            System.out.println("Grade is A");
        } else if (percentage >= 50) {
            System.out.println("Grage is B");
        } else if (percentage >= 35) {
            System.out.println("Grage is C");
        } else {
            System.out.println("Student has failded");
        }
    }







        }


