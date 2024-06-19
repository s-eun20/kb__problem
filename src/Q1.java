import java.util.Scanner;

public class Q1 {
    public Q1() {
    }

    public static void main(String[] args) {
        String[] title = new String[]{"Quiet Place", "Avengers: Endgame", "Inception", "Parasite", "Interstellar"};
        int[] count = new int[]{100, 200, 300, 400, 500};
        Scanner in = new Scanner(System.in);
        System.out.println("네이버 시리즈온 실시간 영화 목록:");

        int num;
        for(num = 0; num < title.length; num++) {
            System.out.println(num + 1 + ". " + title[num] + " - 조회수: " + count[num]);
        }

        System.out.println("정보를 확인하고 싶은 영화 번호를 선택하세요(1-5):");
        num = in.nextInt() - 1;
        if (num >= 0 && num < title.length) {
            System.out.println("선택한 영화: " + title[num]);
            System.out.println("조회수: " + count[num]);
        } else {
            System.out.println("잘못된 선택입니다.");
        }

        in.close();
    }
}