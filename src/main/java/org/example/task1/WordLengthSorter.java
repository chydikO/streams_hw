package org.example.task1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 * 1. Обчислення довжини слів: Напишіть програму, яка приймає рядок від користувача і повертає список слів
 *  з цього рядка, відсортований за довжиною за зростанням. Використовуйте лямбда-вирази для порівняння
 *   довжини слів.
 */
public class WordLengthSorter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть рядок: ");
        String input = scanner.nextLine();

        List<String> words = Arrays.asList(input.split(" "));

        List<String> sortedWords = sortWordsByLength(words);

        System.out.println("Слова за довжиною: " + sortedWords);
    }

    public static List<String> sortWordsByLength(List<String> words) {
        return words.stream()
                .sorted(Comparator.comparingInt(String::length))
                .toList();
    }
}