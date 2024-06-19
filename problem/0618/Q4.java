import java.util.Scanner;

public class Q4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int [] seats = new int[10];
        for (int i = 0; i < 10; i++) {
            seats[i] = 0;
        }
        while(true) {
            System.out.println("현재 좌석 상태");
            for(int i = 0; i < seats.length; i++) {
                System.out.print(i+1 + ":" + seats[i] + " ");
            }
            System.out.print("\n예매할 좌석 번호를 입력하세요 (종료하려면 0 입력) :");
            int seat = sc.nextInt();

            if(seat==0) {
                System.out.println("예매된 좌석 수: " +count);
                System.out.println("총 예매 금액: "+count*10000+"원");
                break;
            }
            else {
                count++;
                System.out.println(seat+"번 좌석이 예매되었습니다.");
                seats[seat-1]=1;
            }
        }
    }
}
