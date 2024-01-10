import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        isLeapYear(2024);
        System.out.println("Задача 2");
        determineVersion(1, 2012);
        System.out.println("Задача 3");
        int deliveryDistance = 95;
        System.out.println("Потребуется дней: " + getDeliveryDays(deliveryDistance));
    }

    public static void isLeapYear(int year) {

        if (year % 100 == 0 && year % 400 != 0) {
            System.out.println(year + " год не является високосным");
        } else if (year % 4 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void determineVersion(int oS, int releaseYear) {
        int clientDeviceYear = 2015;
        int currentYear = LocalDate.now().getYear();
        String nameOS;
        if (oS > 1 || releaseYear > currentYear || releaseYear <= 0) {
            System.out.println("Некорректно введены данные");
            return;
        }
        if (oS == 0) {
            nameOS = "IOS";
        } else {
            nameOS = "Android";
        }
        if (releaseYear < clientDeviceYear) {
            System.out.println("Установите облегченную версию приложения для " + nameOS + " по ссылке");
        } else {
            System.out.println("Установите версию приложения для " + nameOS + " по ссылке");
        }
    }

    public static int getDeliveryDays(int distance) {
        int deliveryDays;
        if (distance <= 20) {
            deliveryDays = 1;
        } else if (distance <= 60) {
            deliveryDays = 2;
        } else if (distance <= 100) {
            deliveryDays = 3;
        } else {
            System.out.println("нет доставки");
            deliveryDays = 0;
        }
        return deliveryDays;
    }
}