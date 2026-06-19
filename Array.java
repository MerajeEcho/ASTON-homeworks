package Lesson_25;

class MyArraySizeException extends Exception {
    public MyArraySizeException(String message) {
        super(message);
    }
}

class MyArrayDataException extends Exception {
    public MyArrayDataException(String message) {
        super(message);
    }
}


public class Array {

    public static int sumArray(String[][] array) throws MyArraySizeException, MyArrayDataException {
        

        if (array.length != 4) {
            throw new MyArraySizeException("Должно быть 4 строки, а у вас " + array.length);
        }
        
        for (int i = 0; i < array.length; i++) {
            if (array[i].length != 4) {
                throw new MyArraySizeException("Строка " + i + " должна иметь 4 столбца, а у вас " + array[i].length);
            }
        }

        int sum = 0; 


        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]); 
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Ячейка [" + i + "][" + j + "] не число: " + array[i][j]);
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {


        String[][] correctArray = {
            {"1", "2", "3", "4"},
            {"5", "6", "7", "8"},
            {"9", "10", "11", "12"},
            {"13", "14", "15", "16"}
        };


        String[][] wrongDataArray = {
            {"1", "2", "3", "4"},
            {"5", "6", "7", "8"},
            {"9", "привет", "11", "12"},
            {"13", "14", "15", "16"}
        };

        String[][] wrongSizeArray = {
            {"1", "2", "3", "4"},
            {"5", "6", "7", "8"},
            {"9", "10", "11", "12"}
        };

        try {
            int result = sumArray(correctArray);
            System.out.println("Сумма элементов (правильный массив): " + result);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        try {
            int result = sumArray(wrongDataArray);
            System.out.println("Сумма элементов (массив с ошибкой в данных): " + result);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        try {
            int result = sumArray(wrongSizeArray);
            System.out.println("Сумма элементов (неправильный размер): " + result);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        System.out.println("\n=== Демонстрация ArrayIndexOutOfBoundsException ===");
        try {
            int[] arr = new int[3];
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Поймали ArrayIndexOutOfBoundsException!");
            System.out.println("Сообщение: " + e.getMessage());
            e.printStackTrace(); 
        }
    }
}
