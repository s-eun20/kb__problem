import java.util.Arrays;
import java.util.HashSet;

public class Q1 {
    public static void main(String[] args) {
        int[] a = new int[20];

        // 배열 초기화 및 최대값 찾기
        int max = Integer.MIN_VALUE;
        int maxIndex = -1;

        System.out.print("Original array: [");
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 100);
            System.out.print(a[i]);
            if (i < a.length - 1) {
                System.out.print(", ");
            }
            if (max < a[i]) {
                max = a[i];
                maxIndex = i;
            }
        }
        System.out.println("]");

        System.out.println("Maximum value: " + max);
        System.out.println("Index of maximum value: " + maxIndex);

        // 오름차순 정렬
        Arrays.sort(a);
        System.out.print("Array in ascending order: [");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
            if (i < a.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        // 내림차순 정렬
        for (int i = 0; i < a.length / 2; i++) {
            int temp = a[i];
            a[i] = a[a.length - 1 - i];
            a[a.length - 1 - i] = temp;
        }

        System.out.print("Array in descending order: [");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
            if (i < a.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        // 고유값 찾기
        HashSet<Integer> set = new HashSet<>();
        for (int j : a) {
            set.add(j);
        }

        System.out.println("Unique values: " + set);
        System.out.println("Count of unique values: " + set.size());
    }
}
