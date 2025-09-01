package com.scorpio;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;

import static java.util.Arrays.stream;

@Getter
public enum DataType {

    SHORT("Short", Short.class),

    INTEGER("Integer", Integer.class),

    LONG("Long", Long.class),

    FLOAT("Float", Float.class),

    DOUBLE("Double", Double.class),

    BOOLEAN("Boolean", Boolean.class),

    STRING("String", String.class);

    @JsonValue
    private final String value;

    private final Class<?> clazz;

    DataType(String value, Class<?> clazz) {
        this.value = value;
        this.clazz = clazz;
    }

    @JsonCreator
    public static DataType from(String dataTypeValue) {
        return stream(DataType.values())
            .filter(dataType -> dataType.getValue().equalsIgnoreCase(dataTypeValue))
            .findFirst().orElse(null);
    }
}
