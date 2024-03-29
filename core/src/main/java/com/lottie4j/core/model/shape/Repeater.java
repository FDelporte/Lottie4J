package com.lottie4j.core.model.shape;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.lottie4j.core.definition.BlendMode;
import com.lottie4j.core.definition.Composite;
import com.lottie4j.core.definition.ShapeType;
import com.lottie4j.core.model.Animated;
import com.lottie4j.core.model.RepeaterTransform;

/**
 * https://lottiefiles.github.io/lottie-docs/shapes/#repeater
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public record Repeater(
        // Generic for all Shapes
        @JsonProperty("nm") String name,
        @JsonProperty("mn") String matchName,
        @JsonProperty("ty") ShapeType type,
        @JsonProperty("hd") Boolean hidden,
        @JsonProperty("bm") BlendMode blendMode,
        @JsonProperty("ix") Integer index,
        @JsonProperty("cl") String clazz,
        @JsonProperty("ln") String id,

        // Undefined

        @JsonProperty("d") Integer d,
        @JsonProperty("cix") Integer cix,

        // Repeater
        @JsonProperty("c") Animated copies,
        @JsonProperty("o") Animated offset,
        @JsonProperty("m") Composite stackingOrder,

        @JsonProperty("tr") RepeaterTransform repeaterTransform
) implements Shape {
}
