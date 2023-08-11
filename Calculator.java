import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        char operator;
        int first;
        int second;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Select an Operation:");
        System.out.println("\n\tAddition: \t\t+");
        System.out.println("\n\tSubtraction: \t\t-");
        System.out.println("\n\tMultiplication: \t*");
        System.out.println("\n\tDivision: \t\t/");
        System.out.printf("\n\nEnter a Operation symbol [eg. +]: ");
        
        operator = scanner.next().charAt(0);

        System.out.printf("\n\nOperation selected: %c", operator);

        System.out.printf("\n\nEnter the first number: ");
        first = scanner.nextInt();
        System.out.printf("First number selected is %d", first);

        System.out.printf("\n\nEnter the second number: ");
        second = scanner.nextInt();
        System.out.printf("Second number selected is %d", second);

        int answer;

        switch (operator) {
            case '+':
                answer = add(first, second);
                System.out.printf("\n\n%d %c %d = %d\n", first, operator, second, answer);
                break;
            case '-':
                answer = subtract(first, second);
                System.out.printf("\n\n%d %c %d = %d\n", first, operator, second, answer);
                break;
            case '*':
                answer = multiply(first, second);
                System.out.printf("\n\n%d %c %d = %d\n", first, operator, second, answer);
                break;
            case '/':
                answer =divide(first, second);
                System.out.printf("\n\n%d %c %d = %d\n", first, operator, second, answer);
                break;
            default:
                System.out.println("Invalid operator entered.");
                break;

        }
        scanner.close();
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        return a / b;
    }
}