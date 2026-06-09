public class Main {
    
    // Задание 1
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    
    // Задание 2
    public static void checkSumSign() {
        int a = -1;
        int b = -2;
        
        int sum = a + b;
        
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }
    
    // Задание 3 
    public static void printColor() {
        int value = 12222;
        if (value <= 0) { 
            System.out.println("Красный");
        } else if (value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }
    
    // Задание 4
    public static void compareNumbers() {
        int a = -1;
        int b = 1;
        
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
    
    // Задание 5 
    public static boolean isSumBetween10And20(int a, int b) {
        int sum = a + b;
        
        if (sum >= 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }
    }
    
    // Задание 6 
    public static void printPositiveOrNegative(int number) {
        if (number >= 0) {
            System.out.println("Положительное");
        } else {
            System.out.println("Отрицательное");
        }
    }
    
    // Задание 7 - ИСПРАВЛЕНО
    public static boolean isPositive(int number) {
     if (number >= 0 ) {
        return false;
      }
      else {
        return true;
      }
    }
    
    // Задание 8
    public static void printStringMultipleTimes(String text, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(text);
        }
    }
    
    // Задание 9 
    public static boolean isLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        }
        if (year % 100 == 0) {
            return false;
        }
        if (year % 4 == 0) {
            return true;
        }
        return false;
    }
    
    // Задание 10 
    public static void invertArray() {
        int[] mass = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        
        System.out.println("Было:");
        for (int i = 0; i < mass.length; i++) {
            System.out.print(mass[i] + " ");
        }
        System.out.println();
        
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] == 0) {
                mass[i] = 1;
            } else {
                mass[i] = 0;
            }
        }
        
        System.out.println("Стало:");
        for (int i = 0; i < mass.length; i++) {
            System.out.print(mass[i] + " ");
        }
        System.out.println();
    }
    
    // Задание 11
    public static void fillArrayWithNumbers() {
        int[] numbers = new int[100];
        
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
    
    // Задание 12 
    public static void multiplyNumbersLessThan6() {
        int[] numbers = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        
        System.out.println("Было:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 6) {
                numbers[i] = numbers[i] * 2;
            }
        }
        
        System.out.println("Стало:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
    
    // Задание 13
    public static void TableDiagonal() {
        int[][] table = new int[3][3];
        
        for (int i = 0; i < 3; i++) {
            table[i][i] = 1;
        }
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    // Задание 14 - ИСПРАВЛЕНО
    public static int[] createFilledArray(int len, int initialValue) {
        int[] arr = new int[len];
        
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
        }
        
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        return arr;
    }
    
    // ГЛАВНЫЙ МЕТОД
    public static void main(String[] args) {
        printThreeWords();
        System.out.println();
        
        checkSumSign();
        System.out.println();
        
        printColor();
        System.out.println();
        
        compareNumbers();
        System.out.println();
        
        System.out.println(isSumBetween10And20(5, 7));
        System.out.println(isSumBetween10And20(-5, 7));
        System.out.println(isSumBetween10And20(0, 10));
        System.out.println();
        
        printPositiveOrNegative(0);
        printPositiveOrNegative(-1);
        System.out.println();
        
        System.out.println(isPositive(0));
        System.out.println(isPositive(-1));
        System.out.println();
        
        printStringMultipleTimes("Мама я в телевизоре!", 4);
        System.out.println();
        
        System.out.println(isLeapYear(2024));
        System.out.println(isLeapYear(1901));
        System.out.println(isLeapYear(2004));
        System.out.println(isLeapYear(2023));
        System.out.println();
        
        invertArray();
        System.out.println();
        
        fillArrayWithNumbers();
        System.out.println();
        
        multiplyNumbersLessThan6();
        System.out.println();
        
        TableDiagonal();
        System.out.println();
        
         int[] myArray = createFilledArray(10, 5);
            for (int i = 0; i < myArray.length; i++) {
                System.out.print(myArray[i] + " ");
            } 
    }
}
