package refactoring.chapter08.s01_self_encapsulate_field;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IntRangeAfterTest {

    @Test
    public void should_include_if_given_capacity() {
        CappedRange range = new CappedRange(1, 10, 20);

        Assertions.assertTrue(range.include(15));
        Assertions.assertTrue(range.include(9));
    }

    @Test
    public void should_include() {
        IntRangeAfter range = new IntRangeAfter(1, 10);

        Assertions.assertFalse(range.include(15));
        Assertions.assertTrue(range.include(9));
    }

}
