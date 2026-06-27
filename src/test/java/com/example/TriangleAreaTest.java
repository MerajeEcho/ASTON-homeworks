package src.test.java.com.example;

import org.junit.jupiter.api.Test;

import src.main.java.com.example.TriangleArea;

import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

public class TriangleAreaTest {
    @Test
    @DisplayName("Проверить площадь треугольника с основанием 5 и высотой 4.")
    void testTriangleArea() {
        assertEquals(10.0, TriangleArea.calculate(5, 4), 0.001);
    }
    
    @Test
    @DisplayName("Площадь тестового треугольника с основанием 0")
    void testTriangleAreaWithZeroBase() {
        assertThrows(IllegalArgumentException.class, () -> {
            TriangleArea.calculate(0, 4);
        });
    }
    
    @Test
    @DisplayName("Площадь тестового треугольника с отрицательными значениями")
    void testTriangleAreaWithNegative() {
        assertThrows(IllegalArgumentException.class, () -> {
            TriangleArea.calculate(-5, 4);
        });
    }
}
