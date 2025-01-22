package kz.bitlab.java.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import kz.bitlab.java.database.DBConnector;
import kz.bitlab.java.models.News;

import java.io.IOException;
import java.util.ArrayList;

@WebServlet(value = "")
public class Index extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ArrayList<News> newsList = DBConnector.getAllNews();

        req.setAttribute("newsList", newsList);
        req.getRequestDispatcher("index.jsp").forward(req, resp);
    }

}