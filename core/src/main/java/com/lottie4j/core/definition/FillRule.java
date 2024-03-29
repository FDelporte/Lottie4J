package com.lottie4j.core.definition;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Arrays;

/**
 * https://lottiefiles.github.io/lottie-docs/constants/#linecap
 */
public enum FillRule {
    NON_ZERO(1, "Non Zero"),
    EVEN_ODD(2, "Even Odd");

    @JsonValue
    private final int value;
    private final String label;

    FillRule(int value, String label) {
        this.value = value;
        this.label = label;
    }

    @JsonCreator
    public static FillRule fromValue(String value) {
        return Arrays.stream(FillRule.values()).sequential()
                .filter(v -> String.valueOf(v.value).equals(value))
                .findFirst()
                .get();
    }

    public int value() {
        return value;
    }

    public String label() {
        return label;
    }
}
