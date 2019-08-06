import java.util.Scanner;
//when user enters name, roll number and marks of students, the system will show whether the student is pass or fail.
public class PassOrFail {
    public static void main(String[] args) {
        Scanner scnanner = new Scanner(System.in);
        System.out.println("Enter student name");
        String name = scnanner.next();
        System.out.println("Enter roll number: ");
        int rollnumber = scnanner.nextInt();
        System.out.println("Enter marks for English: ");
        double english = scnanner.nextDouble();
        System.out.println("Enter marks for Maths: ");
        double maths = scnanner.nextDouble();
        System.out.println("Enter marks for Science: ");
        double science = scnanner.nextDouble();
        if (english >= 35) {
            if (maths >= 35) {
                if (science >= 35) ;
                System.out.println("The student has passed");
            } else {
                System.out.println("The student has failed");
            }
        }


    }
}







