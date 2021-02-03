package com.bernikov.exceptions;

public class MyArraySizeException extends RuntimeException {

    public MyArraySizeException() {
        super ("Указанный массив не валиден. Массив должен быть 4х4");
    }
}
