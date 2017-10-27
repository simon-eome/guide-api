package de.eome.guide.api;

import java.time.OffsetDateTime;
import java.util.List;

/**
 * Model for a content package.
 */
public interface Content {
    public String getId();
    public void setLanguageId(String languageId);
    public String getLanguageId();
    public void setTitle(String title);
    public String getTitle();
    public void setDescription(String description);
    public String getDescription();
    public void setMedia(Media media);
    public Media getMedia();
    public void removeMedia();
    public List<? extends IconizedMessage> getWarnings();
    public void addWarning(IconizedMessage warning);
    public void removeWarning(IconizedMessage warning);
    public List<? extends IconizedMessage> getHints();
    public void addHint(IconizedMessage hint);
    public void removeHint(IconizedMessage hint);
    
    public OffsetDateTime getLastUpdate();
}
