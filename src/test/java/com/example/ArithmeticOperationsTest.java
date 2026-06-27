package src.test.java.com.example;

import org.junit.jupiter.api.Test;

import src.main.java.com.example.ArithmeticOperations;

import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

public class ArithmeticOperationsTest {
      @Test
    @DisplayName("Тестовое сложение")
    void testAddition() {
        assertEquals(7, ArithmeticOperations.add(3, 4));
    }
    
    @Test
    @DisplayName("Тестовое вычитание")
    void testSubtraction() {
        assertEquals(2, ArithmeticOperations.subtract(5, 3));
    }
    
    @Test
    @DisplayName("Тестовое умножение")
    void testMultiplication() {
        assertEquals(12, ArithmeticOperations.multiply(3, 4));
    }
    
    @Test
    @DisplayName("Тестовое деление")
    void testDivision() {
        assertEquals(2.5, ArithmeticOperations.divide(5, 2), 0.001);
    }
    
    @Test
    @DisplayName("Тестовое деление на ноль")
    void testDivisionByZero() {
        assertThrows(ArithmeticException.class, () -> {
            ArithmeticOperations.divide(5, 0);
        });
    }
}
