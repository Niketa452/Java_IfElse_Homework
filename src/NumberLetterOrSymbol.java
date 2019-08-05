import java.util.Scanner;
//when user enters any charachter the system would show whether it is number, letter or special charachther.
public class NumberLetterOrSymbol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number, alphabet or symbol.");
        char letters = scanner.next().charAt(0);
        if (letters >= 'a' && letters <= 'z') {
            System.out.println("You have entered small letter.");
        } else if (letters >= 'A' && letters <= 'Z') {
            System.out.println("You have entered a capital letter.");
        } else if (letters >= '0' && letters <= '9'){
            System.out.println("Your have entered a number.");
        }
        else {
            System.out.println("You have entered a special character.");
        }

        }


    }