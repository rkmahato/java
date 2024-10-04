import java.util.Scanner;

public class AdvancedCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double result = 0;
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter operator (+, -, *, /, %, ^): ");
        char op = sc.next().charAt(0);
        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        switch (op) {
            case '+': result = num1 + num2; break;
            case '-': result = num1 - num2; break;
            case '*': result = num1 * num2; break;
            case '/': result = num2 != 0 ? num1 / num2 : Double.NaN; break;
            case '%': result = num1 % num2; break;
            case '^': result = Math.pow(num1, num2); break;
            default: System.out.println("Invalid operation"); return;
        }

        System.out.println("Result: " + result);
        sc.close();
    }
}
