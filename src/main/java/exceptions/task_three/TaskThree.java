package exceptions.task_three;

import java.util.Scanner;

public class TaskThree {

    /*
3. Создание и использование собственного проверяемого исключения
Условие задачи: Разработайте метод, который проверяет валидность возраста пользователя.
Если возраст меньше 0 или больше 150, метод должен выбрасывать проверяемое исключение.
     */

    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите возраст: ");
        int age = scanner.nextInt();
        try {
            checkAge(age);
        } catch (UserValidAgeException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }

    public static void checkAge(int age) throws UserValidAgeException {
        if (age < 0 || age > 150) {
            throw new UserValidAgeException("Невалидный возраст!");
        }
        else System.out.println("Возраст валиден!");
    }


}
