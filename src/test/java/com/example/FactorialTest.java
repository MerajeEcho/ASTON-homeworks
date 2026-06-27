package src.test.java.com.example;

import org.testng.annotations.Test;

import src.main.java.com.example.Factorial;

import static org.testng.Assert.*;

public class FactorialTest {
  @Test
    public void testFactorialOfFive() {
        assertEquals(120, Factorial.calculate(5));
    }
    
    @Test
    public void testFactorialOfZero() {
        assertEquals(1, Factorial.calculate(0));
    }
    
    @Test
    public void testFactorialOfOne() {
        assertEquals(1, Factorial.calculate(1));
    }
    
    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testFactorialNegative() {
        Factorial.calculate(-5);
    }
}
