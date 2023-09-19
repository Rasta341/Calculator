import static org.junit.jupiter.api.Assertions.*;

import org.example.CalculateException;
import org.example.Main;
import org.junit.jupiter.api.Test;

public class TestCalc {
    @Test
    public void testCalcArab() throws CalculateException {
        assertEquals("4", Main.calc("2 + 2"));
        assertEquals("9", Main.calc("3 * 3"));
        assertEquals("2", Main.calc("6 / 3"));
        assertEquals("4", Main.calc("10 - 6"));
    }
    @Test
    public void testCalcRoman() throws CalculateException {
        assertEquals("IV", Main.calc("II + II"));
        assertEquals("IX", Main.calc("III * III"));
        assertEquals("II", Main.calc("VI / III"));
        assertEquals("II", Main.calc("V - III"));
    }
}
