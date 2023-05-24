package org.loose.sef.junitexample;

public class StudentScore {
    private String studentName;
    private int score;

    // constructor, getters and setters -> generated by IDE (Alt + Insert)

    public StudentScore(String studentName, int score) {
        this.studentName = studentName;
        this.score = score;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getScore() {
        return score;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setScore(int score) {
        this.score = score;
    }
}