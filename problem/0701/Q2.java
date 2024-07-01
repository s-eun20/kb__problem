import java.util.HashMap;

public class Q2 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(400,"김자료");
        map.put(200,"김사전");
        map.put(100,"김데이");
        map.put(300,"김구조");

        map.remove(200);
        map.replace(300,"김충성");

        System.out.println("고객의 전체 리스트:");
        for(Integer key : map.keySet()){
            System.out.println("고객 번호: "+key + ", 이름: " + map.get(key));
        }


    }
}
