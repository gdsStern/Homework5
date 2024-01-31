public class Main {
    public static void main(String[] args) {

        //Задание 1
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        //Задание 2
        int clientOS1 = 1;
        int clientDeviceYear = 2016;
        if (clientOS == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else if (clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else if (clientOS == 1) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else if (clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }

        //Задание 3
        int year = 1998;
        if (year >= 1584) {
            if ((year%4==0) && (year%100 != 0) || (year%400 == 0)) {
                System.out.println(year + " год является високосным");
            } else {
                System.out.println(year + " год не является високосным");
            }
        } else {
            System.out.println("Вне периода");
        }

        //Задание 4
        int deliveryDistance = 95;
        int deliveryDays = 1;
        if (deliveryDistance < 100) {
            if (deliveryDistance > 20) {
                deliveryDays++;
            }
            if (deliveryDistance>60) {
                deliveryDays++;
            }
            System.out.println("Потребуется дней: " + deliveryDays);
        } else {
            System.out.println("доставки нет");
        }

        //Задание 5
        int monthNumber=2;
        switch (monthNumber) {
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            case 12:
                System.out.println("Зима");
                break;
            default:
                System.out.println("Месяца нет");
        }

    }
}