// CityServlet.java
package com.multi.mvc01;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CityServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public CityServlet() {
        super();
        System.out.println("서블릿 초기화");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");
        System.out.println("GET요청 처리됨.");
        response.getWriter().println("servlet run");
    }
}
