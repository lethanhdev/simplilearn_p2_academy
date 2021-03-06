package model;

import java.io.Serializable;

public class ClassAca implements Serializable {

    private static final long serialVersionUID = 1L;
    private String className;
    
    public String getClassName() {
        return className;
    }
    public void setClassName(String firstName) {
        this.className = firstName;
    }
}