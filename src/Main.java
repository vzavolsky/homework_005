import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        task_01();
        task_02();
        task_03();
        task_04();
        task_05();
    }
    public static void task_01() {
        String  appleOS = "Установите версию приложения для iOS по ссылке.",
                androidOS = "Установите версию приложения для Android по ссылке.";
        Scanner chooseDeviceOSInput = new Scanner(System.in);
        System.out.print("Введите вервсию ОС вашего устройства (0 - iOS; 1 - Android): ");
        byte chooseDeviceOS = chooseDeviceOSInput.nextByte();

        if (chooseDeviceOS == 0) System.out.print(appleOS);
        if (chooseDeviceOS == 1) System.out.print(androidOS);
    }
    public static void task_02() {
        String  appleOS = "Установите %sверсию приложения для iOS по ссылке.",
                androidOS = "Установите %sверсию приложения для Android по ссылке.";
        Scanner chooseDeviceOSInput = new Scanner(System.in);
        System.out.print("Введите вервсию ОС вашего устройства (0 - iOS; 1 - Android): ");
        byte chooseDeviceOS = chooseDeviceOSInput.nextByte();
        System.out.print("Год производства устройства: ");
        int clientDeviceYear = chooseDeviceOSInput.nextInt();
        String lightVersion = (clientDeviceYear < 2015) ? "облегчённую " : "";
        if (chooseDeviceOS == 0) System.out.printf(appleOS,lightVersion);
        if (chooseDeviceOS == 1) System.out.printf(androidOS,lightVersion);
    }
    public static void task_03() {
        int year;
        String  yearIsLeap = "%d-й год является високосным.",
                yearIsNotLeap = "%d-й год не является високосным.",
                isLeap = "";
        Scanner yearInput = new Scanner(System.in);
        System.out.print("Введите год для проверки: ");
        year = yearInput.nextInt();
        boolean check400s = (year % 400) == 0;
        boolean check100s = (year % 100) == 0;
        boolean check4s = (year % 4) == 0;
        isLeap = (check400s || (check4s && !check100s)) ? yearIsLeap : yearIsNotLeap;
        System.out.printf(isLeap,year);
    }
    public static void task_04() {
        int     deliveryDistance = 50,
                days = 1;
        if (deliveryDistance > 20) days++;
        if (deliveryDistance > 60) days++;
        if (deliveryDistance > 100) {
            System.out.println("Доставки нет.");
        } else {
            System.out.println("Потребуется дней: " + days);
        }
    }
    public static void task_05() {
        byte monthNumber = 4;
        String season = "";
        switch (monthNumber) {
            case 12:
            case 1:
            case 2: season = "Зима"; break;
            case 3:
            case 4:
            case 5: season = "Весна"; break;
            case 6:
            case 7:
            case 8:season = "Лето"; break;
            case 9:
            case 10:
            case 11: season = "Осень"; break;
            default: break;
        }
        System.out.println(season);
    }
}