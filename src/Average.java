import java.util.Scanner;
//When user enters 5 numbers hae gets average as the answer.
public class Average {
public static void main (String [] args) {
    Scanner scanner = new Scanner(System.in);//predefined package
    System.out.println ("Enter first number : ");
    double a = scanner.nextDouble();
    System.out.println ("Enter second number : ");
    double b = scanner.nextDouble();
    System.out.println ("Enter third number : ");
    double c = scanner.nextDouble();
    System.out.println ("Enter fourth number : ");
    double d = scanner.nextDouble();
    System.out.println ("Enter fifth number : ");
    double e = scanner.nextDouble();
    System.out.println ("The sum of 5 numbers =  " + (a+b+c+d+e));
    double average = (a+b+c+d+e)/5;
    System.out.println ("The average of 5 numbers = " + average);
}
}
