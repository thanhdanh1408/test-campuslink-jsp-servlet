package com.danhpiglin.controller;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/student/*")
public class StudentControllerServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String path = request.getPathInfo();
        String jspPage;

        if (path == null || path.equals("/add")) {
            jspPage = "/WEB-INF/views/addStudent.jsp";
        } else if (path.equals("/search")) {
            jspPage = "/WEB-INF/views/searchStudent.jsp";
        } else if (path.equals("/graduationJob")) {
            jspPage = "/WEB-INF/views/searchGraduationJob.jsp";
        } else {
            response.sendError(HttpServletResponse.SC_NOT_FOUND);
            return;
        }

        request.getRequestDispatcher(jspPage).forward(request, response);
    }
}
