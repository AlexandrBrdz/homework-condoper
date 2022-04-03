package ru.scypro;

public class Main {

    public static void main(String[] args) {
        // Задача 1
        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        char space = 32;
        System.out.println(space);

        // Задача 2

        int and = 0;
        int clientDeviceYear = 2014;
        if (and == 0)
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        else if  (clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        System.out.println(space);

            // Задача 3

            int year = 2028;
            if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + " год является високосным");
            } else {
                System.out.println(year + " год не является високосным");
            }
        System.out.println(space);

        // Задача 4

        int deliveryDistance =66;
        int deliveryDays = 1;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + deliveryDays);
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней: " + deliveryDays + 1);
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
                System.out.println("Потребуется дней:" + deliveryDays + 2);
            } else {
                    System.out.println("Мы не сможем доставить Вам карту");
            }


        }
    }






















