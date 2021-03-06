package model;

import java.io.Serializable;

public class Teach implements Serializable {

    private static final long serialVersionUID = 1L;
    private String firstName;
    private String className;
    private String subjectName;
    
    public String getFirstName() {
        return firstName;
    }
    public String getClassName() {
        return className;
    }
    public String getSubjectName() {
        return subjectName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setClassName(String className) {
        this.className = className;
    }
    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }
}