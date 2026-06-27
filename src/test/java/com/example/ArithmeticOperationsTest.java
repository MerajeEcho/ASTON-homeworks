package src.test.java.com.example;

import org.testng.annotations.Test;

import src.main.java.com.example.ArithmeticOperations;

import static org.testng.Assert.*;

public class ArithmeticOperationsTest {
 
    @Test
    public void testAddition() {
        assertEquals(7, ArithmeticOperations.add(3, 4));
    }
    
    @Test
    public void testSubtraction() {
        assertEquals(2, ArithmeticOperations.subtract(5, 3));
    }
    
    @Test
    public void testMultiplication() {
        assertEquals(12, ArithmeticOperations.multiply(3, 4));
    }
    
    @Test
    public void testDivision() {
        assertEquals(2.5, ArithmeticOperations.divide(5, 2), 0.001);
    }
    
    @Test(expectedExceptions = ArithmeticException.class)
    public void testDivisionByZero() {
        ArithmeticOperations.divide(5, 0);
    }
}
