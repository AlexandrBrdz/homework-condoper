package ru.scypro;

public class Main {

    public static void main(String[] args) {
        // ������ 1
        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("���������� ������ ���������� ��� iOS �� ������");
        } else {
            System.out.println("���������� ������ ���������� ��� Android �� ������");
        }

        char space = 32;
        System.out.println(space);

        // ������ 2

        int and = 0;
        int clientDeviceYear = 2014;
        if (and == 0)
            if (clientDeviceYear < 2015) {
                System.out.println("���������� ����������� ������ ���������� ��� Android �� ������");
            } else {
                System.out.println("���������� ������ ���������� ��� Android �� ������");
            }
        else if  (clientDeviceYear < 2015) {
            System.out.println("���������� ����������� ������ ���������� ��� iOS �� ������");
        } else {
            System.out.println("���������� ������ ���������� ��� iOS �� ������");
        }
        System.out.println(space);

            // ������ 3

            int year = 2028;
            if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + " ��� �������� ����������");
            } else {
                System.out.println(year + " ��� �� �������� ����������");
            }


        }
    }






















