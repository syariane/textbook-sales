package ca.sheridancollege.java3.mt;

/**
 * An enumeration of textbook subjects.  Each subject
 * has a display name, which can be used for displaying
 * subjects.
 * 
 * @author W.Jollymore
 */
public enum Subject {
    
    // (display name of subject)
    BUSINESS ("Business"),
    DESIGN ("Software Design"),
    HARDWARE ("Hardware"),
    MATH ("Mathematics and Logic"),
    PROGRAMMING ("Programming"),
    WEB ("Web Development");
    
    private String displayName;
    
    /**
     * Retrieve the display name of this subject.
     * 
     * @return this subject's display name
     */
    public String getDisplayName() {
        return displayName;
    }
    
    private Subject(String display) {
        this.displayName = display;
    }

}
