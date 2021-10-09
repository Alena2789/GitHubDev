package com.company;


public class MyArraySizeException extends BaseException {
    MyArraySizeException() {
        super("Ошибка. Размерность массива должна быть [4 x 4]");
    }
}
