package com.multi.mvc02.web02;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/cityinsert")
public class CityServlet3 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");

        String name = request.getParameter("name");
        String code = request.getParameter("code");
        String district = request.getParameter("district");
        int population = Integer.parseInt(request.getParameter("population"));


        CityVO vo = new CityVO();
        CityDAO cityDAO = new CityDAO();

        vo.setName(name);
        vo.setCountryCode(code);
        vo.setDistrict(district);
        vo.setPopulation(population);

        cityDAO.insertCity(vo);

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>데이터 삽입 성공</h1>");
        out.println("<p>삽입된 도시 정보</p>");
        out.println("<br><p>도시 이름 : "+name);
        out.println("<br><p>국가 코드: "+code);
        out.println("<br><p>지역: "+district);
        out.println("<br><p>인구: "+population);
        out.close();

        RequestDispatcher dispatcher = request.getRequestDispatcher("/index.jsp");
        dispatcher.forward(request, response);
    }
}
