import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class AdditionTests2 {

    private Addition addition;

    @Before
    public void setUp() {
        addition = new Addition();
    }

    @Test
    public void testAddNegativeNumbers() {
        int result = addition.add(-3, -7);
        int expected = -10;
        assertEquals(expected, result);
    }

    @Test
    public void testSubtractNegativeNumbers() {
        int result = addition.subtract(-5, -2);
        int expected = -3;
        assertEquals(expected, result);
    }

    @Test
    public void testIsPositiveWithNegativeNumber() {
        assertFalse(addition.isPositive(-5));
    }
}
