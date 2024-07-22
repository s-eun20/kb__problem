package com.multi.q1;
import java.sql.*;
import java.util.ArrayList;


public class DeptDAO {
    public com.multi.q1.DeptVO one(int deptNo) {
        com.multi.q1.DeptVO deptVO= new com.multi.q1.DeptVO();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/shop5";
            String user = "root";
            String password = "1234";

            Connection conn = DriverManager.getConnection(url,user,password);

            String sql = "select * from dept where deptNo = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1,deptNo);

            ResultSet rs = ps.executeQuery();

            if(rs.next()) {
                String DeptNo = rs.getString("deptno");
                String Dname = rs.getString("dname");
                String Loc = rs.getString("loc");

                deptVO.setDeptNo(DeptNo);
                deptVO.setDname(Dname);
                deptVO.setLoc(Loc);

            }
            rs.close();
            ps.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return deptVO;
    }

    public ArrayList<com.multi.q1.DeptVO> list() {
        ArrayList<com.multi.q1.DeptVO> list = new ArrayList<>();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/shop5";
            String user = "root";
            String password = "1234";

            Connection conn = DriverManager.getConnection(url,user,password);
            String sql = "select * from dept";
            PreparedStatement ps = conn.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while(rs.next()) {
                String DeptNo = rs.getString("deptno");
                String Dname = rs.getString("dname");
                String Loc = rs.getString("loc");

                com.multi.q1.DeptVO deptVO = new com.multi.q1.DeptVO();
                deptVO.setDeptNo(DeptNo);
                deptVO.setDname(Dname);
                deptVO.setLoc(Loc);

                list.add(deptVO);
            }

        } catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }

}
