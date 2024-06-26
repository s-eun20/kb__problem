package Q1;

public class Employee { // 부모 클래스 
    public String name;
    String address;
    protected int salary;
    private int rrn;
    
    // 객체 생성시 생성자 호출
    public Employee(String name, String address, int salary, int rrn) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.rrn = rrn;
    }

    public String toString() { // 멤버변수 출력 함수
        return "Employee [name=" + name + ", address=" + address + ", salary=" + salary+ ", rrn=" + rrn + "]";
    }
}
