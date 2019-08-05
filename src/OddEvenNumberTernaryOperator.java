import java.util.Scanner;
//when user enters any number, the system would show whether it is a odd or even number
public class OddEvenNumberTernaryOperator {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter one number");
            int a = scanner.nextInt();
            System.out.println("Enter second number");
            int b = scanner.nextInt();
            System.out.println(a % 2 == 0 ? "First number entered is an even number" : "First number entered is an odd number");


            System.out.println(b % 2 == 0 ? "Second number entered is an even" : "Second number entered is an odd nummber");


        }


    }