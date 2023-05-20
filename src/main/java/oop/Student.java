package oop;

public class Student extends Person {
    private int studentId;
    private int grade;

    public Student() {
    }

    public Student(int studentId, int grade) {
        this.studentId = studentId;
        this.grade = grade;
    }

    public Student(String firstName, String lastName, int age, Long numberPhone, int studentId, int grade) {
        super(firstName, lastName, age, numberPhone);
        this.studentId = studentId;
        this.grade = grade;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
