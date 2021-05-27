package edu.epam.utils;

import org.apache.commons.lang3.math.NumberUtils;

public final class StringUtils {

    private StringUtils() {
        throw new UnsupportedOperationException();
    }

    public static boolean isPositiveNumber(String str) {
        if (!NumberUtils.isCreatable(str)) {
            throw new NumberFormatException("Inappropriate format");
        }
        return NumberUtils.createDouble(str) > 0;
    }
}