package oop;

public class Main {
    public static void main(String[] args) {
        Student studentOne = new Student("mehdi", "arghan", 23, 9100335368l, 1, 21);
        Student studentTwo = new Student("erfan", "navab", 23, 9100335367l, 2, 22);
        Information information = new Information();
        information.addStudent(studentOne);
        information.addStudent(studentTwo);
        information.printStudentlist();
        System.out.println("--------------------------------------------------------------------------------");
        information.avergeStudentList();
        System.out.println("--------------------------------------------------------------------------------");
        information.removeStudent(1);
        System.out.println("--------------------------------------------------------------------------------");
        information.printStudentlist();
        System.out.println("--------------------------------------------------------------------------------");
        information.addGrade(19, 2);
        information.printStudentlist();
        System.out.println("--------------------------------------------------------------------------------");
        information.removeStudentList();
        information.printStudentlist();
    }
}
