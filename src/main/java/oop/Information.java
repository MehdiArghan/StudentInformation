package oop;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Information {
    private List<Student> studentList = new ArrayList<>();

    public Information() {
    }

    public Information(List<Student> studentList) {
        this.studentList = studentList;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }


    public List<Student> addStudent(Student student) {
        studentList.add(student);
        return studentList;
    }

    public void printStudentlist() {
        for (Student newstudent : studentList) {
            System.out.println("firstName:" + newstudent.getFirstName() + "  lastName:" + newstudent.getLastName() + "  grade:" + newstudent.getGrade() + "  studentId:" +
                    newstudent.getStudentId() + "  age:" + newstudent.getAge() + "  numberPhone:" + newstudent.getNumberPhone());
        }
    }

    public List<Student> removeStudent(int studentId) {
        Iterator<Student> iterator = studentList.iterator();
        while (iterator.hasNext()) {
            Student student1 = iterator.next();
            if (student1.getStudentId() == studentId) {
                iterator.remove();
            }
        }
        return studentList;
    }


    public List<Student> addGrade(int grade, int studentId) {
        Iterator<Student> iterator = studentList.iterator();
        while (iterator.hasNext()) {
            Student student1 = iterator.next();
            if (student1.getStudentId() == studentId) {
                student1.setGrade(grade);
            }
        }
        return studentList;
    }


    public void removeStudentList() {
        if (!studentList.isEmpty()) {
            studentList.removeAll(studentList);
        } else {
            System.out.println("The student list is empty already.");
        }
    }


    public void avergeStudentList() {
        int sum = 0;
        for (int i = 0; i < studentList.size(); i++) {
            sum += studentList.get(i).getGrade();
        }
        System.out.println("sum:" + sum);
        System.out.println("average:" + (sum / studentList.size()));
    }
}
