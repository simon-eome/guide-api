package de.eome.guide.api;

public interface Milestone extends Step {
    @Override
    default String getType() {
        return "milestone";
    }
}
