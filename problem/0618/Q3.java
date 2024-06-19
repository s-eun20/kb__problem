import java.util.Scanner;

public class Q3 {

    public static void main(String[] args) {
        int[] scores = null;
        System.out.println("--------------------------------------------------------------");
        System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
        System.out.println("--------------------------------------------------------------");
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("선택> ");
            int num = sc.nextInt();

            switch (num) {
                case 1:
                    System.out.print("학생수> ");
                    int input = sc.nextInt();
                    scores = new int[input];
                    break;
                case 2:
                    if (scores == null) {
                        System.out.println("먼저 학생 수를 입력하세요.");
                        break;
                    }
                    for (int i = 0; i < scores.length; i++) {
                        System.out.print("scores[" + i + "]> ");
                        scores[i] = sc.nextInt();
                    }
                    break;
                case 3:
                    if (scores == null) {
                        System.out.println("먼저 학생 수를 입력하고 점수를 입력하세요.");
                        break;
                    }
                    for (int i = 0; i < scores.length; i++) {
                        System.out.println("scores[" + i + "]: " + scores[i]);
                    }
                    break;
                case 4:
                    if (scores == null) {
                        System.out.println("먼저 학생 수를 입력하고 점수를 입력하세요.");
                        break;
                    }
                    int max = scores[0];
                    int sum = 0;
                    for (int score : scores) {
                        if (score > max) {
                            max = score;
                        }
                        sum += score;
                    }
                    System.out.println("최고 점수: " + max);
                    System.out.println("평균 점수: " + (sum / (double) scores.length));
                    break;
                case 5:
                    System.out.println("프로그램 종료");
                    sc.close();
                    return;
                default:
                    System.out.println("잘못된 선택입니다. 다시 선택해주세요.");
            }
        }
    }
}
