package com.company;

public class lesson2_october {
    public static void Test()
    {
        int a, b;
        try {
            a = 0;
            b = 10 / a;
            System.out.println("Это сообщение не будет выведено в консоль");
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль");
        }
        System.out.println("Завершение работы");
    }

    public static void Task_1(char[][] ar) {
        try {
            for (int i = 0; i < ar.length; i++) {
              //  System.out.println(ar[i].length);
                if (i > 3) {
                    System.out.println("Превышено количество строк в массиве, должно быть не более 4");
                    throw new MyArraySizeException();
                }
                if (ar[i].length > 4) {
                    System.out.println("Превышено количество столбцов в массиве, должно быть не более 4");
                    throw new MyArraySizeException();

                }
            }
            System.out.println("Аргументы переданы верно");
        }
        catch (MyArraySizeException e)
        {
            System.out.println("Аргументы переданы неврено");
        }

    }
}
