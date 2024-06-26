package Q2;

public class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public void eat() {
        System.out.println(name + "이(가) 밥을 먹습니다.");
    }
}
