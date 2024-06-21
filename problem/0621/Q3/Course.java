package Q3;

import java.util.Scanner;

public class Course {
    private String courseName;
    private int maxStudents;
    private int currentStudents;
    private Student [] students;
    private Subject [] subjects;
    private int index=0;
    private int index2 = 0;


    public Course(String courseName, int maxStudents, int currentStudents) {
        this.courseName = courseName;
        this.maxStudents = maxStudents;
        this.currentStudents = currentStudents;
        students = new Student[maxStudents];
        subjects = new Subject[2];
    }



    public void addStudent(Student student) {
        if (maxStudents > currentStudents) {
            students[index] = student;
            index++;
        }
        else {
            System.out.println("더이상 추가할 수 없습니다.");
        }
    }
    public void addSubject(Subject subject) {
        subjects[index2] = subject;
        index2++;

    }
    public void printCourseInfo() {

        for(int i = 0; i < currentStudents; i++) {
            System.out.println("Student: "+ students[i].getName()+" - "+students[i].getDepartment());
        }
        for(int i = 0; i < currentStudents; i++) {
            System.out.println("Subject: "+ subjects[i].getName());
        }
    }


}