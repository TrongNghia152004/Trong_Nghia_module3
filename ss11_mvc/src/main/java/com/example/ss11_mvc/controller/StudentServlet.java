package com.example.ss11_mvc.controller;

import com.example.ss11_mvc.model.Student;
import com.example.ss11_mvc.service.IStudentService;
import com.example.ss11_mvc.service.impl.StudentService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "StudentServlet", value = "/student")
public class StudentServlet extends HttpServlet {
    private IStudentService iStudentService = new StudentService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");

        String actionUser = request.getParameter("actionUser");
        if (actionUser == null) {
            actionUser = "";
        }

        switch (actionUser) {
            case "create":
                request.getRequestDispatcher("/view/student/create.jsp").forward(request, response);
                break;
            case "edit":
                int id = Integer.parseInt(request.getParameter("id"));
                Student student = iStudentService.findById(id);
                request.setAttribute("student", student);
                request.getRequestDispatcher("/view/student/edit.jsp").forward(request, response);
                break;
            case "delete":
                id = Integer.parseInt(request.getParameter("deleteId"));
                iStudentService.delete(id);
                response.sendRedirect("/student");
                break;
            default:
                String search = request.getParameter("search");
                request.setAttribute("search", search);
                request.setAttribute("studentList", iStudentService.findAll(search));
                request.getRequestDispatcher("/view/student/list2.jsp").forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");

        String actionUser = request.getParameter("actionUser");
        if (actionUser == null) {
            actionUser = "";
        }

        switch (actionUser) {
            case "create":
                String name = request.getParameter("name");
                double score = Double.parseDouble(request.getParameter("score"));
                Student student = new Student(name, score);
                iStudentService.save(student);

//                request.setAttribute("studentList", iStudentService.findAll());
//                request.getRequestDispatcher("/view/student/list2.jsp").forward(request, response);
                response.sendRedirect("/student"); // request lên lại server
                // Giống như người dùng click vào thẻ a có href="/student"
                break;
        }
    }
}
