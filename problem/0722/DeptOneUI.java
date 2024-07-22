package com.multi.q1;

import java.util.Scanner;

public class DeptOneUI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("deptNo>> ");
        int deptNo = sc.nextInt();

        com.multi.q1.DeptDAO dao = new com.multi.q1.DeptDAO();
        com.multi.q1.DeptVO deptvo = dao.one(deptNo);
        System.out.println(deptvo);

        sc.close();

    }
}
