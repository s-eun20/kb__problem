package Q1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        while(true) {
            System.out.print("어떤 객체를 생성하시겠습니까?(Apple, Banana, Ice): ");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            ObjectFactory factory = new ObjectFactory();
            factory.createObject(input);
            System.out.println(input + "가(이) 입력되었습니다.");
        }
    }
}
