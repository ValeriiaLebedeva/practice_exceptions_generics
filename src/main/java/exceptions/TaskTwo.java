package exceptions;

import java.util.Scanner;

public class TaskTwo {


    /*

    2. Обработка непроверяемого исключения
Условие задачи: Напишите метод, который принимает на вход два числа и выполняет их деление.
Обработайте ситуацию, когда второе число равно нулю, чтобы избежать исключения при делении.
     */

    static void main() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int a = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int b = scanner.nextInt();


        try {
            System.out.println("Результат деления: " + divide(a, b));
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: деление на ноль!");
        }

    }

    public static double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Деление на ноль запрещено");
        }
        return (double) a /b;
    }
}
