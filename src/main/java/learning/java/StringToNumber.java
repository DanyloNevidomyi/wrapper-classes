package learning.java;

import java.util.Scanner;

public class StringToNumber {
    public void convert(Scanner scanner) {
        System.out.println("Перетворення рядка в число.");
        System.out.println("Оберіть тип числа:");
        System.out.println("1 - Integer");
        System.out.println("2 - Double");
        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                System.out.println("Введіть рядок, що містить ціле число:");
                String intString = scanner.nextLine();
                try {
                    int result = Integer.parseInt(intString);
                    System.out.println("Результат перетворення: " + result);
                } catch (NumberFormatException e) {
                    System.out.println("Помилка: введений рядок не є цілим числом.");
                }
                break;

            case 2:
                System.out.println("Введіть рядок, що містить число з плаваючою точкою:");
                String doubleString = scanner.nextLine();
                try {
                    double result = Double.parseDouble(doubleString);
                    System.out.println("Результат перетворення: " + result);
                } catch (NumberFormatException e) {
                    System.out.println("Помилка: введений рядок не є числом з плаваючою точкою.");
                }
                break;

            default:
                System.out.println("Невірний вибір. Спробуйте ще раз.");
        }
    }

    public int convertStringToInteger(String i) {
        return Integer.parseInt(i);

    }

    public double convertStringToDouble(String i) {
        return Double.parseDouble(i);
    }
}
