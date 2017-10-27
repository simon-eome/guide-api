package de.eome.guide.api;

import java.util.List;

public interface UserRequest extends Branch {
    @Override
    default BranchType getBranchType() {
        return BranchType.USER_REQUEST;
    }
    
    public List<? extends Option> getOptions();
    public void addOption(Option option);
    public void removeOption(Option option);
}
