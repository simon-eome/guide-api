package de.eome.guide.api;

import java.util.AbstractMap.SimpleImmutableEntry;

/**
 * Model for a tag.
 * Tags are either typed or custom. Typed tags represent static values, whilst
 * custom tags can contain any string value.
 */
public interface Tag {
    public enum Type {
        TYPED,
        CUSTOM
    }
    
    public Type getType();
    
    /**
     * Returns the value of a tag.
     * @return 
     */
    public String getValue();
    
    /**
     * Returns the tag value as key value pair, esp. relevant for typed tags.
     * Expects a tag with value string "[key]:[value]", otherwise the value will be empty.
     * @return 
     */
    default SimpleImmutableEntry asEntry() {
        String[] splittedValue = getValue().split(":");
        return new SimpleImmutableEntry(splittedValue[0], splittedValue.length > 1 ? getValue().substring(splittedValue[0].length()) : null);
    }
}
