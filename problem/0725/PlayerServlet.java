package com.multi.mvc01;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/player")
public class PlayerServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public PlayerServlet()  {
        super();
        System.out.println("POST request received in PlayerServlet");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");
        String playerName = request.getParameter("playerName");
        String playerScore = request.getParameter("playerScore");
        response.getWriter().println("<h1>POST request received</h1>");
        response.getWriter().println("Player Name: " + playerName + "<br>");
        response.getWriter().println("Player Score: " + playerScore);
        System.out.println("doGet method called\nPlayer Name: " + playerName + "\nPlayer Population: " + playerScore);
    }
}
