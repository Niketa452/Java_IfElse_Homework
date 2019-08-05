import java.util.Scanner;
//when user enters any number, system would show whether it is postive, negative or 0.
public class PositiveNegativeZero {
public static void main (String []args){
    Scanner scanner = new Scanner (System.in);

    System.out.println ("Enter any number to find cut if its is positive, negative or zero");
    int a = scanner.nextInt();
    if(a > 0 ) {
        System.out.println("The number is positive");
    }
    if (a < 0){
        System.out.println("The number is negative");
            }
     else {
         System.out.println("The number is 0");
        }

    }







}


