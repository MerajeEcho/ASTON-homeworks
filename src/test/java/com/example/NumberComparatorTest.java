package src.test.java.com.example;

import org.junit.jupiter.api.Test;

import src.main.java.com.example.NumberComparator;

import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

public class NumberComparatorTest {
     @Test
    @DisplayName("Тест сравнение равных чисел")
    void testCompareEqual() {
        assertEquals(0, NumberComparator.compare(5, 5));
        assertTrue(NumberComparator.isEqual(5, 5));
    }
    
    @Test
    @DisplayName("Тест сравнения первого числа со вторым")
    void testCompareGreater() {
        assertTrue(NumberComparator.isGreater(7, 3));
        assertEquals(1, NumberComparator.compare(7, 3));
    }
    
    @Test
    @DisplayName("Тест сравнение чисел: первый меньше второго")
    void testCompareLess() {
        assertTrue(NumberComparator.isLess(3, 7));
        assertEquals(-1, NumberComparator.compare(3, 7));
    }
}
