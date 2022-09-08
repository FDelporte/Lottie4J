package com.lottie4j.core.definition;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * https://lottiefiles.github.io/lottie-docs/constants/#linecap
 */
public enum GradientType {
    // TODO
    // This undefined is not part of the spec, but seems to be needed to correctly parse the test JSON files.
    // Strange, looks like the @JsonValue doesn't work in this case, why?
    UNDEFINED(0, "Undefined"),
    LINEAR(1, "Linear"),
    RADIAL(2, "Radial");

    @JsonValue
    private final int value;
    private final String label;

    GradientType(int value, String label) {
        this.value = value;
        this.label = label;
    }

    public int value() {
        return value;
    }

    public String label() {
        return label;
    }
}