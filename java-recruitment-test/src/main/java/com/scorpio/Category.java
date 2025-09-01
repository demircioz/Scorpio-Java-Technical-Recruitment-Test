package com.scorpio;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.ArrayList;


/***
 * This class represents a category into a plc data tree
 */
@Slf4j
@Data
@NoArgsConstructor
public class Category {
    private long id;

    private String name;

    private List<Category> categories;

    private List<Measure> measures;

    /**
     *
     * @param searchingString - string to search into measure names
     */
    public List<String> searchByName(String searchingString) {
        List<String> results = new ArrayList<>();
        if (measures != null) {
            for (Measure measure : measures) {
                if (measure.getName().toLowerCase().contains(searchingString.toLowerCase())) {
                    results.add(this.name + "/" + measure.getName());
                }
            }
        }
        // recursion
        if (categories != null) {
            for (Category sub : categories) {
                String oldName = sub.name;
                sub.name = this.name + "/" + sub.name;
                results.addAll(sub.searchByName(searchingString));
                sub.name = oldName;
            }
        }
        return results;
    }

    /**
     *
     * @param dataType - dataType to search all measure which matching dataType
     */
    public List<String> searchByDataType(DataType dataType) {
        List<String> results = new ArrayList<>();
        if (measures != null) {
            for (Measure measure : measures) {
                if (measure.getDataType() == dataType) {
                    results.add(this.name + "/" + measure.getName());
                }
            }
        }
        // recursion
        if (categories != null) {
            for (Category sub : categories) {
                String oldName = sub.name;
                sub.name = this.name + "/" + sub.name;
                results.addAll(sub.searchByDataType(dataType));
                sub.name = oldName;
            }
        }
        return results;
    }
}
