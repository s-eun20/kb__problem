package com.multi.q1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DeptInsert {
    public static void main(String[] args) {
        try {
            String url = "jdbc:mysql://localhost:3306/school2";
            String user = "root";
            String password = "1234";
            System.out.println("1. MYSQL 자바 연결할 부품 설정 성공");
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("2. MYSQL 연결 성공");


            Scanner sc = new Scanner(System.in);

            System.out.print("deptNo>> ");
            int deptno = sc.nextInt();
            sc.nextLine();  // 개행 문자 처리

            System.out.print("deptName>> ");
            String dname = sc.nextLine();

            System.out.print("loc>> ");
            String loc = sc.nextLine();

            String sql = "INSERT INTO dept (deptno,dname,loc) VALUES(?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            System.out.println("3. SQL 부품(객체)으로 만들어주기 성공");


            preparedStatement.setInt(1, deptno);
            preparedStatement.setString(2, dname);
            preparedStatement.setString(3, loc);

            preparedStatement.executeUpdate();
            System.out.println("4. SQL문 MYSQL로 보내기 성공.");

            connection.close();
            sc.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
