package generics;

import java.util.ArrayList;

public class PrintArray {

    /*

    2. Задача на дженерик метод
Условие задачи: Напишите дженерик метод printArray, который принимает
массив элементов любого типа и выводит каждый элемент массива на консоль.
     */


    static void main() {

        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("First");
        stringArrayList.add("Second");
        stringArrayList.add("Third");

        printArray(stringArrayList);

    }

    public static <T> void printArray(ArrayList<T> arrayList) {

        arrayList.forEach(
                System.out::println
        );
    }

}

