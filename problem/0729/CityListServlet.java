package com.multi.mvc02.web02;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/cityList")
public class CityListServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        CityDAO cityDAO = new CityDAO();
        List<CityVO> list = cityDAO.list();

        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>City 전체 목록</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<center>");
        out.println("<h1>City 전체 목록</h1>");

        out.println("<table border='2' cellpadding='0' cellspacing='0' width='700'>");
        out.println("<tr>");
        out.println("<th>ID</th>");
        out.println("<th>도시 이름</th>");
        out.println("<th>국가 코드</th>");
        out.println("<th>지역</th>");
        out.println("<th>인구</th>");
        out.println("</tr>");

        for(CityVO vo : list) {
            out.println("<tr>");
            out.println("<td>"+vo.getID()+"</td>");
            out.println("<td>"+vo.getName()+"</td>");
            out.println("<td>"+vo.getCountryCode()+"</td>");
            out.println("<td>"+vo.getDistrict()+"</td>");
            out.println("<td>"+vo.getPopulation()+"</td>");
            out.println("</tr>");
        }

        out.println("</table>");
        out.println("<br>");
        out.println("</center>");
        out.println("</body>");
        out.println("</html>");

        out.close();

    }






}
