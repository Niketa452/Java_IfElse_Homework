import java.util.Scanner;
//when user enters any uppercase or lower caseletter, the system would show whether it is a vowel or a consonant.
public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any letter to find out whether it is vowel or consonant.");
        char a = scanner.next().charAt(0);


        if (a == 'A' || a == 'a') {
            System.out.println("Your letter is a vowel.");
        } else if (a == 'E' || a == 'e') {
            System.out.println("Your letter is a vowel.");
        } else if (a == 'I' || a == 'i') {
            System.out.println("Your letter is a vowel.");
        } else if (a == 'O' || a == 'o') {
            System.out.println("Your letter is a vowel.");
        } else if (a == 'U' || a == 'u') {
            System.out.println("Your letter is a vowel.");
        } else {
            System.out.println("Your letter is a Consonant.");
        }
    }
}