package higherNumberClass;

import java.util.Scanner;

public class FibonacciClass {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number:");
        int num = scanner.nextInt();
        scanner.close();
        printFibonacciSeries(num);
    }

    static void printFibonacciSeries(int count) {
        int n1 = 0, n2 = 1, n3;
        System.out.print("Result of Fibonacci: ");
        for (int i = 0; i < count; i++) {
            if (i == count - 1) {
                System.out.print(n1);
            } else {
                System.out.print(n1 + ", ");
            }
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
    }
}
