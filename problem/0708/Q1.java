import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.FileWriter;
import java.io.IOException;

public class Q1 {
    public static void main(String[] args) {
        try {
            Document doc = Jsoup.connect("https://finance.naver.com/item/main.naver?code=005930").get();


            Element name = doc.selectFirst(".wrap_company h2 a");
            System.out.println("회사명: " + name.text());


            Elements list = doc.select("table.no_info tr td:first-child span.blind");
            Element tag = list.get(0);
            System.out.println("전일가: " + tag.text());



            Elements list2 = doc.select("p.no_today .blind");
            Element tag2 = list2.get(0);
            System.out.println("Open Price: " + tag2.text());




            Element tag3 = list.get(1);
            System.out.println("High Price: " + tag3.text());

            FileWriter fw = new FileWriter(name.text()+".txt");
            fw.write("회사명 : "+name.text()+"\n");
            fw.write("전일가 : "+tag.text()+"\n");
            fw.write("현재가 : "+tag2.text()+"\n");
            fw.write("시가 : "+ tag3.text()+"\n");
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
