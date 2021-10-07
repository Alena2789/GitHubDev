package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
      /*  HomeWorkApp.printThreeWords();
        HomeWorkApp.checkSumSign();
        HomeWorkApp.printColor();
        HomeWorkApp.compareNumbers();*/
        // lesson2_october.Test();
        int sum = 0;
        System.out.println("Передаем массив 4 на 4");
        String[][] exampleRight = {
                {"1", "34", "5", "5"},
                {"1", "6", "0", "6"},
                {"7", "7", "7", "2"},
                {"23", "22", "27", "28"}
        };
        try {
            sum = lesson2_october.strToSum(exampleRight);

        } catch (BaseException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Сумма всех элементов массива равна " + sum + ".\n");
        /*******************/
        System.out.println("Передаем массив 5 на 5 с символом вместо числа");
        String[][] exampleBigger = {
                {"1", "34", "5", "5"},
                {"1", "6", "0", "6"},
                {"7", "7", "7", "2"},
                {"23", "22", "27", "28"},
                {"23", "GaSFDWSDF", "27", "28"}
        };
        sum = 0;

        try {
            sum = lesson2_october.strToSum(exampleBigger);

        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Сумма всех элементов массива равна " + sum + ".\n");

        /***********************/
        System.out.println("Передаем массив 4 на 4 с символом вместо числа");
        String[][] exampleWithChar = {
                {"1", "34", "5", "5"},
                {"1", "6", "0", "6"},
                {"7", "7", "7", "2"},
                {"23", "GaSFDWSDF", "27", "28"}
        };
        sum = 0;
        try {
            sum = lesson2_october.strToSum(exampleWithChar);
        } catch (MyArraySizeException e) {
            System.out.println(e.getMessage());
        } catch (MyArrayDataException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Сумма всех элементов массива равна " + sum + ".\n");

    }

}


