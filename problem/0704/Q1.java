import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q1 {
    public static void main(String[] args) {
        List<String> numbers = Arrays.asList("사과","바나나","포도","바나나","멜론");

        numbers.stream().distinct().forEach(System.out::println);

        List<String> strings = Arrays.asList("apple","good","grape","ice","melon");

        List<String> str = strings.stream()
                .filter(string -> string.length() >= 5)
                .collect(Collectors.toList());

        str.forEach(System.out::println);
    }
}
