package Q3;

import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<Employee2> employees = Arrays.asList(
                new Employee2("Michael", "Manager", 35),
                new Employee2("Sarah", "HR", 32),
                new Employee2("Roger", "Manager", 44),
                new Employee2("Mike", "Manager", 30),
                new Employee2("Maureen", "IT", 37)
        );


        double average = employees.stream()
                        .filter(e ->e.department.equals("Manager"))
                        .mapToInt(Employee2::getAge)
                        .average()
                        .orElse(0.0);

        System.out.printf("%.2f",average);
    }
}
