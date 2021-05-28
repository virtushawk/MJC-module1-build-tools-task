package edu.epam.utils;

import org.apache.commons.lang3.math.NumberUtils;

public final class StringUtils {

    private StringUtils() {
        throw new UnsupportedOperationException("an object of this class could not be instantiated");
    }

    public static boolean isPositiveNumber(String str) {
        if (!NumberUtils.isCreatable(str)) {
            throw new NumberFormatException("Inappropriate format : " + str);
        }
        return NumberUtils.createDouble(str) > 0;
    }
}