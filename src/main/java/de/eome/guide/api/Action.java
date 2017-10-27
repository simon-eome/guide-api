package de.eome.guide.api;

public interface Action extends Step {
    @Override
    default String getType() {
        return "action";
    }
}
