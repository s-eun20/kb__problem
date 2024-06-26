package Q2;

public class Superman extends Man {
    public boolean sky;

    public Superman(String name, int age, int power, boolean sky) {
        super(name,age,power);
        this.sky = true;
    }

    public void space() {
        System.out.println(name + "이(가) 우주를 날아갑니다.");
    }


    /* public void run() {
        System.out.println(name + "이(가) 우주를 날아갑니다.");
    }*/

    public String toString() {

        return "슈퍼맨 [name=" + name + ", age=" + age + ", power=" + power + ", sky=" + sky + "]";
    }
}
