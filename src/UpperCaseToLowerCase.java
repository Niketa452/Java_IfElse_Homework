import java.util.Scanner;
//when user enters upper case letter, system wil change it to lowercase
public class UpperCaseToLowerCase {
public static void main(String [] args){
    Scanner scanner = new Scanner (System.in);
    System.out.println("Enter any letter in uppercase:");
    char uppercase = scanner.next().charAt(0);
    int i = uppercase;
    i = i+32;
    System.out.println("Lower case of  "+ uppercase + " is : " +  (char)i);


}








}
