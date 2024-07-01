import java.util.ArrayList;

public class Q1 {
    public static void main(String[] args) {
        ArrayList List = new ArrayList<>();

        List.add("박소정");
        List.add("김경민");
        List.add("소지현");
        List.add("김개빈");



        System.out.println("초기 참가자 목록 : "+List.toString());

        List.remove(1);

        System.out.println("탈락 후 참가자 목록: "+List.toString());

        for (int i = 0; i < List.size(); i++) {
            System.out.println(i+1 +"등 :"+List.get(i));
        }



    }
}
