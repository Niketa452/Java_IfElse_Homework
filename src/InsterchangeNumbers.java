import java.util.Scanner;
//when user enters 2 numbers their values are interchanged.
public class InsterchangeNumbers {
    public static void main (String []args){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter the values of first and second number");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("Before swapping the numbers: " + a +" " + b);
        //swapping
        a= a+b;
        b= a-b;
        a= a-b;
        System.out.println("After swapping the numbers: " + a +" " + b);

    }







}
