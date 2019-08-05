import java.util.Scanner;
//when user enters any year the system will show whether it was a leap year or not
public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any year");
        int a = scanner.nextInt();
        if (a % 4 == 0) {
            System.out.println(a + " is a leap year");
        } else {
            System.out.println(a + " is not a leap year");
        }


    }
}