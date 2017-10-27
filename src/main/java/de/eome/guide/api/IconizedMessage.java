package de.eome.guide.api;

/**
 * Model for a message with icon, e.g., for usage in warning lists.
 */
public interface IconizedMessage {
    /**
     * Sets the text for the message.
     * @param text Text to display.
     */
    public void setText(String text);
    
    /**
     * Returns the message text.
     * @return Text to display.
     */
    public String getText();
    
    /**
     * Sets the icon path.
     * @param path Path or URL for the icon to be displayed with the message.
     */
    public void setIcon(String path);
    
    /**
     * Returns the icon path.
     * @return Path or URL for the icon to be displayed. May be <code>null</code>.
     */
    public String getIcon();
}
