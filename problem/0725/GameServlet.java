package com.multi.mvc01;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/game")
public class GameServlet  extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public GameServlet()  {
        super();
        System.out.println("GET request received in GameServlet");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");
        String gameName = request.getParameter("gameName");
        String gameType = request.getParameter("gameType");
        response.getWriter().println("<h1>GET request received</h1>");
        response.getWriter().println("Game Name: " + gameName + "<br>");
        response.getWriter().println("Game Type: " + gameType);
        System.out.println("doGet method called\nGame Name: " + gameName + "\nGame Type: " + gameType);
    }

}
