
/**
 * task1
 * Вычислить [n-ое треугольного число](сумма чисел от 1 до n), n! 
 * (произведение чисел от 1 до n)
 */
import java.util.Scanner;

public class HW1 {

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int i = iScanner.nextInt();
        System.out.printf("Треугольное число: %d\n", giveMeNumber(i));
        iScanner.close();
    }

    public static int giveMeNumber(int n) {
        return (n * (n + 1)) / 2;
    }
}