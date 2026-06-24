package exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TaskOne {

    /*
    1. Обработка проверяемого исключения
Условие задачи:
Напишите программу, которая пытается открыть файл с именем "data.txt".
Если файл не найден, программа должна обработать исключение и
вывести сообщение: "Файл не найден".
     */


    static void main() {

        try (FileReader fileReader = new FileReader("data.txt")) {
            // файл открыт
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IOException e) {
            System.out.println("Ошибка при закрытии файла");
        }

    }

}
