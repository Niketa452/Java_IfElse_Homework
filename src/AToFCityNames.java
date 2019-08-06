import java.util.Scanner;
//when user enters any letter from a to f, he would get a city name beginning with that letter
public class AToFCityNames {
public static void main (String [] args){
 Scanner scanner = new Scanner(System.in);//pre-defined object
 System.out.println("Enter any letter from 'A' to 'F' to view the name of city beginning with that letter.");
  char letter  = scanner.next().charAt(0);
if (letter=='a'|| letter == 'A') {
    System.out.println("The City name beginning with 'a' is Abu Dhabi.");
}
if (letter== 'b'|| letter =='B') {
    System.out.println("The City name beginning with 'b' is Barcelona.");
}
    else if (letter== 'c' || letter =='C'){
        System.out.println("The City name beginning with 'c' is Carolina.");
    }
    else if (letter== 'd'|| letter == 'D') {
        System.out.println("The City name beginning with 'd' is Darwin.");
    }
    else if (letter== 'e'|| letter =='E') {
        System.out.println("The City name beginning with 'e' is El Paso.");
    }
    else if(letter== 'f' ||letter == 'F') {
            System.out.println("The City name beginning with 'f' is Florence.");
        }
else {
        System.out.println("Invalid Entry.");
    }

        }


}














