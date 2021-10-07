package com.company;

public class MyArrayDataException extends BaseException {
   MyArrayDataException(int row, int col) {
        super(String.format("Не удалось преобразовать данные к числу в ячейке [%d, %d]\n", row, col));
    }
}
