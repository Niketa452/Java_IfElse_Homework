import java.util.Scanner;
//when user enters 2 numbers their values are interchanged.
public class InsterchangeNumbers {
    public static void main (String []args){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter your first number : ");//user enter first number
        int a = scanner.nextInt();
        System.out.println("Enter your second number : ");// user enter second number
        int b = scanner.nextInt();
        System.out.println("Before swapping the numbers: " + a +" " + b);
        //swapping
        a= a+b;// for eg. a=1, b=2, a=a+b=3 (new value of a)
        b= a-b;//b= 3-2= 1 (new value of b)
        a= a-b;// a= 3-1=2 (new value of a), hence proved, a=2, b=1 (interchanged)
        System.out.println("After swapping the numbers: " + a +" " + b);

    }







}
