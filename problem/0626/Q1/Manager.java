package Q1;

public class Manager extends Employee { // Employee 클래스를 상속받은 자식 클래스
    private int bonus;

    public Manager(String name, String address, int salary, int rrn, int bonus) {
        super(name, address, salary, rrn); // Employee 클래스의 생성자 호출
        this.bonus = bonus;
    }


    public void test() {
        System.out.println("Manager [bonus=" + bonus + "]");
    }
}
