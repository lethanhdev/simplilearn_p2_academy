package model;

import java.io.Serializable;

public class Learn implements Serializable {

    private static final long serialVersionUID = 1L;
    private String firstName;
    private String className;;
    
    public String getFirstName() {
        return firstName;
    }
    public String getClassName() {
        return className;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setClassName(String className) {
        this.className = className;
    }
}