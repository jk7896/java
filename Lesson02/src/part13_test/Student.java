package part13_test;

import java.util.ArrayList;
import java.util.List;

public class Student {
	private int studentId; // 학번
    private String name; // 이름
    private List subjects; // 수강 과목 목록

    public Student(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;
        this.subjects = new ArrayList();
    }

    public void addSubject(Subject subject) {
        subjects.add(subject);
    }

    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }
    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                ", subjects=" + subjects +
                '}';
    }
}