package com.multi.q1;

import java.util.Scanner;

public class DeptOneUI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("deptNo>> ");
        int deptNo = sc.nextInt();

        DeptDAO dao = new DeptDAO();
        DeptVO deptvo = dao.one(deptNo);
        System.out.println(deptvo);

        sc.close();

    }
}
