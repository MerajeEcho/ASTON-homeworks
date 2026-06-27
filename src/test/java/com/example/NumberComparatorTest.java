package src.test.java.com.example;
import org.testng.annotations.Test;

import src.main.java.com.example.NumberComparator;

import org.testng.annotations.DataProvider;
import static org.testng.Assert.*;

public class NumberComparatorTest {
      @Test(dataProvider = "comparisonData")
    public void testCompare(int a, int b, int expected) {
        assertEquals(NumberComparator.compare(a, b), expected);
    }
    
    @DataProvider(name = "comparisonData")
    public Object[][] getComparisonData() {
        return new Object[][] {
            {5, 5, 0},
            {7, 3, 1},
            {3, 7, -1}
        };
    }
    
    @Test
    public void testIsEqual() {
        assertTrue(NumberComparator.isEqual(5, 5));
        assertFalse(NumberComparator.isEqual(5, 3));
    }
    
    @Test
    public void testIsGreater() {
        assertTrue(NumberComparator.isGreater(7, 3));
        assertFalse(NumberComparator.isGreater(3, 7));
    }
    
    @Test
    public void testIsLess() {
        assertTrue(NumberComparator.isLess(3, 7));
        assertFalse(NumberComparator.isLess(7, 3));
    }
}
