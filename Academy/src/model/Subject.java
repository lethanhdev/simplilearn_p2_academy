package model;

import java.io.Serializable;

public class Subject implements Serializable {

    private static final long serialVersionUID = 1L;
    private String subjectName;
    
    public String getSubjectName() {
        return subjectName;
    }
    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }
}