package src.test.java.com.example;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class TriangleAreaTest {
    
    @Test
    public void testTriangleArea() {
        assertEquals(10.0, TriangleArea.calculate(5, 4), 0.001);
    }
    
    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testTriangleAreaWithZeroBase() {
        TriangleArea.calculate(0, 4);
    }
    
    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testTriangleAreaWithNegative() {
        TriangleArea.calculate(-5, 4);
    }
}
