package entities;

import java.util.Objects;

public class Student {

    private Integer StudentID;

    public Student(Integer studentID) {
        StudentID = studentID;
    }

    public Integer getStudentID() {
        return StudentID;
    }

    public void setStudentID(Integer studentID) {
        StudentID = studentID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;
        return getStudentID().equals(student.getStudentID());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getStudentID());
    }
}
