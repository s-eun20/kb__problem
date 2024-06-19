import java.util.Arrays;
import java.util.HashSet;

public class Q2 {

    public static void main(String[] args) {
        int[] a = new int[10];
        int[] b = new int[10];

        System.out.print("배열1 : [");
        for (int i = 0; i < 10; i++) {
            a[i] = (int)(Math.random() * 50) + 1;
            System.out.print(a[i]);
            if (i < a.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        System.out.print("배열2 : [");
        for (int i = 0; i < 10; i++) {
            b[i] = (int)(Math.random() * 50) + 51;
            System.out.print(b[i]);
            if (i < b.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        int [] result = new int[a.length+b.length];
        System.arraycopy(a, 0, result, 0, a.length);
        System.arraycopy(b, 0, result, a.length, b.length);
        int max = result[0];
        int min = result[0];
        int maxIndex = 0;
        int minIndex = 0;

        HashSet<Integer> set = new HashSet<>();
        for (int j : result) {
            set.add(j);
        }
        Arrays.sort(result);
        System.out.println("중복 값 제거된 배열: "+set);
        System.out.print("오름차순 정렬된 배열: [");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if(result[i] > max) {
                max = result[i];
                maxIndex = i;
            }
            if(result[i] < min) {
                min = result[i];
                minIndex = i;
            }
            if (i < result.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        System.out.println("최대값: "+max);
        System.out.println("최소값: "+min);
        System.out.println("최대값의 위치: "+maxIndex);
        System.out.println("최소값의 위치: "+minIndex);

    }


}
