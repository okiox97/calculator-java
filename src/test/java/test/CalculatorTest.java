import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void testCalculate() {
        Calculator calc = new Calculator();

        // Testiranje osnovnih operacija
        assertEquals("9.0", calc.Run("4+5"));
        assertEquals("20.0", calc.Run("4*5"));
        assertEquals("5.0", calc.Run("10/2"));
        
        // Testiranje prioriteta operacija
        assertEquals("23.0", calc.Run("5+6*3"));
        assertEquals("14.0", calc.Run("20/2+4"));
        
        // Test komplikovanih izraza
        assertEquals("24.0", calc.Run("10+5*4-6"));

        // Test deljenja sa nulom
        assertEquals("Infinity", calc.Run("6/0"));
        assertEquals("-Infinity", calc.Run("-6/0"));
        
        assertEquals("ERROR", calc.Run("4++5"));
    }
}
