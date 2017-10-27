package de.eome.guide.api;

public interface Chapter extends Step {
    @Override
    default String getType() {
        return "chapter";
    }
    
    public void setTarget(String guideId);
    public String getTarget();
}
