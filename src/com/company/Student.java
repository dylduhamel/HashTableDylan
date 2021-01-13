package com.company;

public class Student {
    protected String studentFirstName;
    protected String studentLastName;
    protected int studentID;

    public Student(String studentFirstName, String studentLastName, int studentID) {
        this.studentFirstName = studentFirstName;
        this.studentLastName = studentLastName;
        this.studentID = studentID;
    }

    public String getStudentFirstName() {
        return studentFirstName;
    }

    public void setStudentFirstName(String studentFirstName) {
        this.studentFirstName = studentFirstName;
    }

    public String getStudentLastName() {
        return studentLastName;
    }

    public void setStudentLastName(String studentLastName) {
        this.studentLastName = studentLastName;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }
}
