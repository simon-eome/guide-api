package de.eome.guide.api;

/**
 * Model for a access entry.
 */
public interface AccessEntry {
    public enum Type {
        USER,
        GROUP,
        ALL
    }
    
    /**
     * Returns the type of the entry.
     * @return See @link{AccessEntry.Type} for details.
     */
    public Type getType();
    
    /**
     * Returns the target indentifier.
     * @return Target identifier. May be <code>null</code> depending on type.
     */
    public String getId();
}
