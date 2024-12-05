package learning.java;

import java.util.Scanner;

public class ConvApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Оберіть режим роботи:");
        System.out.println("1 - Перетворення числа в рядок");
        System.out.println("2 - Перетворення рядка в число");
        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                NumberToString numberToString = new NumberToString();
                numberToString.convert(scanner);
                break;

            case 2:
                StringToNumber stringToNumber = new StringToNumber();
                stringToNumber.convert(scanner);
                break;

            default:
                System.out.println("Невірний вибір. Спробуйте ще раз.");
        }

        scanner.close();
    }
}
