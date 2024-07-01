import java.util.ArrayList;

public class Q3 {

    public static void main(String[] args) {
        ArrayList list = new ArrayList();


        list.add("자바");


        list.add(new 사람());


        list.add(new ArrayList());


        String s = (String)list.get(0);
        // list.get(0)은 Object 타입이기 때문에 이를 String 타입으로 강제형변환


        list.add(100);
        // 주석: 기본형 100을 Integer 객체로 변환하여 ArrayList에 추가함 오토박싱

        // ArrayList의 네 번째 요소를 Integer로 강제형변환 후 언박싱
        int i = (Integer)list.get(3);

    }
}

class 사람 {
    // 사람 클래스 정의 (내용 없음)
}