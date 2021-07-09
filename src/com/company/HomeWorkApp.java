package com.company;

public class HomeWorkApp {
    public static void printThreeWords() {
        System.out.println("_Orange");
        System.out.println("_ Banana");
        System.out.println("_ Apple");
    }

    public static void checkSumSign() {
        int a = 5;
        int b = 3;
        int c = a + b;
        if (c >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }

    }

    public static void printColor() {
        int value = 120;//-7;//7;

        if (value <= 0) {
            System.out.println("Красный");
        } else if (0 < value && value <= 100) {
            System.out.println("Желтый");
        } else if (100 < value) {
            System.out.println("Зеленый");
        }
    }
    public static void compareNumbers() {
        int a = 8;
        int b =12;
        if (a >= b){
            System.out.println("a >= b");
        }
        else if (a < b){
            System.out.println("a < b");
        }
    }
}

