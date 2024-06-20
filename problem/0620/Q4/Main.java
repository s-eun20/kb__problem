package Q4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Item Burger = new Item("Burger", 5.99);
        Item Fries = new Item("Fries", 2.99);
        Item Soda = new Item("Soda", 1.99);
        int[] count = new int[3];

        while (true) {
            System.out.print("메뉴 번호를 입력, 3개 모두 주문 완료되었으면 'x' 입력 >> ");
            String input = sc.nextLine();

            switch (input) {
                case "1":
                case "2":
                case "3":
                    System.out.println("주문 가능한 메뉴입니다.");
                    System.out.println("1>> " + Burger.getName() + ": " + Burger.getPrice());
                    System.out.println("2>> " + Fries.getName() + ": " + Fries.getPrice());
                    System.out.println("3>> " + Soda.getName() + ": " + Soda.getPrice());
                    int index = Integer.parseInt(input) - 1;
                    count[index]++;
                    break;
                case "x":
                    System.out.println("프로그램을 종료합니다.");
                    for (int i = 0; i < count.length; i++) {
                        if (count[i] > 0) {
                            Item item = null;
                            switch (i) {
                                case 0:
                                    item = Burger;
                                    break;
                                case 1:
                                    item = Fries;
                                    break;
                                case 2:
                                    item = Soda;
                                    break;
                            }
                            for (int j = 0; j < count[i]; j++) {
                                System.out.println(item.getName() + ": " + item.getPrice());
                            }
                        }
                    }
                    return;
                default:
                    System.out.println("잘못된 입력입니다. 다시 시도하세요.");
                    break;
            }
        }
    }
}
