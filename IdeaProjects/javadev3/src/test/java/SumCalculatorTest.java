import org.example.SumCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SumCalculatorTest {

    private SumCalculator calc;

    @BeforeEach
    public void beforeEach() {
        calc = new SumCalculator();
    }

    @Test
    public void Sumcalculator1() {
        Assertions.assertEquals(1, calc.sum(1));
    }

    @Test
    public void Sumcalculator3() {
        Assertions.assertEquals(6, calc.sum(3));
    }

    @Test
    public void Sumcalculator0() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            calc.sum(0);
        });
    }
}
