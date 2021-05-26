package utils;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

class StringUtilsTest {

    @Test
    void isPositiveNumberTrue() {
        boolean expected = StringUtils.isPositiveNumber("19");
        Assertions.assertTrue(expected);
    }
}
