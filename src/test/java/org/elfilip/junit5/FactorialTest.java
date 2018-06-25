package org.elfilip.junit5;

import org.elfilip.Factorial;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;




class JUnit5ExampleTest {

    @Test
    void factorial5Test() {
        assertSame(120L, new Factorial().getFactorial(5));
    }

    @Test
    void factorial0Test() {
        assertSame(1L, new Factorial().getFactorial(0));
    }

    @Test
    void factorial10Test() {
        assertEquals((Long)3628800L, new Factorial().getFactorial(10));
    }


    @Test
    void factorial11Test() {
        assertEquals((Long)3628800L, new Factorial().getFactorial(11));
    }
}
