package com.lottie4j.core.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.lottie4j.core.helper.ListDoubleDeserializer;

import java.util.List;

/**
 * https://lottiefiles.github.io/lottie-docs/concepts/#animated-property
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_NULL)
public record EasingHandle(
        @JsonProperty("x")
        //@JsonSerialize(using = ListDoubleSerializer.class)
        @JsonDeserialize(using = ListDoubleDeserializer.class)
        List<Double> x,
        @JsonProperty("y")
        //@JsonSerialize(using = ListDoubleSerializer.class)
        @JsonDeserialize(using = ListDoubleDeserializer.class)
        List<Double> y
) {
}
