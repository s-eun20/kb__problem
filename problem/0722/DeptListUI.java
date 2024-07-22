package com.multi.q1;

import java.util.ArrayList;

public class DeptListUI {
    public static void main(String[] args) {
        DeptDAO deptDAO = new DeptDAO();
        ArrayList<com.multi.q1.DeptVO> list = deptDAO.list();

        for(com.multi.q1.DeptVO vo : list) {
            System.out.println(vo);
            System.out.println("----------------------");
        }
    }


}
