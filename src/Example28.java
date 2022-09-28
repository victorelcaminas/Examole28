import java.util.Scanner;

public class Example28 {
    public static void main(String [] args) {
        int num1, num2, i;
        int addition = 0;

        Scanner inputValue;
        inputValue = new Scanner(System.in);

        System.out.println("Enter first number: ");
        num1 = inputValue.nextInt();

        System.out.println("Enter second number: ");
        num2 = inputValue.nextInt();

        for (i = 1; i <= num2; i++) {
            addition = addition + num1;
        }
        System.out.println(addition);
    }
 }

