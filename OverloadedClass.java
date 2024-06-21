package higherNumberClass;

import java.util.Scanner;

public class OverloadedClass {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input first number: ");
        int num1 = scanner.nextInt();

        System.out.println("Input second number: ");
        int num2 = scanner.nextInt();

        System.out.println("Input third number: ");
        int num3 = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Input fourth number (optional, press Enter to skip): ");
        String input = scanner.nextLine().trim();
        int greatestNumber;

        if (input.isEmpty()) {
            greatestNumber = findGreatestNumber(num1, num2, num3);
            System.out.println("The greatest number from [" + num1 + ", " + num2 + ", " + num3 + "] is: " + greatestNumber);
        } else {
            int num4 = Integer.parseInt(input);
            greatestNumber = findGreatestNumber(num1, num2, num3, num4);
            System.out.println("The greatest number from [" + num1 + ", " + num2 + ", " + num3 + ", " + num4 + "] is: " + greatestNumber);
        }
    }

    public static int findGreatestNumber(int num1, int num2, int num3) {
        return Math.max(num1, Math.max(num2, num3));
    }

    public static int findGreatestNumber(int num1, int num2, int num3, int num4) {
        return Math.max(num1, Math.max(num2, Math.max(num3, num4)));
    }
}
