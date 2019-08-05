import java.util.Scanner;
//When user enters 5 numbers hae gets average as the answer.
public class Average {
public static void main (String [] args) {
    Scanner scanner = new Scanner(System.in);//predefined package
    System.out.println ("Enter 5 numbers to get their sum and average.");
    double a = scanner.nextDouble();
    double b = scanner.nextDouble();
    double c = scanner.nextDouble();
    double d = scanner.nextDouble();
    double e = scanner.nextDouble();
System.out.println ("The sum of 5 numbers =  " + (a+b+c+d+e));
double average = (a+b+c+d+e)/5;
System.out.println ("The average of 5 numbers = " + average);
}
}
