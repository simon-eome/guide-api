package de.eome.guide.api;

import java.util.Map;

public interface Step {
    public String getType();
    public String getId();
    
    public String getContentId(String languageId);
    public Map<String, String> getContentIds();
    public void setContentId(String languageId, String contentId);
    public void removeContentId(String languageId);
    
    public void setNext(String stepId);
    public void removeNext();
    public String getNext();
}
