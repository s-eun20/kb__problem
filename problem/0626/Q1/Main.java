package Q1;

public class Main {
    public static void main(String[] args) {
        // Manager 객체 생성
        Manager manager = new Manager("John Doe", "123 Main St", 50000, 123456789,5000);

        System.out.print(manager.toString()); // Employee 클래스에 있는 toString() 함수 호출
        manager.test();
    }
}
