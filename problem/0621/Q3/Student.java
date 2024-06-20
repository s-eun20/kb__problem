package Q3;

public class Student {
    private String id;
    private String name;
    private int grade;
    private String department;

    public Student(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }
}