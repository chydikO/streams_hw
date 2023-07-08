package org.example.task2;

import java.util.List;
import java.util.Random;

/**
 * 2. Перетворення списку: Заповніть список випадковими цілими числами розміром 10 чисел.
 * Використовуйте лямбда-вирази, щоб перетворити кожен елемент списку в його квадрат.
 * Результат збережіть в іншому списку.
 */

public class ListTransformation {

    public static List<Integer> squareNumbers(List<Integer> list) {
        return list.stream()
                .map(number -> (number * number))
                .toList();
    }

    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> numbers = random.ints(10, 0, 10)
                .boxed()
                .toList();
        numbers.stream().forEach(System.out::println);
        System.out.println(squareNumbers(numbers));
    }
}
