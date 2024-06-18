package higherNumberClass;

import java.util.Scanner;

public class HigherNumberClass {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input first number: ");
        int num1 = scanner.nextInt();

        System.out.println("Input second number: ");
        int num2 = scanner.nextInt();

        System.out.println("Input third number: ");
        int num3 = scanner.nextInt();

        int greatestNumber = Math.max(num1, Math.max(num2, num3));

        System.out.println("The greatest number from [" + num1 + ", " + num2 + ", " + num3 + "] is: " + greatestNumber);
    }
}
