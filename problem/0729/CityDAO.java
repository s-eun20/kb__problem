package com.multi.mvc02.web02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class CityDAO {
    public void insertCity(CityVO cityVO) {
        Connection conn = null;
        PreparedStatement ps = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/world";
            String user = "root";
            String password = "1234";

            conn = DriverManager.getConnection(url,user,password);

            String sql = "insert into city (name,countrycode,district,population) values (?,?,?,?)";

            ps = conn.prepareStatement(sql);
            ps.setString(1,cityVO.getName());
            ps.setString(2,cityVO.getCountryCode());
            ps.setString(3,cityVO.getDistrict());
            ps.setInt(4,cityVO.getPopulation());

            ps.executeUpdate();

            ps.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public List<CityVO> list() {
        List<CityVO> list = new ArrayList<>();
        Connection conn = null;
        PreparedStatement ps = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/world";
            String user = "root";
            String password = "1234";

            conn = DriverManager.getConnection(url,user,password);

            String sql = "select * from city";

            ps = conn.prepareStatement(sql);

            ResultSet rs= ps.executeQuery();

            while(rs.next()) {
                CityVO cityVO = new CityVO();
                cityVO.setID(rs.getInt("id"));
                cityVO.setName(rs.getString("name"));
                cityVO.setCountryCode(rs.getString("countrycode"));
                cityVO.setDistrict(rs.getString("district"));
                cityVO.setPopulation(rs.getInt("population"));

                list.add(cityVO);
            }
            rs.close();
            ps.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

}
