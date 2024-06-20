package Q1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        String id = "root";
        int pw = 1234;

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("ID를 입력하세요:");
            String myId = sc.nextLine();
            System.out.println("비밀번호를 입력하세요:");
            int myPw = sc.nextInt();
            sc.nextLine();

            if (id.equals(myId) && pw == myPw) {
                System.out.println("일기 작성을 시작합니다.");
                System.out.println("날짜를 입력하세요 (예: 20230612) : ");
                String date = sc.nextLine();
                System.out.println("제목을 입력하세요:");
                String title = sc.nextLine();
                System.out.println("내용을 입력하세요:");
                String text = sc.nextLine();


                saveDiaryEntry(date, title, text);

                System.out.println("일기가 저장되었습니다.");
            } else {
                System.out.println("ID 또는 비밀번호가 잘못되었습니다. 다시 시도하세요.");
            }
        }
    }

    public static void saveDiaryEntry(String date, String title, String text) {
        String fileName = "C:\\Users\\student\\Desktop\\"+date + ".txt";

        try (FileWriter writer = new FileWriter(fileName, true)) {
            writer.write("날짜: " + date + "\n");
            writer.write("제목: " + title + "\n");
            writer.write("내용: " + text + "\n");
            writer.write("\n---\n\n");
        } catch (IOException e) {
            System.out.println("파일을 저장하는 중에 오류가 발생했습니다.");
            e.printStackTrace();
        }
    }
}

