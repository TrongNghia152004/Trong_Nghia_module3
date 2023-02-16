package com.example.ss11_mvc.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "CalculatorServlet", value = "/calculator")
public class CalculatorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        double numberFirst = Double.parseDouble(request.getParameter("number-first"));
        double numberSecond = Double.parseDouble(request.getParameter("number-second"));
        String productDescription = request.getParameter("product-description");

//        PrintWriter printWriter = response.getWriter();
//        printWriter.write("<html>");
//        printWriter.write("<body>");
//        printWriter.write("<h2>" + (numberFirst + numberSecond) + "</h2>");
//        printWriter.write("</body>");
//        printWriter.write("</html>");

        double sum = numberFirst + numberSecond;
        // Bước 1: Đưa biến sum
        request.setAttribute("sum", sum);
        request.setAttribute("productDescription", productDescription);
        // Bước 2: Tìm trang ketqua.jsp
        //request.getRequestDispatcher("/index.jsp").forward(request, response);
        response.sendRedirect("https://www.facebook.com/");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
