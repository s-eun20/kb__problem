import java.util.Arrays;
import java.util.stream.IntStream;

public class Q2 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        int [] arr2 = {5,3,10,40,2};
        int [] arr3 = {1,2,2,5,5,6,7,7,9,10};

        IntStream stream = Arrays.stream(arr);
        IntStream stream2 = Arrays.stream(arr2);
        IntStream stream3 = Arrays.stream(arr3);


        int sum = stream.filter(i -> i % 2 != 0).sum();

        System.out.println("arr 전체의 합: "+sum);

        System.out.print("arr2 가장 큰값: ");
        stream2.max().ifPresent(System.out::println);
        System.out.println("arr3 5보다 큰 수 중복제거 한 값 : ");
        stream3.filter(i->i>5).distinct().forEach(System.out::println);




    }
}
