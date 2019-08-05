import java.util.Scanner;
//when users enters their age, they would get to know whether or not they are eligible to vote.
public class EligibleToVote {
public static void main (String []args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter you age.");
    int age = scanner.nextInt();
    if (age >= 18) {
        System.out.println("You are eligible to vote.");
    }
    else {
        System.out.println("Sorry,you are not eligible to vote.");
    }
}

}
