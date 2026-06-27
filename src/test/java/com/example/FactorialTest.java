package src.test.java.com.example;

import org.junit.jupiter.api.Test;

import src.main.java.com.example.Factorial;

import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

public class FactorialTest {
      @Test
    @DisplayName("Факторный тестовый эксперимент 5")
    void testFactorialOfFive() {
        assertEquals(120, Factorial.calculate(5));
    }
    
    @Test
    @DisplayName("Факторный тестовый эксперимент 0")
    void testFactorialOfZero() {
        assertEquals(1, Factorial.calculate(0));
    }
    
    @Test
    @DisplayName("Факторный тестовый эксперимент 1")
    void testFactorialOfOne() {
        assertEquals(1, Factorial.calculate(1));
    }
    
    @Test
    @DisplayName("Тестовый факторный эксперимент с отрицательным числом")
    void testFactorialNegative() {
        assertThrows(IllegalArgumentException.class, () -> {
            Factorial.calculate(-5);
        });
    }
}
