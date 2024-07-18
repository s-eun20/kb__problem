package database;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/shop5";
        String username = "jdbctest";
        String password = "jdbctest";
        try {
            Connection connection= DriverManager.getConnection(jdbcUrl, username, password);
            System.out.println("Database connection established");
            selectEmp(connection);
            System.out.println(selectDept(connection));

        }catch (Exception e){
            System.out.println("Could not establish database connection");
            e.printStackTrace();
        }
    }//main
    public static List<DeptDto> selectDept( Connection connection){
        //연결객체
        StringBuilder sb=new StringBuilder();
        sb.append("select deptno,dname,loc ");
        sb.append("from dept ");
        List<DeptDto> deptList=new ArrayList<DeptDto>();
        try {
            //운반객체
            PreparedStatement preparedStatement= connection.prepareStatement(sb.toString());
            ResultSet resultSet= preparedStatement.executeQuery();
            while(resultSet.next()){
                DeptDto deptDto=new DeptDto();
                deptDto.setDeptno(resultSet.getInt("deptno"));
                deptDto.setDname(resultSet.getString("dname"));
                deptDto.setLoc(resultSet.getString("loc"));
                deptList.add(deptDto);
            }//while
            resultSet.close();
            preparedStatement.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return deptList;
    }
    public static void selectEmp(Connection connection){
        //연결객체
        String sql = "SELECT e.empno, e.ename, e.job, e.mgr, e.hiredate, e.sal, e.comm, e.deptno, d.dname, d.loc " +
                "FROM emp e " +
                "JOIN dept d ON e.deptno = d.deptno";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            System.out.println(sql);
            while(resultSet.next()){
                EmpVO empVO = new EmpVO();
                DeptDto deptDto = new DeptDto();
                empVO.setEmpno(resultSet.getInt("empno"));
                empVO.setEname(resultSet.getString("ename"));
                empVO.setJob(resultSet.getString("job"));
                empVO.setMgr(resultSet.getInt("mgr"));
                empVO.setHiredate(resultSet.getString("hiredate"));
                empVO.setSal(resultSet.getInt("sal"));
                empVO.setComm(resultSet.getInt("comm"));
                empVO.setDeptno(resultSet.getInt("deptno"));
                deptDto.setDname(resultSet.getString("dname"));
                System.out.println(empVO);
                System.out.println(deptDto);
            }


        }catch (Exception e){

        }

    }
}