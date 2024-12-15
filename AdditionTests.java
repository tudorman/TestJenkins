import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class AdditionTests {

    private Addition addition;

    @Before
    public void setUp() {
        addition = new Addition();
    }

    @Test
    public void testAddPositiveNumbers() {
        int result = addition.add(5, 10);
        int expected = 15;
        assertEquals(expected, result);
    }

    @Test
    public void testSubtractPositiveNumbers() {
        int result = addition.subtract(20, 5);
        int expected = 15;
        assertEquals(expected, result);
    }

    @Test
    public void testIsPositiveWithPositiveNumber() {
        assertTrue(addition.isPositive(7));
    }
}
