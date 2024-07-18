package com.multi.q1;

import java.sql.Connection;
import java.sql.DriverManager;


public class SchoolDBConnect {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/school2";
        String username = "root";  // 데이터베이스 사용자 이름
        String password = "1234";  // 데이터베이스 비밀번호

        try {
            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);
            System.out.println("1. MYSQL 자바 연결할 DRIVER 설정 성공");
            System.out.println("2. MYSQL 연결 성공");
            connection.close();
        } catch (Exception e) {
            System.out.println("MYSQL 연결 실패");
            e.printStackTrace();
        }
    }
}

