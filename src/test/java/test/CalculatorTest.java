import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void testCalculate() {
        Calculator calc = new Calculator();

        // Testiranje osnovnih operacija
        assertEquals(9, calc.Calculate("4+5"));
        assertEquals(20, calc.Calculate("4*5"));
        assertEquals(5, calc.Calculate("10/2"));
        
        // Testiranje prioriteta operacija
        assertEquals(23, calc.Calculate("5+6*3"));
        assertEquals(14, calc.Calculate("20/2+4"));
        
        // Test komplikovanih izraza
        assertEquals(24, calc.Calculate("10+5*4-6"));
        
        // Testiranje nevalidnog izraza
        assertThrows(IllegalArgumentException.class, () -> {
            calc.Calculate("4++5");
        });
    }
}
