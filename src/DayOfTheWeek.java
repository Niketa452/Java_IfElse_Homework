import java.util.Scanner;
//when user enters any number from 1-7, they can view the day of the week in the order of Sunday to Saturday.
public class DayOfTheWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number from 1 to 7");//to see name of the day of the week
        int days = scanner.nextInt();
        if (days == 1) {
            System.out.println("The first day of the week is Monday.");
        } else if (days == 2) {
            System.out.println("The second day of the week is Tuesday.");
        } else if (days == 3) {
            System.out.println("The third day of the week is Wednesday.");
        } else if (days == 4) {
            System.out.println("The fourth day of the week is Thursday.");
        } else if (days == 5) {
            System.out.println("The fifth day of the week is Friday.");
        } else if (days == 6) {
            System.out.println("The sixth day of the week is Saturday.");
        } else if (days == 7) {
            System.out.println("The seventh day of the week is Sunday.");


        }

    }
}