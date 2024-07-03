import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q3 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("hello","Hi","smile");
        List<String> upperWords = words.stream()
                .map(String::toUpperCase)
                .filter(a->a.length()>4)
                .collect(Collectors.toList());

        System.out.println(upperWords);

        List<String> addwords = words.stream()
                .map(s ->s.concat("님"))
                .collect(Collectors.toList());

        System.out.println(addwords);

    }


}
