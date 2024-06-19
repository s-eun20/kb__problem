
public class Q4 {
    public static void main(String[] args) {
        String[] subjects = new String[]{"국어", "영어", "수학", "컴퓨터", "회화"};
        int[] scores = new int[]{44, 66, 22, 99, 100};
        int[] scores2 = scores.clone();
        scores2[0] = 22;
        scores2[2] = 88;
        System.out.print("1학기 성적: [");

        int count;
        for(count = 0; count < scores.length; ++count) {
            System.out.print(scores[count]);
            if (count != scores.length - 1) {
                System.out.print(",");
            }
        }

        System.out.println("]");
        System.out.print("2학기 성적: [");

        for(count = 0; count < scores2.length; ++count) {
            System.out.print(scores2[count]);
            if (count != scores.length - 1) {
                System.out.print(",");
            }
        }

        System.out.println("]");
        count = 0;

        int count2;
        for(count2 = 0; count2 < scores.length; ++count2) {
            if (scores[count2] == scores2[count2]) {
                count++;
            }
        }

        System.out.println("1학기와 2학기 성적이 동일한 과목수: " + count + "개");
        count2 = 0;
        int index = 0;

        for(int i = 0; i < scores2.length; ++i) {
            if (scores[i] < scores2[i]) {
                count2++;
                index = i;
            }
        }

        System.out.println("1학기보다 성적이 오른 과목수: " + count2 + "개");
        if (count2 > 0) {
            System.out.println("성적이 오른 과목명: " + subjects[index]);
        }

    }
}
