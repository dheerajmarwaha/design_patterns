package dhmarwah.design.pattern;

import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    void testAdd() {
        Calculator calculator = new Calculator();
        int result = calculator.add(2, 3);
        assert result == 5 : "Expected 5 but got " + result;

    }
}
