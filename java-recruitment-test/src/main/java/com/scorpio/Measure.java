package com.scorpio;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *  This class represents a measure into a plc data tree
 */
@Data
@NoArgsConstructor
public class Measure {
    private long id;

    private String name;

    private DataType dataType;
}
