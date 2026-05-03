import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestApp {
    @Test
    void testIsValidWithPositiveNumber() {
        assertTrue(App.isValid(5));
    }

    @Test
    void testIsValidWithNegativeNumber() {
        assertFalse(App.isValid(-1));
    }

    @Test
    void testIsValidWithZero() {
        assertFalse(App.isValid(0));
    }
}
