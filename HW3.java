import java.util.Scanner;

public class HW3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        double num1 = scanner.nextDouble();

        System.out.println("Введите второе число: ");
        double num2 = scanner.nextDouble();

        System.out.println("Введите оператор: (+ или - или * или /) ");
        char operation = scanner.next().charAt(0);

        int result = getResult(operation, num1, num2);
        System.out.printf("%d %s %d = %d", num1, operation, num2, result);

        scanner.close();
    }
        
        static int getResult(char operation, double num1, double num2){
            int result = 0;
            switch (operation) {
                case '+':
                    System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                    break;
                case '-':
                    System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                    break;
                case '*':
                    System.out.println(num1 + " x " + num2 + " = " + (num1 * num2));
                    break;
                case '/':
                    System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                    break;
                default:
                    System.err.println("Неверный оператор.");
                    break;
        }
        return result; 
    
}
}