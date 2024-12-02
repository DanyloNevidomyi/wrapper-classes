package learning.java;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Створення списку для зберігання цілих чисел
        List<Integer> numbers = new ArrayList<>();

        // Додавання елементів до списку (автобоксинг)
        numbers.add(10);  // int перетворюється в Integer
        numbers.add(20);
        numbers.add(30);

        // Отримання елемента зі списку (анбоксинг)
        int firstNumber = numbers.get(0);  // Integer перетворюється в int

        // Виведення всіх елементів
        System.out.println("Числа у списку:");
        for (Integer number : numbers) {
            System.out.println(number);
        }

        // Сума всіх чисел у списку
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;  // Анбоксинг
        }
        System.out.println("Сума чисел: " + sum);
    }
}