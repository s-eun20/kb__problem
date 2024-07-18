package com.multi.q1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DeptDelete {
    public static void main(String[] args) {
        try {
            String url = "jdbc:mysql://localhost:3306/school2";
            String user = "root";
            String password = "1234";
            System.out.println("1. MYSQL 자바 연결할 부품 설정 성공");
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("2. MYSQL 연결 성공");

            Scanner scanner = new Scanner(System.in);

            System.out.print("deptNo>> ");
            int deptNo = scanner.nextInt();

            String sql = "DELETE FROM dept WHERE deptno = ?";
            PreparedStatement ps = connection.prepareStatement(sql);
            System.out.println("3. SQL 부품(객체)으로 만들어주기 성공");
            ps.setInt(1, deptNo);
            ps.executeUpdate();
            System.out.println("4. SQL문 MYSQL로 보내기 성공.");
            ps.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
