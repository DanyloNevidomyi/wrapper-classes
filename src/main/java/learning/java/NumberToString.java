package learning.java;

import java.util.Scanner;

public class NumberToString {
    public void convert(Scanner scanner) {
        System.out.println("Перетворення числа в рядок.");
        System.out.println("Оберіть тип числа:");
        System.out.println("1 - Integer");
        System.out.println("2 - Double");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Введіть ціле число:");
                int intNumber = scanner.nextInt();
                String intString = Integer.toString(intNumber);
                System.out.println("Результат перетворення: " + intString);
                break;

            case 2:
                System.out.println("Введіть число з плаваючою точкою:");
                double doubleNumber = scanner.nextDouble();
                String doubleString = Double.toString(doubleNumber);
                System.out.println("Результат перетворення: " + doubleString);
                break;

            default:
                System.out.println("Невірний вибір. Спробуйте ще раз.");
        }
    }

    public String convertIntegerToString(int i) {
        return Integer.toString(i);
    }

    public String convertDoubleToString(double i) {
        return Double.toString(i);
    }
}
