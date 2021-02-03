package com.bernikov.exceptions;

public class Main {
    /*    Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4.
        При подаче массива другого размера необходимо бросить исключение MyArraySizeException.

        Далее метод должен пройтись по всем элементам массива, преобразовать в int и просуммировать.
        Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ или текст вместо числа),
        должно быть брошено исключение MyArrayDataException с детализацией, в какой именно ячейке лежат неверные данные.

        В методе main() вызвать полученный метод, обработать возможные исключения MyArraySizeException и MyArrayDataException и вывести результат расчета.*/
    public static void main(String[] args) {
        String[][] arrayStrErrData = {
                {"Два", "2", "3", "43"},
                {"Три", "Восемь", "-575", "765"},
                {"432", "Тридцать", "А это не число!", "43"},
                {"433", "444", "55", "888"}
        };
        String[][] arrayStrErrSize = {
                {"33", "2", "3", "43", "43"},
                {"22", "33", "-575", "765", "765"},
                {"432", "22", "44", "43", "765"},
                {"433", "444", "55", "888", "765"}
        };
        String[][] arrayStr = {
                {"4", "2", "3", "43"},
                {"3", "8", "-575", "765"},
                {"432", "30", "777", "43"},
                {"433", "444", "55", "888"}
        };
        int summa = 0;
        try {
            summa = arraySum (arrayStrErrData);
            System.out.printf ("Сумма чисел в массив: %d", summa);
        } catch (Exception e) {
            System.out.println (e.getMessage ());
        }
        try {
            summa = arraySum (arrayStrErrSize);
            System.out.printf ("Сумма чисел в массив: %d", summa);
        } catch (Exception e) {
            System.out.println (e.getMessage ());
        }
        try {
            summa = arraySum (arrayStr);
            System.out.printf ("Сумма чисел в массив: %d", summa);
        } catch (Exception e) {
            System.out.println (e.getMessage ());
        }
    }

    public static int arraySum(String[][] arrStr) {
        int sum = 0;
        if (arrStr.length != 4 || arrStr[0].length != 4) throw new MyArraySizeException ();
        for (int i = 0; i < arrStr.length; i++) {
            for (int j = 0; j < arrStr[i].length; j++) {
                if (!isNumber (arrStr[i][j])) throw new MyArrayDataException ("В данном массиве не только числа!");
                sum += Integer.parseInt (arrStr[i][j]);
            }
        }
        return sum;
    }

    public static boolean isNumber(String str) {
        try {
            Integer.parseInt (str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
