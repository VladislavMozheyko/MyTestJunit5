import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;

public class TriangleTest{


    Triangle triangle;

    @BeforeEach
    void initialization() {
        triangle = new Triangle();
    }

    @Test
    void testResult() {
    assertEquals(triangle.setUp(2, 5, 5), 4.898979485566356);
    }

    @Test
    void testResultWithZero() {
        assertEquals(false, triangle.setUp(0, 5, 4) > 0);
    }

    @Test
    void testResultNotZero() {
        assertEquals(true, triangle.setUp(5, 7, 5) != 0);
    }

    @Test
    void testNotSame() {
        assertNotSame(triangle.setUp(5, 5, 5), triangle);
    }

    @ParameterizedTest
    @CsvSource({"2,5,5", "5,5,2", "6,6,4"})
    void testIsNotZero(int a, int b, int c) {
        assertEquals(true, triangle.setUp(a, b, c) > 0);
    }
}
