package com.multi.q1;

import java.util.ArrayList;

public class DeptListUI {
    public static void main(String[] args) {
        DeptDAO deptDAO = new DeptDAO();
        ArrayList<DeptVO> list = deptDAO.list();

        for(DeptVO vo : list) {
            System.out.println(vo);
            System.out.println("----------------------");
        }
    }


}
