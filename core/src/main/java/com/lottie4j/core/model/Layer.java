package com.lottie4j.core.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.lottie4j.core.definition.BlendMode;
import com.lottie4j.core.definition.LayerType;
import com.lottie4j.core.definition.MatteMode;
import com.lottie4j.core.model.shape.Shape;

import java.util.List;

/**
 * https://lottiefiles.github.io/lottie-docs/layers/
 * https://www.baeldung.com/jackson-inheritance
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public record Layer(
        @JsonProperty("nm") String name,
        @JsonProperty("mn") String matchName,
        @JsonProperty("ddd") Integer has3dLayers,
        @JsonProperty("hd") Boolean hidden,
        @JsonProperty("ty") LayerType layerType,
        @JsonProperty("ind") Integer indexLayer,
        @JsonProperty("parent") Integer indexParent,
        @JsonProperty("sr") Integer timeStretch,
        @JsonProperty("ip") Integer inPoint,
        @JsonProperty("op") Integer outPoint,
        @JsonProperty("st") Integer startTime,
        @JsonProperty("bm") BlendMode blendMode,
        @JsonProperty("cl") String clazz,
        @JsonProperty("ln") String idAttribute,
        @JsonProperty("tg") String tagName,
        @JsonProperty("tt") MatteMode matteMode,
        @JsonProperty("td") Integer matteTarget,
        @JsonProperty("masksProperties") List<Mask> masks,
        @JsonProperty("ef") List<Effect> effects,
        @JsonProperty("ks") Transform transform,
        @JsonProperty("ao") Integer autoRotate,

        // Unknown
        @JsonProperty("hix") Integer hix,

        // Shape
        @JsonProperty("shapes") List<Shape> shapes,

        // Precomposition
        @JsonProperty("refId") String referenceId,
        @JsonProperty("w") Integer width,
        @JsonProperty("h") Integer height,
        @JsonProperty("tm") Animated timeRemapping

) {
}
