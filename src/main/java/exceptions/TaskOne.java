package exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class TaskOne {

    /*
    1. Обработка проверяемого исключения
Условие задачи:
Напишите программу, которая пытается открыть файл с именем "data.txt".
Если файл не найден, программа должна обработать исключение и
вывести сообщение: "Файл не найден".
     */


    static void main() {

        FileReader fileReader = null;

        try {
            fileReader = new FileReader("data.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}
