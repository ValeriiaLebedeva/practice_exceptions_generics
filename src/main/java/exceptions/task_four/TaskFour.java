package exceptions.task_four;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskFour {

    /*

    4. Создание и использование собственного непроверяемого исключения
Условие задачи: Напишите функцию, которая принимает строку в качестве аргумента
и проверяет, является ли строка правильным электронным адресом.
Если строка не удовлетворяет критериям, функция должна выбрасывать непроверяемое исключение.
     */

    static void main() {

        try(Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите email: ");
            String email = scanner.nextLine();

            checkEmailFormat(email);
        } catch (CheckEmailFormatException e) {
            System.out.println("Email введен некорректно!");
        }

    }

    public static void checkEmailFormat(String email) {

        if (email == null) {
            throw new CheckEmailFormatException("Email is null");
        }

        Pattern pattern = Pattern.compile("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$");
        Matcher matcher = pattern.matcher(email);

        if (matcher.matches()) {
            System.out.println("Email введен корректно!");
        } else throw new CheckEmailFormatException("Email введен некорректно!");
    }
}
