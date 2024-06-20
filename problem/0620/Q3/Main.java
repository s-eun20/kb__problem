package Q3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        for (int i = 0; i < 2; i++) {
            System.out.print("책제목, 작가, isbn을 순서대로 입력>> ");
            String title = sc.next();
            String author = sc.next();
            String isbn = sc.next();

            Book book = new Book();
            book.setTitle(title);
            book.setAuthor(author);
            book.setIsbn(isbn);
            books.add(book);
        }

        System.out.println("------등록된 도서관 책 목록------");
        for (Book book : books) {
            book.displayInfo();
        }
    }

}
