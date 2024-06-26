package Q3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Course Name: ");
        String name = sc.nextLine();
        System.out.print("Max Students: ");
        int max = sc.nextInt();
        System.out.print("Current Students: ");
        int current = sc.nextInt();

        Course course = new Course(name, max, current);
        course.addStudent(new Student("kim","Computer Science"));
        course.addStudent(new Student("park","Computer Science"));
        course.addSubject(new Subject("Java"));
        course.addSubject(new Subject("Python"));

        course.printCourseInfo();
    }
}
