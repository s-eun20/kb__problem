
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        int[] type = new int[2];
        int[] price = new int[2];

        while (true) {
            System.out.println("주문할 상품을 선택하세요 (1: 샌드위치, 2: 바게트, 0: 주문종료) ");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            switch (choice) {
                case 0:
                    System.out.println("최종 주문 내역:");
                    System.out.println("샌드위치: " + type[0] + "개");
                    System.out.println("바게트: " + type[1] + "개");
                    System.out.println("최종 주문 가격: " + (price[0] + price[1]) + "원");
                    sc.close();
                    return;
                case 1:
                    System.out.println("선택한 상품: 샌드위치");
                    System.out.println("주문할 수량을 입력하세요:");
                    type[0] = sc.nextInt();
                    price[0] = type[0] * 2000;
                    break;
                case 2:
                    System.out.println("선택한 상품: 바게트");
                    System.out.println("주문할 수량을 입력하세요:");
                    type[1] = sc.nextInt();
                    price[1] = type[1] * 3500;
            }

            System.out.println("현재 주문 상황:");
            System.out.println("샌드위치: " + type[0] + "개");
            System.out.println("바게트: " + type[1] + "개");
            System.out.println("현재까지의 총 주문 금액: " + (price[0] + price[1]));
        }
    }
}
