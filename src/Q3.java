
import java.util.Random;

public class Q3 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] myAnswers = new int[1000];
        int[] correctAnswers = new int[1000];
        int count = 0;
        System.out.println("Index        Correct Answer        My Answer");

        for(int i = 0; i < 1000; i++) {
            myAnswers[i] = rand.nextInt(4) + 1;
            correctAnswers[i] = rand.nextInt(4) + 1;
            if (myAnswers[i] == correctAnswers[i]) {
                ++count;
            }

            System.out.println("" + i + "        " + myAnswers[i] + "        " + correctAnswers[i]);
        }

        System.out.println("맞춘 개수: " + count);
    }
}
