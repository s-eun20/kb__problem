package com.multi.mvc01;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CityServlet2 extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public CityServlet2() {
        super();
        System.out.println("CityServlet2 initialized");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");
        String cityName = request.getParameter("cityName");
        String cityPopulation = request.getParameter("cityPopulation");
        response.getWriter().println("<h1>GET request received</h1>");
        response.getWriter().println("City Name: " + cityName + "<br>");
        response.getWriter().println("City Population: " + cityPopulation);
        System.out.println("doGet method called\nCity Name: " + cityName + "\nCity Population: " + cityPopulation);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");
        String cityName = request.getParameter("cityName");
        String cityPopulation = request.getParameter("cityPopulation");
        response.getWriter().println("<h1>POST request received</h1>");
        response.getWriter().println("City Name: " + cityName + "<br>");
        response.getWriter().println("City Population: " + cityPopulation);
        System.out.println("doPost method called\nCity Name: " + cityName + "\nCity Population: " + cityPopulation);
    }
}

