import java.util.Scanner;
//when user enters 2 numbers and presses calcualtion key +,-,/,*,he gets an appropriate answer.
public class ArithmeticOperators {
public static void main (String []args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter your first number");
    double a = scanner.nextDouble();
    System.out.println("Enter your second number");
    double b = scanner.nextDouble();
    System.out.println("Choose one arithmatic operator from the following: +, -, * or /");
    char symbols = scanner.next().charAt(0);

    if (symbols == '+'){
        System.out.println("The sum of two numbers =" +(a+b) );
    }
    else if(symbols =='-') {
        System.out.println("The difference between two numbers = " + (a-b));
    }
    else if (symbols == '*'){
        System.out.println("The product of two numbers = " + (a*b));
    }
    else if (symbols == '/'){
        System.out.println("The quotient of two numbers = " + (a/b));
    }
    else {
        System.out.println("Invalid");
    }
}



}
