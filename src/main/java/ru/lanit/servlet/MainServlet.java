package ru.lanit.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MainServlet extends HttpServlet {
    private static final String DEFAULT_NAME = "Человек";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String name = req.getParameter("name");
        if (name == null) {
            name = DEFAULT_NAME;
        }

        req.setAttribute("name", name);
        req.getRequestDispatcher("name.jsp").forward(req, resp);
    }
}
