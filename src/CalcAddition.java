import java.util.Scanner;
public class CalcAddition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("second number: ");
        double num2 = scanner.nextDouble();

        double result = num1 + num2;

        System.out.println(num1 + " + " + num2 + " = " + result);
    }
}