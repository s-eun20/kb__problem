package com.multi.mvc02.web02;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/place")
public class PlaceServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String place1 = request.getParameter("place1");
        String place2 = request.getParameter("place2");
        String place3 = request.getParameter("place3");
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>입력한 가고 싶은 곳</h1>");
        out.println("<br><p>장소 1: "+place1);
        out.println("<br><p>장소 2: "+place2);
        out.println("<br><p>장소 3: "+place3);
        out.close();
    }

}
