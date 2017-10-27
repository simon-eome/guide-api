package de.eome.guide.api;

public interface Branch extends Step {
    public enum BranchType {
        USER_REQUEST,
        SERVICE_REQUEST,
        CONTEXT_REQUEST;
        
        public static BranchType fromString(String s) throws IllegalArgumentException {
            switch (s.toLowerCase()) {
                case "userrequest":
                    return USER_REQUEST;
                case "servicerequest":
                    return SERVICE_REQUEST;
                case "contextrequest":
                    return CONTEXT_REQUEST;
                default:
                    throw new IllegalArgumentException("Invalid branch type: " + s);
            }
        }
        
        @Override
        public String toString() {
            switch (this) {
                case USER_REQUEST:
                    return "userRequest";
                case SERVICE_REQUEST:
                    return "serviceRequest";
                case CONTEXT_REQUEST:
                    return "contextRequest";
            }
            return null;
        }
    }
    
    @Override
    default String getType() {
        return "branch";
    }
    
    public BranchType getBranchType();
}
